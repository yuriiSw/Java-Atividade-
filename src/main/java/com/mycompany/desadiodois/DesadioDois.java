
package com.mycompany.desadiodois;
import java.util.Scanner;
public class DesadioDois {
//Cod de  um programa em Java que receba três números via teclado e mostre o resultado das 4 operações matemáticas entre eles.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Desafio 2");
        float n1,n2,n3,soma,subtra,divs,multi;
        //Entrada dos valores
        System.out.print("Digite o numero 1: ");
        n1 =entrada.nextFloat();
        
        System.out.print("Digite o numero 2: ");
        n2 = entrada.nextFloat();
        
        System.out.print("Digete o numero 3: ");
        n3 = entrada.nextFloat();
        
        // Saida com os resultados
        soma = (n1+n2+n3);
        System.out.println("Resultado Soma: " + soma);
        
        subtra =(n1*n2*n3);
        System.out.println("Resultado da Multiplicação: "+ subtra);
        
        divs = (n1/n2/n3);
        System.out.println("Resultado da Divisão: "+divs);
        
        subtra = (n1-n2-n3);
        System.out.println("Resultado da Subtração: " +subtra);
        //Fim
        System.out.println("FIM.");
        
      
        
        
    }
}

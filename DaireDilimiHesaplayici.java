import java.util.Scanner;

public class DaireDilimiHesaplayici {
    public static void main(String[] args) {

        double yariCap,merkezAci,piSayisi=3.14,alan;

        Scanner input= new Scanner(System.in);

        System.out.print("Yarıçapı Giriniz: ");
        yariCap=input.nextDouble();

        System.out.print("Merkez Açıyı Giriniz: ");
        merkezAci=input.nextDouble();

        alan = piSayisi*(yariCap*yariCap)*merkezAci/360;

        System.out.print("Daire Diliminin Alanı "+alan);

    }
}
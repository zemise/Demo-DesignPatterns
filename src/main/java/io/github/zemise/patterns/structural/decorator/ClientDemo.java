package io.github.zemise.patterns.structural.decorator;

public class ClientDemo {
    public static void main(String[] args) {
        Car car = new Benz();
        CarDecorator cd = new ConcreteDecorator(car);

        cd.show();
    }
}

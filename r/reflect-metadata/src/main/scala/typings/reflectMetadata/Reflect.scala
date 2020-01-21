package typings.reflectMetadata

import typings.std.ClassDecorator
import typings.std.MethodDecorator
import typings.std.PropertyDecorator
import typings.std.PropertyDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Reflect")
@js.native
object Reflect extends js.Object {
  /**
    * Applies a set of decorators to a target object.
    * @param decorators An array of decorators.
    * @param target The target object.
    * @returns The result of applying the provided decorators.
    * @remarks Decorators are applied in reverse order of their positions in the array.
    * @example
    *
    *     class Example { }
    *
    *     // constructor
    *     Example = Reflect.decorate(decoratorsArray, Example);
    *
    */
  def decorate(decorators: js.Array[ClassDecorator], target: js.Function): js.Function = js.native
  /**
    * Applies a set of decorators to a property of a target object.
    * @param decorators An array of decorators.
    * @param target The target object.
    * @param targetKey The property key to decorate.
    * @param descriptor A property descriptor
    * @remarks Decorators are applied in reverse order.
    * @example
    *
    *     class Example {
    *         // property declarations are not part of ES6, though they are valid in TypeScript:
    *         // static staticProperty;
    *         // property;
    *
    *         static staticMethod() { }
    *         method() { }
    *     }
    *
    *     // property (on constructor)
    *     Reflect.decorate(decoratorsArray, Example, "staticProperty");
    *
    *     // property (on prototype)
    *     Reflect.decorate(decoratorsArray, Example.prototype, "property");
    *
    *     // method (on constructor)
    *     Object.defineProperty(Example, "staticMethod",
    *         Reflect.decorate(decoratorsArray, Example, "staticMethod",
    *             Object.getOwnPropertyDescriptor(Example, "staticMethod")));
    *
    *     // method (on prototype)
    *     Object.defineProperty(Example.prototype, "method",
    *         Reflect.decorate(decoratorsArray, Example.prototype, "method",
    *             Object.getOwnPropertyDescriptor(Example.prototype, "method")));
    *
    */
  def decorate(decorators: js.Array[PropertyDecorator | MethodDecorator], target: js.Object, targetKey: String): PropertyDescriptor = js.native
  def decorate(
    decorators: js.Array[PropertyDecorator | MethodDecorator],
    target: js.Object,
    targetKey: String,
    descriptor: PropertyDescriptor
  ): PropertyDescriptor = js.native
  def decorate(decorators: js.Array[PropertyDecorator | MethodDecorator], target: js.Object, targetKey: js.Symbol): PropertyDescriptor = js.native
  def decorate(
    decorators: js.Array[PropertyDecorator | MethodDecorator],
    target: js.Object,
    targetKey: js.Symbol,
    descriptor: PropertyDescriptor
  ): PropertyDescriptor = js.native
  /**
    * Define a unique metadata entry on the target.
    * @param metadataKey A key used to store and retrieve metadata.
    * @param metadataValue A value that contains attached metadata.
    * @param target The target object on which to define metadata.
    * @example
    *
    *     class Example {
    *     }
    *
    *     // constructor
    *     Reflect.defineMetadata("custom:annotation", options, Example);
    *
    *     // decorator factory as metadata-producing annotation.
    *     function MyAnnotation(options): ClassDecorator {
    *         return target => Reflect.defineMetadata("custom:annotation", options, target);
    *     }
    *
    */
  def defineMetadata(metadataKey: js.Any, metadataValue: js.Any, target: js.Object): Unit = js.native
  /**
    * Define a unique metadata entry on the target.
    * @param metadataKey A key used to store and retrieve metadata.
    * @param metadataValue A value that contains attached metadata.
    * @param target The target object on which to define metadata.
    * @param targetKey The property key for the target.
    * @example
    *
    *     class Example {
    *         // property declarations are not part of ES6, though they are valid in TypeScript:
    *         // static staticProperty;
    *         // property;
    *
    *         static staticMethod(p) { }
    *         method(p) { }
    *     }
    *
    *     // property (on constructor)
    *     Reflect.defineMetadata("custom:annotation", Number, Example, "staticProperty");
    *
    *     // property (on prototype)
    *     Reflect.defineMetadata("custom:annotation", Number, Example.prototype, "property");
    *
    *     // method (on constructor)
    *     Reflect.defineMetadata("custom:annotation", Number, Example, "staticMethod");
    *
    *     // method (on prototype)
    *     Reflect.defineMetadata("custom:annotation", Number, Example.prototype, "method");
    *
    *     // decorator factory as metadata-producing annotation.
    *     function MyAnnotation(options): PropertyDecorator {
    *         return (target, key) => Reflect.defineMetadata("custom:annotation", options, target, key);
    *     }
    *
    */
  def defineMetadata(metadataKey: js.Any, metadataValue: js.Any, target: js.Object, targetKey: String): Unit = js.native
  def defineMetadata(metadataKey: js.Any, metadataValue: js.Any, target: js.Object, targetKey: js.Symbol): Unit = js.native
  /**
    * Deletes the metadata entry from the target object with the provided key.
    * @param metadataKey A key used to store and retrieve metadata.
    * @param target The target object on which the metadata is defined.
    * @returns `true` if the metadata entry was found and deleted; otherwise, false.
    * @example
    *
    *     class Example {
    *     }
    *
    *     // constructor
    *     result = Reflect.deleteMetadata("custom:annotation", Example);
    *
    */
  def deleteMetadata(metadataKey: js.Any, target: js.Object): Boolean = js.native
  /**
    * Deletes the metadata entry from the target object with the provided key.
    * @param metadataKey A key used to store and retrieve metadata.
    * @param target The target object on which the metadata is defined.
    * @param targetKey The property key for the target.
    * @returns `true` if the metadata entry was found and deleted; otherwise, false.
    * @example
    *
    *     class Example {
    *         // property declarations are not part of ES6, though they are valid in TypeScript:
    *         // static staticProperty;
    *         // property;
    *
    *         static staticMethod(p) { }
    *         method(p) { }
    *     }
    *
    *     // property (on constructor)
    *     result = Reflect.deleteMetadata("custom:annotation", Example, "staticProperty");
    *
    *     // property (on prototype)
    *     result = Reflect.deleteMetadata("custom:annotation", Example.prototype, "property");
    *
    *     // method (on constructor)
    *     result = Reflect.deleteMetadata("custom:annotation", Example, "staticMethod");
    *
    *     // method (on prototype)
    *     result = Reflect.deleteMetadata("custom:annotation", Example.prototype, "method");
    *
    */
  def deleteMetadata(metadataKey: js.Any, target: js.Object, targetKey: String): Boolean = js.native
  def deleteMetadata(metadataKey: js.Any, target: js.Object, targetKey: js.Symbol): Boolean = js.native
  /**
    * Gets the metadata value for the provided metadata key on the target object or its prototype chain.
    * @param metadataKey A key used to store and retrieve metadata.
    * @param target The target object on which the metadata is defined.
    * @returns The metadata value for the metadata key if found; otherwise, `undefined`.
    * @example
    *
    *     class Example {
    *     }
    *
    *     // constructor
    *     result = Reflect.getMetadata("custom:annotation", Example);
    *
    */
  def getMetadata(metadataKey: js.Any, target: js.Object): js.Any = js.native
  /**
    * Gets the metadata value for the provided metadata key on the target object or its prototype chain.
    * @param metadataKey A key used to store and retrieve metadata.
    * @param target The target object on which the metadata is defined.
    * @param targetKey The property key for the target.
    * @returns The metadata value for the metadata key if found; otherwise, `undefined`.
    * @example
    *
    *     class Example {
    *         // property declarations are not part of ES6, though they are valid in TypeScript:
    *         // static staticProperty;
    *         // property;
    *
    *         static staticMethod(p) { }
    *         method(p) { }
    *     }
    *
    *     // property (on constructor)
    *     result = Reflect.getMetadata("custom:annotation", Example, "staticProperty");
    *
    *     // property (on prototype)
    *     result = Reflect.getMetadata("custom:annotation", Example.prototype, "property");
    *
    *     // method (on constructor)
    *     result = Reflect.getMetadata("custom:annotation", Example, "staticMethod");
    *
    *     // method (on prototype)
    *     result = Reflect.getMetadata("custom:annotation", Example.prototype, "method");
    *
    */
  def getMetadata(metadataKey: js.Any, target: js.Object, targetKey: String): js.Any = js.native
  def getMetadata(metadataKey: js.Any, target: js.Object, targetKey: js.Symbol): js.Any = js.native
  /**
    * Gets the metadata keys defined on the target object or its prototype chain.
    * @param target The target object on which the metadata is defined.
    * @returns An array of unique metadata keys.
    * @example
    *
    *     class Example {
    *     }
    *
    *     // constructor
    *     result = Reflect.getMetadataKeys(Example);
    *
    */
  def getMetadataKeys(target: js.Object): js.Array[_] = js.native
  /**
    * Gets the metadata keys defined on the target object or its prototype chain.
    * @param target The target object on which the metadata is defined.
    * @param targetKey The property key for the target.
    * @returns An array of unique metadata keys.
    * @example
    *
    *     class Example {
    *         // property declarations are not part of ES6, though they are valid in TypeScript:
    *         // static staticProperty;
    *         // property;
    *
    *         static staticMethod(p) { }
    *         method(p) { }
    *     }
    *
    *     // property (on constructor)
    *     result = Reflect.getMetadataKeys(Example, "staticProperty");
    *
    *     // property (on prototype)
    *     result = Reflect.getMetadataKeys(Example.prototype, "property");
    *
    *     // method (on constructor)
    *     result = Reflect.getMetadataKeys(Example, "staticMethod");
    *
    *     // method (on prototype)
    *     result = Reflect.getMetadataKeys(Example.prototype, "method");
    *
    */
  def getMetadataKeys(target: js.Object, targetKey: String): js.Array[_] = js.native
  def getMetadataKeys(target: js.Object, targetKey: js.Symbol): js.Array[_] = js.native
  /**
    * Gets the metadata value for the provided metadata key on the target object.
    * @param metadataKey A key used to store and retrieve metadata.
    * @param target The target object on which the metadata is defined.
    * @returns The metadata value for the metadata key if found; otherwise, `undefined`.
    * @example
    *
    *     class Example {
    *     }
    *
    *     // constructor
    *     result = Reflect.getOwnMetadata("custom:annotation", Example);
    *
    */
  def getOwnMetadata(metadataKey: js.Any, target: js.Object): js.Any = js.native
  /**
    * Gets the metadata value for the provided metadata key on the target object.
    * @param metadataKey A key used to store and retrieve metadata.
    * @param target The target object on which the metadata is defined.
    * @param targetKey The property key for the target.
    * @returns The metadata value for the metadata key if found; otherwise, `undefined`.
    * @example
    *
    *     class Example {
    *         // property declarations are not part of ES6, though they are valid in TypeScript:
    *         // static staticProperty;
    *         // property;
    *
    *         static staticMethod(p) { }
    *         method(p) { }
    *     }
    *
    *     // property (on constructor)
    *     result = Reflect.getOwnMetadata("custom:annotation", Example, "staticProperty");
    *
    *     // property (on prototype)
    *     result = Reflect.getOwnMetadata("custom:annotation", Example.prototype, "property");
    *
    *     // method (on constructor)
    *     result = Reflect.getOwnMetadata("custom:annotation", Example, "staticMethod");
    *
    *     // method (on prototype)
    *     result = Reflect.getOwnMetadata("custom:annotation", Example.prototype, "method");
    *
    */
  def getOwnMetadata(metadataKey: js.Any, target: js.Object, targetKey: String): js.Any = js.native
  def getOwnMetadata(metadataKey: js.Any, target: js.Object, targetKey: js.Symbol): js.Any = js.native
  /**
    * Gets the unique metadata keys defined on the target object.
    * @param target The target object on which the metadata is defined.
    * @returns An array of unique metadata keys.
    * @example
    *
    *     class Example {
    *     }
    *
    *     // constructor
    *     result = Reflect.getOwnMetadataKeys(Example);
    *
    */
  def getOwnMetadataKeys(target: js.Object): js.Array[_] = js.native
  /**
    * Gets the unique metadata keys defined on the target object.
    * @param target The target object on which the metadata is defined.
    * @param targetKey The property key for the target.
    * @returns An array of unique metadata keys.
    * @example
    *
    *     class Example {
    *         // property declarations are not part of ES6, though they are valid in TypeScript:
    *         // static staticProperty;
    *         // property;
    *
    *         static staticMethod(p) { }
    *         method(p) { }
    *     }
    *
    *     // property (on constructor)
    *     result = Reflect.getOwnMetadataKeys(Example, "staticProperty");
    *
    *     // property (on prototype)
    *     result = Reflect.getOwnMetadataKeys(Example.prototype, "property");
    *
    *     // method (on constructor)
    *     result = Reflect.getOwnMetadataKeys(Example, "staticMethod");
    *
    *     // method (on prototype)
    *     result = Reflect.getOwnMetadataKeys(Example.prototype, "method");
    *
    */
  def getOwnMetadataKeys(target: js.Object, targetKey: String): js.Array[_] = js.native
  def getOwnMetadataKeys(target: js.Object, targetKey: js.Symbol): js.Array[_] = js.native
  /**
    * Gets a value indicating whether the target object or its prototype chain has the provided metadata key defined.
    * @param metadataKey A key used to store and retrieve metadata.
    * @param target The target object on which the metadata is defined.
    * @returns `true` if the metadata key was defined on the target object or its prototype chain; otherwise, `false`.
    * @example
    *
    *     class Example {
    *     }
    *
    *     // constructor
    *     result = Reflect.hasMetadata("custom:annotation", Example);
    *
    */
  def hasMetadata(metadataKey: js.Any, target: js.Object): Boolean = js.native
  /**
    * Gets a value indicating whether the target object or its prototype chain has the provided metadata key defined.
    * @param metadataKey A key used to store and retrieve metadata.
    * @param target The target object on which the metadata is defined.
    * @param targetKey The property key for the target.
    * @returns `true` if the metadata key was defined on the target object or its prototype chain; otherwise, `false`.
    * @example
    *
    *     class Example {
    *         // property declarations are not part of ES6, though they are valid in TypeScript:
    *         // static staticProperty;
    *         // property;
    *
    *         static staticMethod(p) { }
    *         method(p) { }
    *     }
    *
    *     // property (on constructor)
    *     result = Reflect.hasMetadata("custom:annotation", Example, "staticProperty");
    *
    *     // property (on prototype)
    *     result = Reflect.hasMetadata("custom:annotation", Example.prototype, "property");
    *
    *     // method (on constructor)
    *     result = Reflect.hasMetadata("custom:annotation", Example, "staticMethod");
    *
    *     // method (on prototype)
    *     result = Reflect.hasMetadata("custom:annotation", Example.prototype, "method");
    *
    */
  def hasMetadata(metadataKey: js.Any, target: js.Object, targetKey: String): Boolean = js.native
  def hasMetadata(metadataKey: js.Any, target: js.Object, targetKey: js.Symbol): Boolean = js.native
  /**
    * Gets a value indicating whether the target object has the provided metadata key defined.
    * @param metadataKey A key used to store and retrieve metadata.
    * @param target The target object on which the metadata is defined.
    * @returns `true` if the metadata key was defined on the target object; otherwise, `false`.
    * @example
    *
    *     class Example {
    *     }
    *
    *     // constructor
    *     result = Reflect.hasOwnMetadata("custom:annotation", Example);
    *
    */
  def hasOwnMetadata(metadataKey: js.Any, target: js.Object): Boolean = js.native
  /**
    * Gets a value indicating whether the target object has the provided metadata key defined.
    * @param metadataKey A key used to store and retrieve metadata.
    * @param target The target object on which the metadata is defined.
    * @param targetKey The property key for the target.
    * @returns `true` if the metadata key was defined on the target object; otherwise, `false`.
    * @example
    *
    *     class Example {
    *         // property declarations are not part of ES6, though they are valid in TypeScript:
    *         // static staticProperty;
    *         // property;
    *
    *         static staticMethod(p) { }
    *         method(p) { }
    *     }
    *
    *     // property (on constructor)
    *     result = Reflect.hasOwnMetadata("custom:annotation", Example, "staticProperty");
    *
    *     // property (on prototype)
    *     result = Reflect.hasOwnMetadata("custom:annotation", Example.prototype, "property");
    *
    *     // method (on constructor)
    *     result = Reflect.hasOwnMetadata("custom:annotation", Example, "staticMethod");
    *
    *     // method (on prototype)
    *     result = Reflect.hasOwnMetadata("custom:annotation", Example.prototype, "method");
    *
    */
  def hasOwnMetadata(metadataKey: js.Any, target: js.Object, targetKey: String): Boolean = js.native
  def hasOwnMetadata(metadataKey: js.Any, target: js.Object, targetKey: js.Symbol): Boolean = js.native
  /**
    * A default metadata decorator factory that can be used on a class, class member, or parameter.
    * @param metadataKey The key for the metadata entry.
    * @param metadataValue The value for the metadata entry.
    * @returns A decorator function.
    * @remarks
    * If `metadataKey` is already defined for the target and target key, the
    * metadataValue for that key will be overwritten.
    * @example
    *
    *     // constructor
    *     @Reflect.metadata(key, value)
    *     class Example {
    *     }
    *
    *     // property (on constructor, TypeScript only)
    *     class Example {
    *         @Reflect.metadata(key, value)
    *         static staticProperty;
    *     }
    *
    *     // property (on prototype, TypeScript only)
    *     class Example {
    *         @Reflect.metadata(key, value)
    *         property;
    *     }
    *
    *     // method (on constructor)
    *     class Example {
    *         @Reflect.metadata(key, value)
    *         static staticMethod() { }
    *     }
    *
    *     // method (on prototype)
    *     class Example {
    *         @Reflect.metadata(key, value)
    *         method() { }
    *     }
    *
    */
  def metadata(metadataKey: js.Any, metadataValue: js.Any): FnTarget = js.native
}


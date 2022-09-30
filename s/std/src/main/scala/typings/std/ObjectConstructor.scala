package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectConstructor
  extends StObject
     with /* standard es5 */
Instantiable0[js.Object]
     with Instantiable1[/* value */ Any, js.Object] {
  
  /* standard es5 */
  def apply(): Any = js.native
  /* standard es5 */
  def apply(value: Any): Any = js.native
  
  /**
    * Copy the values of all of the enumerable own properties from one or more source objects to a
    * target object. Returns the target object.
    * @param target The target object to copy to.
    * @param sources One or more source objects from which to copy properties
    */
  /* standard es2015.core */
  def assign(target: js.Object, sources: Any*): Any = js.native
  /**
    * Copy the values of all of the enumerable own properties from one or more source objects to a
    * target object. Returns the target object.
    * @param target The target object to copy to.
    * @param source The source object from which to copy properties.
    */
  /* standard es2015.core */
  def assign[T /* <: js.Object */, U](target: T, source: U): T & U = js.native
  /**
    * Copy the values of all of the enumerable own properties from one or more source objects to a
    * target object. Returns the target object.
    * @param target The target object to copy to.
    * @param source1 The first source object from which to copy properties.
    * @param source2 The second source object from which to copy properties.
    */
  /* standard es2015.core */
  def assign[T /* <: js.Object */, U, V](target: T, source1: U, source2: V): T & U & V = js.native
  /**
    * Copy the values of all of the enumerable own properties from one or more source objects to a
    * target object. Returns the target object.
    * @param target The target object to copy to.
    * @param source1 The first source object from which to copy properties.
    * @param source2 The second source object from which to copy properties.
    * @param source3 The third source object from which to copy properties.
    */
  /* standard es2015.core */
  def assign[T /* <: js.Object */, U, V, W](target: T, source1: U, source2: V, source3: W): T & U & V & W = js.native
  
  /**
    * Creates an object that has the specified prototype or that has null prototype.
    * @param o Object to use as a prototype. May be null.
    */
  /* standard es5 */
  def create(): Any = js.native
  def create(o: js.Object): Any = js.native
  /**
    * Creates an object that has the specified prototype, and that optionally contains specified properties.
    * @param o Object to use as a prototype. May be null
    * @param properties JavaScript object that contains one or more property descriptors.
    */
  /* standard es5 */
  def create(o: js.Object, properties: PropertyDescriptorMap & ThisType[Any]): Any = js.native
  def create(o: Null, properties: PropertyDescriptorMap & ThisType[Any]): Any = js.native
  
  /**
    * Adds one or more properties to an object, and/or modifies attributes of existing properties.
    * @param o Object on which to add or modify the properties. This can be a native JavaScript object or a DOM object.
    * @param properties JavaScript object that contains one or more descriptor objects. Each descriptor object describes a data property or an accessor property.
    */
  /* standard es5 */
  def defineProperties[T](o: T, properties: PropertyDescriptorMap & ThisType[Any]): T = js.native
  
  /**
    * Adds a property to an object, or modifies attributes of an existing property.
    * @param o Object on which to add or modify the property. This can be a native JavaScript object (that is, a user-defined object or a built in object) or a DOM object.
    * @param p The property name.
    * @param attributes Descriptor for the property. It can be for a data property or an accessor property.
    */
  /* standard es5 */
  def defineProperty[T](o: T, p: PropertyKey, attributes: js.PropertyDescriptor & ThisType[Any]): T = js.native
  
  /**
    * Returns an array of key/values of the enumerable properties of an object
    * @param o Object that contains the properties and methods. This can be an object that you created or an existing Document Object Model (DOM) object.
    */
  /* standard es2017.object */
  def entries(o: js.Object): js.Array[js.Tuple2[java.lang.String, Any]] = js.native
  /**
    * Returns an array of key/values of the enumerable properties of an object
    * @param o Object that contains the properties and methods. This can be an object that you created or an existing Document Object Model (DOM) object.
    */
  /* standard es2017.object */
  def entries[T](o: /* standard es2017.object */
  StringDictionary[T]): js.Array[js.Tuple2[java.lang.String, T]] = js.native
  def entries[T](o: ArrayLike[T]): js.Array[js.Tuple2[java.lang.String, T]] = js.native
  
  /**
    * Prevents the modification of existing property attributes and values, and prevents the addition of new properties.
    * @param a Object on which to lock the attributes.
    */
  /* standard es5 */
  def freeze[T](a: js.Array[T]): js.Array[T] = js.native
  /**
    * Prevents the modification of existing property attributes and values, and prevents the addition of new properties.
    * @param f Object on which to lock the attributes.
    */
  /* standard es5 */
  /**
    * Prevents the modification of existing property attributes and values, and prevents the addition of new properties.
    * @param o Object on which to lock the attributes.
    */
  def freeze[T /* <: js.Function */](f: T): T = js.native
  /**
    * Prevents the modification of existing property attributes and values, and prevents the addition of new properties.
    * @param o Object on which to lock the attributes.
    */
  /* standard es5 */
  @JSName("freeze")
  def freeze_TU[T /* <: /* standard es5 */
  StringDictionary[js.UndefOr[U | Null | js.Object]] */, U /* <: java.lang.String | js.BigInt | Double | scala.Boolean | js.Symbol */](o: T): T = js.native
  
  /**
    * Returns an object created by key-value entries for properties and methods
    * @param entries An iterable object that contains key-value entries for properties and methods.
    */
  /* standard es2019.object */
  def fromEntries(entries: js.Iterable[js.Array[Any]]): Any = js.native
  /**
    * Returns an object created by key-value entries for properties and methods
    * @param entries An iterable object that contains key-value entries for properties and methods.
    */
  /* standard es2019.object */
  @JSName("fromEntries")
  def fromEntries_T_StringDictionary[T](entries: js.Iterable[js.Tuple2[PropertyKey, T]]): /* standard es2019.object */
  StringDictionary[T] = js.native
  
  /**
    * Gets the own property descriptor of the specified object.
    * An own property descriptor is one that is defined directly on the object and is not inherited from the object's prototype.
    * @param o Object that contains the property.
    * @param p Name of the property.
    */
  /* standard es5 */
  def getOwnPropertyDescriptor(o: Any, p: PropertyKey): js.UndefOr[js.PropertyDescriptor] = js.native
  
  /**
    * Returns an object containing all own property descriptors of an object
    * @param o Object that contains the properties and methods. This can be an object that you created or an existing Document Object Model (DOM) object.
    */
  /* standard es2017.object */
  def getOwnPropertyDescriptors[T](o: T): typings.std.stdStrings.ObjectConstructor & TopLevel[T] & (/* standard es2017.object */
  StringDictionary[js.PropertyDescriptor]) = js.native
  
  /**
    * Returns the names of the own properties of an object. The own properties of an object are those that are defined directly
    * on that object, and are not inherited from the object's prototype. The properties of an object include both fields (objects) and functions.
    * @param o Object that contains the own properties.
    */
  /* standard es5 */
  def getOwnPropertyNames(o: Any): js.Array[java.lang.String] = js.native
  
  /**
    * Returns an array of all symbol properties found directly on object o.
    * @param o Object to retrieve the symbols from.
    */
  /* standard es2015.core */
  def getOwnPropertySymbols(o: Any): js.Array[js.Symbol] = js.native
  
  /**
    * Returns the prototype of an object.
    * @param o The object that references the prototype.
    */
  /* standard es5 */
  def getPrototypeOf(o: Any): Any = js.native
  
  /**
    * Determines whether an object has a property with the specified name.
    * @param o An object.
    * @param v A property name.
    */
  /* standard es2022.object */
  def hasOwn(o: js.Object, v: PropertyKey): scala.Boolean = js.native
  
  /**
    * Returns true if the values are the same value, false otherwise.
    * @param value1 The first value.
    * @param value2 The second value.
    */
  /* standard es2015.core */
  def is(value1: Any, value2: Any): scala.Boolean = js.native
  
  /**
    * Returns a value that indicates whether new properties can be added to an object.
    * @param o Object to test.
    */
  /* standard es5 */
  def isExtensible(o: Any): scala.Boolean = js.native
  
  /**
    * Returns true if existing property attributes and values cannot be modified in an object, and new properties cannot be added to the object.
    * @param o Object to test.
    */
  /* standard es5 */
  def isFrozen(o: Any): scala.Boolean = js.native
  
  /**
    * Returns true if existing property attributes cannot be modified in an object and new properties cannot be added to the object.
    * @param o Object to test.
    */
  /* standard es5 */
  def isSealed(o: Any): scala.Boolean = js.native
  
  /**
    * Returns the names of the enumerable string properties and methods of an object.
    * @param o Object that contains the properties and methods. This can be an object that you created or an existing Document Object Model (DOM) object.
    */
  /* standard es2015.core */
  def keys(o: js.Object): js.Array[java.lang.String] = js.native
  
  /**
    * Prevents the addition of new properties to an object.
    * @param o Object to make non-extensible.
    */
  /* standard es5 */
  def preventExtensions[T](o: T): T = js.native
  
  /**
    * Prevents the modification of attributes of existing properties, and prevents the addition of new properties.
    * @param o Object on which to lock the attributes.
    */
  /* standard es5 */
  def seal[T](o: T): T = js.native
  
  /**
    * Sets the prototype of a specified object o to object proto or null. Returns the object o.
    * @param o The object to change its prototype.
    * @param proto The value of the new prototype or null.
    */
  /* standard es2015.core */
  def setPrototypeOf(o: Any): Any = js.native
  def setPrototypeOf(o: Any, proto: js.Object): Any = js.native
  
  /**
    * Returns an array of values of the enumerable properties of an object
    * @param o Object that contains the properties and methods. This can be an object that you created or an existing Document Object Model (DOM) object.
    */
  /* standard es2017.object */
  def values(o: js.Object): js.Array[Any] = js.native
  /**
    * Returns an array of values of the enumerable properties of an object
    * @param o Object that contains the properties and methods. This can be an object that you created or an existing Document Object Model (DOM) object.
    */
  /* standard es2017.object */
  def values[T](o: /* standard es2017.object */
  StringDictionary[T]): js.Array[T] = js.native
  def values[T](o: ArrayLike[T]): js.Array[T] = js.native
}

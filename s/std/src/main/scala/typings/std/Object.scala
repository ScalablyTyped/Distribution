package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object extends js.Object {
  /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
  var constructor: js.Function
  /**
    * Determines whether an object has a property with the specified name.
    * @param v A property name.
    */
  def hasOwnProperty(v: PropertyKey): scala.Boolean
  /**
    * Determines whether a specified property is enumerable.
    * @param v A property name.
    */
  def propertyIsEnumerable(v: PropertyKey): scala.Boolean
}

@JSGlobal("Object")
@js.native
class ObjectCls () extends Object {
  def this(value: js.Any) = this()
  /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
  /* CompleteClass */
  override var constructor: js.Function = js.native
  /**
    * Determines whether an object has a property with the specified name.
    * @param v A property name.
    */
  /* CompleteClass */
  override def hasOwnProperty(v: PropertyKey): scala.Boolean = js.native
  /**
    * Determines whether a specified property is enumerable.
    * @param v A property name.
    */
  /* CompleteClass */
  override def propertyIsEnumerable(v: PropertyKey): scala.Boolean = js.native
}

object Object {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => scala.Boolean,
    isPrototypeOf: js.Object => scala.Boolean,
    propertyIsEnumerable: PropertyKey => scala.Boolean,
    toLocaleString: () => java.lang.String,
    toString: () => java.lang.String,
    valueOf: () => js.Object
  ): Object = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), isPrototypeOf = js.Any.fromFunction1(isPrototypeOf), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), toLocaleString = js.Any.fromFunction0(toLocaleString), toString = js.Any.fromFunction0(toString), valueOf = js.Any.fromFunction0(valueOf))
  
    __obj.asInstanceOf[Object]
  }
}


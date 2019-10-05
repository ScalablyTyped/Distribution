package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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


package typings.std.global

import org.scalablytyped.runtime.TopLevel
import typings.std.ObjectConstructor
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Object")
@js.native
class Object ()
  extends typings.std.Object {
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

/**
  * Provides functionality common to all JavaScript objects.
  */
@JSGlobal("Object")
@js.native
object Object extends TopLevel[ObjectConstructor]


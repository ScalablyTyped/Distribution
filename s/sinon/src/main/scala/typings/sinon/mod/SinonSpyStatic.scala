package typings.sinon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SinonSpyStatic extends js.Object {
  /**
    * Creates an anonymous function that records arguments, this value, exceptions and return values for all calls.
    */
  def apply(): SinonSpy = js.native
  /**
    * Spies on the provided function
    */
  def apply(func: js.Function): SinonSpy = js.native
  /**
    * Creates a spy for object.method and replaces the original method with the spy.
    * An exception is thrown if the property is not already a function.
    * The spy acts exactly like the original method in all cases.
    * The original method can be restored by calling object.method.restore().
    * The returned spy is the function object which replaced the original method. spy === object.method.
    */
  def apply[T](obj: T, method: /* keyof T */ String): SinonSpy = js.native
  def apply[T](obj: T, method: /* keyof T */ String, types: js.Array[String]): SinonSpy = js.native
}


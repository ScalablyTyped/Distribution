package typings
package simpleDashMockLib.simpleDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spy[T] extends js.Object {
  /**
    * Number of times the function was called.
    */
  var callCount: scala.Double = js.native
  var called: scala.Boolean = js.native
  var calls: js.Array[Calls[T]] = js.native
  var firstCall: Calls[T] = js.native
  /**
    * The last call object. (This is often also the first and only call.)
    */
  var lastCall: Calls[T] = js.native
  def apply(args: js.Any*): T = js.native
  /**
    * Resets all counts and properties to the original state.
    */
  def reset(): scala.Unit = js.native
}


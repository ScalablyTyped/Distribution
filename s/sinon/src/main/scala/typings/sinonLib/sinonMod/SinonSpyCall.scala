package typings
package sinonLib.sinonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SinonSpyCall extends SinonSpyCallApi {
  /**
    * This property is a convenience for a call’s callback.
    * When the last argument in a call is a Function, then callback will reference that. Otherwise it will be undefined.
    */
  var callback: js.UndefOr[js.Function] = js.native
  /**
    * Exception thrown, if any.
    */
  var exception: js.Any = js.native
  /**
    * This property is a convenience for the last argument of the call.
    */
  var lastArg: js.Any = js.native
  /**
    * Return value.
    */
  var returnValue: js.Any = js.native
  /**
    * The call’s this value.
    */
  var thisValue: js.Any = js.native
  /**
    * Returns true if the spy call occurred after another spy call.
    * @param call
    */
  def calledAfter(call: SinonSpyCall): scala.Boolean = js.native
  /**
    * Returns true if the spy call occurred before another spy call.
    * @param call
    */
  def calledBefore(call: SinonSpyCall): scala.Boolean = js.native
}


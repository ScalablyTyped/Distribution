package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomFilterParameters[Params /* <: js.Object */] extends js.Object {
  var callbackParameters: Params
  def callback(cell: js.Any, params: Params): scala.Boolean
}

object CustomFilterParameters {
  @scala.inline
  def apply[Params /* <: js.Object */](callback: (js.Any, Params) => scala.Boolean, callbackParameters: Params): CustomFilterParameters[Params] = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), callbackParameters = callbackParameters.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomFilterParameters[Params]]
  }
}


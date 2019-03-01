package typings
package reactDashRouterDashReduxLib.reactDashRouterDashReduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterAction extends js.Object {
  var payload: LocationActionPayload
  var `type`: reactDashRouterDashReduxLib.reactDashRouterDashReduxLibStrings.`@@router/CALL_HISTORY_METHOD`
}

object RouterAction {
  @scala.inline
  def apply(
    payload: LocationActionPayload,
    `type`: reactDashRouterDashReduxLib.reactDashRouterDashReduxLibStrings.`@@router/CALL_HISTORY_METHOD`
  ): RouterAction = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("payload")(payload)
    __obj.asInstanceOf[RouterAction]
  }
}


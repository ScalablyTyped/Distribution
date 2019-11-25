package typings.reactDashRouterDashRedux.reactDashRouterDashReduxMod

import typings.reactDashRouterDashRedux.reactDashRouterDashReduxStrings.`@@router/CALL_HISTORY_METHOD`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterAction extends js.Object {
  var payload: LocationActionPayload
  var `type`: `@@router/CALL_HISTORY_METHOD`
}

object RouterAction {
  @scala.inline
  def apply(payload: LocationActionPayload, `type`: `@@router/CALL_HISTORY_METHOD`): RouterAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterAction]
  }
}


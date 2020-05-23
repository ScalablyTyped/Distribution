package typings.reactRouterRedux.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterAction extends js.Object {
  var payload: LocationActionPayload
  var `type`: /* "@@router/CALL_HISTORY_METHOD" */ String
}

object RouterAction {
  @scala.inline
  def apply(payload: LocationActionPayload, `type`: /* "@@router/CALL_HISTORY_METHOD" */ String): RouterAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterAction]
  }
}


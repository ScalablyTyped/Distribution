package typings.reduxLittleRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushAction extends RouterActions {
  var payload: Location
  var `type`: /* "ROUTER_PUSH" */ String
}

object PushAction {
  @scala.inline
  def apply(payload: Location, `type`: /* "ROUTER_PUSH" */ String): PushAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushAction]
  }
}


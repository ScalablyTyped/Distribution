package typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod

import typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterStrings.ROUTER_PUSH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushAction extends RouterActions {
  var payload: Location
  var `type`: ROUTER_PUSH
}

object PushAction {
  @scala.inline
  def apply(payload: Location, `type`: ROUTER_PUSH): PushAction = {
    val __obj = js.Dynamic.literal(payload = payload)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PushAction]
  }
}


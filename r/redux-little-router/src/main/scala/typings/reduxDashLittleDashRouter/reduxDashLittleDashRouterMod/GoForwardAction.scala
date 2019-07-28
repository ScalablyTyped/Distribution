package typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod

import typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterStrings.ROUTER_GO_FORWARD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoForwardAction extends RouterActions {
  var `type`: ROUTER_GO_FORWARD
}

object GoForwardAction {
  @scala.inline
  def apply(`type`: ROUTER_GO_FORWARD): GoForwardAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GoForwardAction]
  }
}


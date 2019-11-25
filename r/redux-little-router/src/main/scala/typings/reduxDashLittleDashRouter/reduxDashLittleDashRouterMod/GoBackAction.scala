package typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod

import typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterStrings.ROUTER_GO_BACK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoBackAction extends RouterActions {
  var `type`: ROUTER_GO_BACK
}

object GoBackAction {
  @scala.inline
  def apply(`type`: ROUTER_GO_BACK): GoBackAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoBackAction]
  }
}


package typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod

import typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterStrings.ROUTER_GO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoAction extends RouterActions {
  var payload: Double
  var `type`: ROUTER_GO
}

object GoAction {
  @scala.inline
  def apply(payload: Double, `type`: ROUTER_GO): GoAction = {
    val __obj = js.Dynamic.literal(payload = payload)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GoAction]
  }
}


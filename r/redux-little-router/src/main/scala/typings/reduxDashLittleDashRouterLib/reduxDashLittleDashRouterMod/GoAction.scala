package typings
package reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoAction extends RouterActions {
  var payload: scala.Double
  var `type`: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterLibStrings.ROUTER_GO
}

object GoAction {
  @scala.inline
  def apply(
    payload: scala.Double,
    `type`: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterLibStrings.ROUTER_GO
  ): GoAction = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("payload")(payload)
    __obj.asInstanceOf[GoAction]
  }
}


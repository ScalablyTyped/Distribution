package typings
package reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceRoutesAction extends RouterActions {
  var payload: reduxDashLittleDashRouterLib.Anon_Options
  var `type`: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterLibStrings.ROUTER_REPLACE_ROUTES
}

object ReplaceRoutesAction {
  @scala.inline
  def apply(
    payload: reduxDashLittleDashRouterLib.Anon_Options,
    `type`: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterLibStrings.ROUTER_REPLACE_ROUTES
  ): ReplaceRoutesAction = {
    val __obj = js.Dynamic.literal(payload = payload)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReplaceRoutesAction]
  }
}


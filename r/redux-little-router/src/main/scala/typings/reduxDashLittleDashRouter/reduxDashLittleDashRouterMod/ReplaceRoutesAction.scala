package typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod

import typings.reduxDashLittleDashRouter.Anon_Options
import typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterStrings.ROUTER_REPLACE_ROUTES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceRoutesAction extends RouterActions {
  var payload: Anon_Options
  var `type`: ROUTER_REPLACE_ROUTES
}

object ReplaceRoutesAction {
  @scala.inline
  def apply(payload: Anon_Options, `type`: ROUTER_REPLACE_ROUTES): ReplaceRoutesAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceRoutesAction]
  }
}


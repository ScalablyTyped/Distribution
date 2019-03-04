package typings
package reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoBackAction extends RouterActions {
  var `type`: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterLibStrings.ROUTER_GO_BACK
}

object GoBackAction {
  @scala.inline
  def apply(`type`: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterLibStrings.ROUTER_GO_BACK): GoBackAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GoBackAction]
  }
}


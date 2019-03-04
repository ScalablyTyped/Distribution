package typings
package reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoForwardAction extends RouterActions {
  var `type`: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterLibStrings.ROUTER_GO_FORWARD
}

object GoForwardAction {
  @scala.inline
  def apply(`type`: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterLibStrings.ROUTER_GO_FORWARD): GoForwardAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GoForwardAction]
  }
}


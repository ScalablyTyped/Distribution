package typings
package reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockAction extends RouterActions {
  var payload: BlockCallback
  var `type`: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterLibStrings.ROUTER_BLOCK
}

object BlockAction {
  @scala.inline
  def apply(
    payload: BlockCallback,
    `type`: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterLibStrings.ROUTER_BLOCK
  ): BlockAction = {
    val __obj = js.Dynamic.literal(payload = payload)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BlockAction]
  }
}


package typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod

import typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterStrings.ROUTER_BLOCK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockAction extends RouterActions {
  var payload: BlockCallback
  var `type`: ROUTER_BLOCK
}

object BlockAction {
  @scala.inline
  def apply(payload: BlockCallback, `type`: ROUTER_BLOCK): BlockAction = {
    val __obj = js.Dynamic.literal(payload = payload)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BlockAction]
  }
}


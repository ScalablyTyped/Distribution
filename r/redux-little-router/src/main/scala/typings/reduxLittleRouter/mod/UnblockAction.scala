package typings.reduxLittleRouter.mod

import typings.reduxLittleRouter.reduxLittleRouterStrings.ROUTER_UNBLOCK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnblockAction extends RouterActions {
  var `type`: ROUTER_UNBLOCK
}

object UnblockAction {
  @scala.inline
  def apply(`type`: ROUTER_UNBLOCK): UnblockAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnblockAction]
  }
}


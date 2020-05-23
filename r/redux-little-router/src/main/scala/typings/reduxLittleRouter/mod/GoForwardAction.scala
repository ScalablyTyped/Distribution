package typings.reduxLittleRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoForwardAction extends RouterActions {
  var `type`: /* "ROUTER_GO_FORWARD" */ String
}

object GoForwardAction {
  @scala.inline
  def apply(`type`: /* "ROUTER_GO_FORWARD" */ String): GoForwardAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoForwardAction]
  }
}


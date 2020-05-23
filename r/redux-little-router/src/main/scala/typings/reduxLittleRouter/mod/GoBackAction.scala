package typings.reduxLittleRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoBackAction extends RouterActions {
  var `type`: /* "ROUTER_GO_BACK" */ String
}

object GoBackAction {
  @scala.inline
  def apply(`type`: /* "ROUTER_GO_BACK" */ String): GoBackAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoBackAction]
  }
}


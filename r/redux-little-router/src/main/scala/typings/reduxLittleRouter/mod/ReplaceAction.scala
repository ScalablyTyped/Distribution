package typings.reduxLittleRouter.mod

import typings.reduxLittleRouter.reduxLittleRouterStrings.ROUTER_REPLACE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceAction extends RouterActions {
  var payload: Location
  var `type`: ROUTER_REPLACE
}

object ReplaceAction {
  @scala.inline
  def apply(payload: Location, `type`: ROUTER_REPLACE): ReplaceAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceAction]
  }
}


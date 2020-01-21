package typings.reduxLittleRouter.mod

import typings.reduxLittleRouter.reduxLittleRouterStrings.ROUTER_LOCATION_CHANGED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationChangedAction extends RouterActions {
  var payload: Location
  var `type`: ROUTER_LOCATION_CHANGED
}

object LocationChangedAction {
  @scala.inline
  def apply(payload: Location, `type`: ROUTER_LOCATION_CHANGED): LocationChangedAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationChangedAction]
  }
}


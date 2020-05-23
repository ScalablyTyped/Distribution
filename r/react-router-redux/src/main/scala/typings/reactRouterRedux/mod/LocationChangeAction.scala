package typings.reactRouterRedux.mod

import typings.reactRouterRedux.anon.LocationLocationStateprop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationChangeAction extends js.Object {
  var payload: LocationLocationStateprop
  var `type`: /* "@@router/LOCATION_CHANGE" */ String
}

object LocationChangeAction {
  @scala.inline
  def apply(payload: LocationLocationStateprop, `type`: /* "@@router/LOCATION_CHANGE" */ String): LocationChangeAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationChangeAction]
  }
}


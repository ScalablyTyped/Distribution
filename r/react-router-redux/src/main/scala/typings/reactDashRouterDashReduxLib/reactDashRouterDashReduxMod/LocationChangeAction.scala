package typings
package reactDashRouterDashReduxLib.reactDashRouterDashReduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationChangeAction extends js.Object {
  var payload: historyLib.historyMod.Location[historyLib.historyMod.LocationState] with reactDashRouterDashReduxLib.Anon_Props
  var `type`: reactDashRouterDashReduxLib.reactDashRouterDashReduxLibStrings.`@@router/LOCATION_CHANGE`
}

object LocationChangeAction {
  @scala.inline
  def apply(
    payload: historyLib.historyMod.Location[historyLib.historyMod.LocationState] with reactDashRouterDashReduxLib.Anon_Props,
    `type`: reactDashRouterDashReduxLib.reactDashRouterDashReduxLibStrings.`@@router/LOCATION_CHANGE`
  ): LocationChangeAction = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("payload")(payload)
    __obj.asInstanceOf[LocationChangeAction]
  }
}


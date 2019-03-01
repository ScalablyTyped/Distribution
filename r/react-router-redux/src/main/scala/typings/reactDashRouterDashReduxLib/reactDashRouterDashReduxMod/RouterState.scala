package typings
package reactDashRouterDashReduxLib.reactDashRouterDashReduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterState extends js.Object {
  var location: historyLib.historyMod.Location[historyLib.historyMod.LocationState] | scala.Null
}

object RouterState {
  @scala.inline
  def apply(location: historyLib.historyMod.Location[historyLib.historyMod.LocationState] = null): RouterState = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[RouterState]
  }
}


package typings.reactDashRouterDashRedux.reactDashRouterDashReduxMod

import typings.history.historyMod.Location
import typings.history.historyMod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterState extends js.Object {
  var location: Location[LocationState] | Null
}

object RouterState {
  @scala.inline
  def apply(location: Location[LocationState] = null): RouterState = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterState]
  }
}


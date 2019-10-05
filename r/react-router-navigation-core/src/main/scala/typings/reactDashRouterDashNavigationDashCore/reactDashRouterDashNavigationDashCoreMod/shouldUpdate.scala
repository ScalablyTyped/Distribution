package typings.reactDashRouterDashNavigationDashCore.reactDashRouterDashNavigationDashCoreMod

import typings.history.historyMod.Location
import typings.history.historyMod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-navigation-core", "shouldUpdate")
@js.native
object shouldUpdate extends js.Object {
  def apply(
    currentItem: RouteProps,
    nextItem: RouteProps,
    currentLocation: Location[LocationState],
    nextLocation: Location[LocationState]
  ): Boolean = js.native
}


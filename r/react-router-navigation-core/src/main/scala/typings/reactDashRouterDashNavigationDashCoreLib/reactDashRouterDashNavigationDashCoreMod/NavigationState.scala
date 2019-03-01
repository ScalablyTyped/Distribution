package typings
package reactDashRouterDashNavigationDashCoreLib.reactDashRouterDashNavigationDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationState[OwnRoute] extends js.Object {
  var index: scala.Double
  var routes: js.Array[Route[js.Object] with OwnRoute]
}

object NavigationState {
  @scala.inline
  def apply[OwnRoute](index: scala.Double, routes: js.Array[Route[js.Object] with OwnRoute]): NavigationState[OwnRoute] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("routes")(routes)
    __obj.asInstanceOf[NavigationState[OwnRoute]]
  }
}


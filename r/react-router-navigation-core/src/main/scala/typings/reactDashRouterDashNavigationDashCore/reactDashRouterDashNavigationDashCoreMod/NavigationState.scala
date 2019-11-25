package typings.reactDashRouterDashNavigationDashCore.reactDashRouterDashNavigationDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationState[OwnRoute] extends js.Object {
  var index: Double
  var routes: js.Array[Route[js.Object] with OwnRoute]
}

object NavigationState {
  @scala.inline
  def apply[OwnRoute](index: Double, routes: js.Array[Route[js.Object] with OwnRoute]): NavigationState[OwnRoute] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NavigationState[OwnRoute]]
  }
}


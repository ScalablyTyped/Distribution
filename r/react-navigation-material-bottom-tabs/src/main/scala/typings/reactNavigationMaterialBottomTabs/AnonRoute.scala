package typings.reactNavigationMaterialBottomTabs

import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRoute extends js.Object {
  var route: NavigationRoute[NavigationParams]
}

object AnonRoute {
  @scala.inline
  def apply(route: NavigationRoute[NavigationParams]): AnonRoute = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRoute]
  }
}


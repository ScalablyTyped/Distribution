package typings.reactNavigationMaterialBottomTabs.anon

import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends js.Object {
  var route: NavigationRoute[NavigationParams]
}

object Route {
  @scala.inline
  def apply(route: NavigationRoute[NavigationParams]): Route = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
}


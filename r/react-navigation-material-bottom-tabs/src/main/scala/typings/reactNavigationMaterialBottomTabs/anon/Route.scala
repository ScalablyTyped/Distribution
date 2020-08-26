package typings.reactNavigationMaterialBottomTabs.anon

import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Route extends js.Object {
  var route: NavigationRoute[NavigationParams] = js.native
}

object Route {
  @scala.inline
  def apply(route: NavigationRoute[NavigationParams]): Route = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
  @scala.inline
  implicit class RouteOps[Self <: Route] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRoute(value: NavigationRoute[NavigationParams]): Self = this.set("route", value.asInstanceOf[js.Any])
  }
  
}


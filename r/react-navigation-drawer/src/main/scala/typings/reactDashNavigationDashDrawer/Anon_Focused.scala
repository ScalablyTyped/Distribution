package typings.reactDashNavigationDashDrawer

import typings.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typings.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Focused extends js.Object {
  var focused: Boolean
  var route: NavigationRoute[NavigationParams]
}

object Anon_Focused {
  @scala.inline
  def apply(focused: Boolean, route: NavigationRoute[NavigationParams]): Anon_Focused = {
    val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Focused]
  }
}


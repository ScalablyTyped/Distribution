package typings.reactNavigationDrawer

import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFocused extends js.Object {
  var focused: Boolean
  var route: NavigationRoute[NavigationParams]
}

object AnonFocused {
  @scala.inline
  def apply(focused: Boolean, route: NavigationRoute[NavigationParams]): AnonFocused = {
    val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFocused]
  }
}


package typings.reactNavigationDrawer.anon

import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Focused extends js.Object {
  var focused: Boolean
  var route: NavigationRoute[NavigationParams]
}

object Focused {
  @scala.inline
  def apply(focused: Boolean, route: NavigationRoute[NavigationParams]): Focused = {
    val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Focused]
  }
}


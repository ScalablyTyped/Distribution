package typings.reactNavigationDrawer.anon

import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Focused extends js.Object {
  var focused: Boolean = js.native
  var route: NavigationRoute[NavigationParams] = js.native
}

object Focused {
  @scala.inline
  def apply(focused: Boolean, route: NavigationRoute[NavigationParams]): Focused = {
    val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Focused]
  }
  @scala.inline
  implicit class FocusedOps[Self <: Focused] (val x: Self) extends AnyVal {
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
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoute(value: NavigationRoute[NavigationParams]): Self = this.set("route", value.asInstanceOf[js.Any])
  }
  
}


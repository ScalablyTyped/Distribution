package typings.reactNavigationDrawer.typesMod

import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scene extends js.Object {
  var focused: Boolean = js.native
  var index: Double = js.native
  var route: NavigationRoute[NavigationParams] = js.native
  var tintColor: js.UndefOr[String] = js.native
}

object Scene {
  @scala.inline
  def apply(focused: Boolean, index: Double, route: NavigationRoute[NavigationParams]): Scene = {
    val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scene]
  }
  @scala.inline
  implicit class SceneOps[Self <: Scene] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoute(value: NavigationRoute[NavigationParams]): Self = this.set("route", value.asInstanceOf[js.Any])
    @scala.inline
    def setTintColor(value: String): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
  }
  
}


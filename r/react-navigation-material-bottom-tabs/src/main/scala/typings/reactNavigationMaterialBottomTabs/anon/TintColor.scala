package typings.reactNavigationMaterialBottomTabs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TintColor extends js.Object {
  var focused: Boolean = js.native
  var route: Key = js.native
  var tintColor: String = js.native
}

object TintColor {
  @scala.inline
  def apply(focused: Boolean, route: Key, tintColor: String): TintColor = {
    val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any], tintColor = tintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TintColor]
  }
  @scala.inline
  implicit class TintColorOps[Self <: TintColor] (val x: Self) extends AnyVal {
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
    def setRoute(value: Key): Self = this.set("route", value.asInstanceOf[js.Any])
    @scala.inline
    def setTintColor(value: String): Self = this.set("tintColor", value.asInstanceOf[js.Any])
  }
  
}


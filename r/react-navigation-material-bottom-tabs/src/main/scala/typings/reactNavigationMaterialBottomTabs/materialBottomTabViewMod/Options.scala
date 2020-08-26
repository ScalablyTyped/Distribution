package typings.reactNavigationMaterialBottomTabs.materialBottomTabViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var tabBarColor: js.UndefOr[String] = js.native
  var tabBarColorDark: js.UndefOr[String] = js.native
  var tabBarColorLight: js.UndefOr[String] = js.native
  var tabBarVisible: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setTabBarColor(value: String): Self = this.set("tabBarColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabBarColor: Self = this.set("tabBarColor", js.undefined)
    @scala.inline
    def setTabBarColorDark(value: String): Self = this.set("tabBarColorDark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabBarColorDark: Self = this.set("tabBarColorDark", js.undefined)
    @scala.inline
    def setTabBarColorLight(value: String): Self = this.set("tabBarColorLight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabBarColorLight: Self = this.set("tabBarColorLight", js.undefined)
    @scala.inline
    def setTabBarVisible(value: Boolean): Self = this.set("tabBarVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabBarVisible: Self = this.set("tabBarVisible", js.undefined)
  }
  
}


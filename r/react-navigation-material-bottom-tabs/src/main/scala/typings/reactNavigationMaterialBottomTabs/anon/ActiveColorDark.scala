package typings.reactNavigationMaterialBottomTabs.anon

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveColorDark extends js.Object {
  var activeColorDark: js.UndefOr[String] = js.native
  var activeColorLight: js.UndefOr[String] = js.native
  var barStyleDark: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var barStyleLight: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var inactiveColorDark: js.UndefOr[String] = js.native
  var inactiveColorLight: js.UndefOr[String] = js.native
}

object ActiveColorDark {
  @scala.inline
  def apply(): ActiveColorDark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveColorDark]
  }
  @scala.inline
  implicit class ActiveColorDarkOps[Self <: ActiveColorDark] (val x: Self) extends AnyVal {
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
    def setActiveColorDark(value: String): Self = this.set("activeColorDark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveColorDark: Self = this.set("activeColorDark", js.undefined)
    @scala.inline
    def setActiveColorLight(value: String): Self = this.set("activeColorLight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveColorLight: Self = this.set("activeColorLight", js.undefined)
    @scala.inline
    def setBarStyleDark(value: StyleProp[ViewStyle]): Self = this.set("barStyleDark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarStyleDark: Self = this.set("barStyleDark", js.undefined)
    @scala.inline
    def setBarStyleDarkNull: Self = this.set("barStyleDark", null)
    @scala.inline
    def setBarStyleLight(value: StyleProp[ViewStyle]): Self = this.set("barStyleLight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarStyleLight: Self = this.set("barStyleLight", js.undefined)
    @scala.inline
    def setBarStyleLightNull: Self = this.set("barStyleLight", null)
    @scala.inline
    def setInactiveColorDark(value: String): Self = this.set("inactiveColorDark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInactiveColorDark: Self = this.set("inactiveColorDark", js.undefined)
    @scala.inline
    def setInactiveColorLight(value: String): Self = this.set("inactiveColorLight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInactiveColorLight: Self = this.set("inactiveColorLight", js.undefined)
  }
  
}


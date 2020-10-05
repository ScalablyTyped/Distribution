package typings.reactNativeVectorIcons.iconMod

import typings.reactNative.mod.TabBarIOSItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabBarItemIOSProps extends TabBarIOSItemProps {
  /**
    * Color of the icon
    *
    */
  var iconColor: js.UndefOr[String] = js.native
  /**
    * Name of the default icon (similar to TabBarIOS.Item icon)
    *
    */
  var iconName: String = js.native
  /**
    * Size of the icon
    *
    * @default 30
    */
  var iconSize: js.UndefOr[Double] = js.native
  /**
    * Color of the selected icon.
    *
    * Defaults to iconColor
    *
    */
  var selectedIconColor: js.UndefOr[String] = js.native
  /**
    * Name of the selected icon (similar to TabBarIOS.Item selectedIcon)
    *
    * Defaults to iconName
    *
    */
  var selectedIconName: js.UndefOr[String] = js.native
}

object TabBarItemIOSProps {
  @scala.inline
  def apply(iconName: String): TabBarItemIOSProps = {
    val __obj = js.Dynamic.literal(iconName = iconName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarItemIOSProps]
  }
  @scala.inline
  implicit class TabBarItemIOSPropsOps[Self <: TabBarItemIOSProps] (val x: Self) extends AnyVal {
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
    def setIconName(value: String): Self = this.set("iconName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconColor(value: String): Self = this.set("iconColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconColor: Self = this.set("iconColor", js.undefined)
    @scala.inline
    def setIconSize(value: Double): Self = this.set("iconSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconSize: Self = this.set("iconSize", js.undefined)
    @scala.inline
    def setSelectedIconColor(value: String): Self = this.set("selectedIconColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedIconColor: Self = this.set("selectedIconColor", js.undefined)
    @scala.inline
    def setSelectedIconName(value: String): Self = this.set("selectedIconName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedIconName: Self = this.set("selectedIconName", js.undefined)
  }
  
}


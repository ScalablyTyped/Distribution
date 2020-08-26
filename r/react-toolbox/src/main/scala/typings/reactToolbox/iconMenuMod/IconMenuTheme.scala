package typings.reactToolbox.iconMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconMenuTheme extends js.Object {
  /**
    * Used for the icon element.
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * Used for the root element of the icon menu.
    */
  var iconMenu: js.UndefOr[String] = js.native
}

object IconMenuTheme {
  @scala.inline
  def apply(): IconMenuTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconMenuTheme]
  }
  @scala.inline
  implicit class IconMenuThemeOps[Self <: IconMenuTheme] (val x: Self) extends AnyVal {
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
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconMenu(value: String): Self = this.set("iconMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconMenu: Self = this.set("iconMenu", js.undefined)
  }
  
}


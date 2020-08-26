package typings.reactToolbox.menuDividerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuDividerTheme extends js.Object {
  /**
    *
    */
  var menuDivider: js.UndefOr[String] = js.native
}

object MenuDividerTheme {
  @scala.inline
  def apply(): MenuDividerTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuDividerTheme]
  }
  @scala.inline
  implicit class MenuDividerThemeOps[Self <: MenuDividerTheme] (val x: Self) extends AnyVal {
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
    def setMenuDivider(value: String): Self = this.set("menuDivider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuDivider: Self = this.set("menuDivider", js.undefined)
  }
  
}


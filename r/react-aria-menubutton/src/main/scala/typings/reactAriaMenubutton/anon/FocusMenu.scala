package typings.reactAriaMenubutton.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FocusMenu extends js.Object {
  /**
    * If `true`, the menu's first item will receive focus when the
    * menu opens. Default: `false`.
    */
  var focusMenu: Boolean = js.native
}

object FocusMenu {
  @scala.inline
  def apply(focusMenu: Boolean): FocusMenu = {
    val __obj = js.Dynamic.literal(focusMenu = focusMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusMenu]
  }
  @scala.inline
  implicit class FocusMenuOps[Self <: FocusMenu] (val x: Self) extends AnyVal {
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
    def setFocusMenu(value: Boolean): Self = this.set("focusMenu", value.asInstanceOf[js.Any])
  }
  
}


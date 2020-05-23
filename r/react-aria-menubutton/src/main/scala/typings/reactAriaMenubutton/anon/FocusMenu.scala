package typings.reactAriaMenubutton.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusMenu extends js.Object {
  /**
    * If `true`, the menu's first item will receive focus when the
    * menu opens. Default: `false`.
    */
  var focusMenu: Boolean
}

object FocusMenu {
  @scala.inline
  def apply(focusMenu: Boolean): FocusMenu = {
    val __obj = js.Dynamic.literal(focusMenu = focusMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusMenu]
  }
}


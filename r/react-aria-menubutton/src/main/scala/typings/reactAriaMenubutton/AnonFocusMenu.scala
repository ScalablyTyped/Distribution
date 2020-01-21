package typings.reactAriaMenubutton

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFocusMenu extends js.Object {
  /**
  		 * If `true`, the menu's first item will receive focus when the
  		 * menu opens. Default: `false`.
  		 */
  var focusMenu: Boolean
}

object AnonFocusMenu {
  @scala.inline
  def apply(focusMenu: Boolean): AnonFocusMenu = {
    val __obj = js.Dynamic.literal(focusMenu = focusMenu.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFocusMenu]
  }
}


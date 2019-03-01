package typings
package senchaUnderscoreTouchLib.ExtNs.uxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionOverFlowMenuButton extends IMenuButton {
  /** [Property] () */
  var menuItems: js.UndefOr[js.Any] = js.undefined
}

object IActionOverFlowMenuButton {
  @scala.inline
  def apply(IMenuButton: IMenuButton = null, menuItems: js.Any = null): IActionOverFlowMenuButton = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IMenuButton)
    if (menuItems != null) __obj.updateDynamic("menuItems")(menuItems)
    __obj.asInstanceOf[IActionOverFlowMenuButton]
  }
}


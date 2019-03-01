package typings
package senchaUnderscoreTouchLib.ExtNs.uxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMenuButton
  extends senchaUnderscoreTouchLib.ExtNs.IButton {
  /** [Method] Returns the value of menuItems
  		* @returns Array
  		*/
  var getMenuItems: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Sets the value of menuItems
  		* @param menuItems Array The new value.
  		*/
  var setMenuItems: js.UndefOr[
    js.Function1[/* menuItems */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
}

object IMenuButton {
  @scala.inline
  def apply(
    IButton: senchaUnderscoreTouchLib.ExtNs.IButton = null,
    getMenuItems: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    setMenuItems: js.Function1[/* menuItems */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null
  ): IMenuButton = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IButton)
    if (getMenuItems != null) __obj.updateDynamic("getMenuItems")(getMenuItems)
    if (setMenuItems != null) __obj.updateDynamic("setMenuItems")(setMenuItems)
    __obj.asInstanceOf[IMenuButton]
  }
}


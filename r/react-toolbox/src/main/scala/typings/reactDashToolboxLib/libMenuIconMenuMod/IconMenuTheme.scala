package typings
package reactDashToolboxLib.libMenuIconMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconMenuTheme extends js.Object {
  /**
    * Used for the icon element.
    */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the root element of the icon menu.
    */
  var iconMenu: js.UndefOr[java.lang.String] = js.undefined
}

object IconMenuTheme {
  @scala.inline
  def apply(icon: java.lang.String = null, iconMenu: java.lang.String = null): IconMenuTheme = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconMenu != null) __obj.updateDynamic("iconMenu")(iconMenu)
    __obj.asInstanceOf[IconMenuTheme]
  }
}


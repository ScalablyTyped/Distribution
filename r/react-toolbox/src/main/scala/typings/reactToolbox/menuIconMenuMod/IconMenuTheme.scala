package typings.reactToolbox.menuIconMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconMenuTheme extends js.Object {
  /**
    * Used for the icon element.
    */
  var icon: js.UndefOr[String] = js.undefined
  /**
    * Used for the root element of the icon menu.
    */
  var iconMenu: js.UndefOr[String] = js.undefined
}

object IconMenuTheme {
  @scala.inline
  def apply(icon: String = null, iconMenu: String = null): IconMenuTheme = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconMenu != null) __obj.updateDynamic("iconMenu")(iconMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconMenuTheme]
  }
}


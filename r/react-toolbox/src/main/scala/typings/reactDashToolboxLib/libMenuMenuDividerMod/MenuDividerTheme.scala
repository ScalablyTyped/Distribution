package typings
package reactDashToolboxLib.libMenuMenuDividerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuDividerTheme extends js.Object {
  /**
    *
    */
  var menuDivider: js.UndefOr[java.lang.String] = js.undefined
}

object MenuDividerTheme {
  @scala.inline
  def apply(menuDivider: java.lang.String = null): MenuDividerTheme = {
    val __obj = js.Dynamic.literal()
    if (menuDivider != null) __obj.updateDynamic("menuDivider")(menuDivider)
    __obj.asInstanceOf[MenuDividerTheme]
  }
}


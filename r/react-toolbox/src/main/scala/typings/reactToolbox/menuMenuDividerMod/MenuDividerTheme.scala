package typings.reactToolbox.menuMenuDividerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuDividerTheme extends js.Object {
  /**
    *
    */
  var menuDivider: js.UndefOr[String] = js.undefined
}

object MenuDividerTheme {
  @scala.inline
  def apply(menuDivider: String = null): MenuDividerTheme = {
    val __obj = js.Dynamic.literal()
    if (menuDivider != null) __obj.updateDynamic("menuDivider")(menuDivider.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuDividerTheme]
  }
}


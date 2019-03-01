package typings
package reactDashToolboxLib.libListListItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemTheme extends js.Object {
  /**
    * Used for the root element of the list.
    */
  var listItem: js.UndefOr[java.lang.String] = js.undefined
}

object ListItemTheme {
  @scala.inline
  def apply(listItem: java.lang.String = null): ListItemTheme = {
    val __obj = js.Dynamic.literal()
    if (listItem != null) __obj.updateDynamic("listItem")(listItem)
    __obj.asInstanceOf[ListItemTheme]
  }
}


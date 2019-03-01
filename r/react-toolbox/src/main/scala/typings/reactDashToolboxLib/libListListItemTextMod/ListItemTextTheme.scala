package typings
package reactDashToolboxLib.libListListItemTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemTextTheme extends js.Object {
  /**
    * Added to the text inside of the list item.
    */
  var itemText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the text inside of the list item if its primary.
    */
  var primary: js.UndefOr[java.lang.String] = js.undefined
}

object ListItemTextTheme {
  @scala.inline
  def apply(itemText: java.lang.String = null, primary: java.lang.String = null): ListItemTextTheme = {
    val __obj = js.Dynamic.literal()
    if (itemText != null) __obj.updateDynamic("itemText")(itemText)
    if (primary != null) __obj.updateDynamic("primary")(primary)
    __obj.asInstanceOf[ListItemTextTheme]
  }
}


package typings.reactToolbox.listItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemTheme extends js.Object {
  /**
    * Used for the root element of the list.
    */
  var listItem: js.UndefOr[String] = js.undefined
}

object ListItemTheme {
  @scala.inline
  def apply(listItem: String = null): ListItemTheme = {
    val __obj = js.Dynamic.literal()
    if (listItem != null) __obj.updateDynamic("listItem")(listItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemTheme]
  }
}


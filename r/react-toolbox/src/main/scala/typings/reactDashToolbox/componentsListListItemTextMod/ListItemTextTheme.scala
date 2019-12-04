package typings.reactDashToolbox.componentsListListItemTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemTextTheme extends js.Object {
  /**
    * Added to the text inside of the list item.
    */
  var itemText: js.UndefOr[String] = js.undefined
  /**
    * Added to the text inside of the list item if its primary.
    */
  var primary: js.UndefOr[String] = js.undefined
}

object ListItemTextTheme {
  @scala.inline
  def apply(itemText: String = null, primary: String = null): ListItemTextTheme = {
    val __obj = js.Dynamic.literal()
    if (itemText != null) __obj.updateDynamic("itemText")(itemText.asInstanceOf[js.Any])
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemTextTheme]
  }
}


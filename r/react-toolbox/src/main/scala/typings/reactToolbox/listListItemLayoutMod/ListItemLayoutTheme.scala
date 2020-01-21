package typings.reactToolbox.listListItemLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemLayoutTheme extends js.Object {
  /**
    * Added to the inner content if its a disabled item.
    */
  var disabled: js.UndefOr[String] = js.undefined
  /**
    * Used for the inner content of a list item.
    */
  var item: js.UndefOr[String] = js.undefined
  /**
    * Added when layout is selectable.
    */
  var selectable: js.UndefOr[String] = js.undefined
}

object ListItemLayoutTheme {
  @scala.inline
  def apply(disabled: String = null, item: String = null, selectable: String = null): ListItemLayoutTheme = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemLayoutTheme]
  }
}


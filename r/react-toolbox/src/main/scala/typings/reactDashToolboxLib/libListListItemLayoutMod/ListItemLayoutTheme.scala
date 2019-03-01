package typings
package reactDashToolboxLib.libListListItemLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemLayoutTheme extends js.Object {
  /**
    * Added to the inner content if its a disabled item.
    */
  var disabled: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the inner content of a list item.
    */
  var item: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added when layout is selectable.
    */
  var selectable: js.UndefOr[java.lang.String] = js.undefined
}

object ListItemLayoutTheme {
  @scala.inline
  def apply(
    disabled: java.lang.String = null,
    item: java.lang.String = null,
    selectable: java.lang.String = null
  ): ListItemLayoutTheme = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (item != null) __obj.updateDynamic("item")(item)
    if (selectable != null) __obj.updateDynamic("selectable")(selectable)
    __obj.asInstanceOf[ListItemLayoutTheme]
  }
}


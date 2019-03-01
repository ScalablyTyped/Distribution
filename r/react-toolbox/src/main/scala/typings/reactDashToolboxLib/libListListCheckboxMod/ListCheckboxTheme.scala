package typings
package reactDashToolboxLib.libListListCheckboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCheckboxTheme extends js.Object {
  /**
    * Used as a wrapper class for the subheader element.
    */
  var checkbox: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the checkbox element.
    */
  var checkboxItem: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the inner content if its a disabled item.
    */
  var disabled: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the inner content of a list item.
    */
  var item: js.UndefOr[java.lang.String] = js.undefined
}

object ListCheckboxTheme {
  @scala.inline
  def apply(
    checkbox: java.lang.String = null,
    checkboxItem: java.lang.String = null,
    disabled: java.lang.String = null,
    item: java.lang.String = null
  ): ListCheckboxTheme = {
    val __obj = js.Dynamic.literal()
    if (checkbox != null) __obj.updateDynamic("checkbox")(checkbox)
    if (checkboxItem != null) __obj.updateDynamic("checkboxItem")(checkboxItem)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (item != null) __obj.updateDynamic("item")(item)
    __obj.asInstanceOf[ListCheckboxTheme]
  }
}


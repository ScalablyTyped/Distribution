package typings.reactDashToolbox.componentsListListCheckboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCheckboxTheme extends js.Object {
  /**
    * Used as a wrapper class for the subheader element.
    */
  var checkbox: js.UndefOr[String] = js.undefined
  /**
    * Added to the checkbox element.
    */
  var checkboxItem: js.UndefOr[String] = js.undefined
  /**
    * Added to the inner content if its a disabled item.
    */
  var disabled: js.UndefOr[String] = js.undefined
  /**
    * Used for the inner content of a list item.
    */
  var item: js.UndefOr[String] = js.undefined
}

object ListCheckboxTheme {
  @scala.inline
  def apply(checkbox: String = null, checkboxItem: String = null, disabled: String = null, item: String = null): ListCheckboxTheme = {
    val __obj = js.Dynamic.literal()
    if (checkbox != null) __obj.updateDynamic("checkbox")(checkbox.asInstanceOf[js.Any])
    if (checkboxItem != null) __obj.updateDynamic("checkboxItem")(checkboxItem.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCheckboxTheme]
  }
}


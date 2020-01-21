package typings.reactToolbox.checkboxCheckboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxTheme extends js.Object {
  /**
    * Used as root in the check element.
    */
  var check: js.UndefOr[String] = js.undefined
  /**
    * Used for the check element when it's checked.
    */
  var checked: js.UndefOr[String] = js.undefined
  /**
    * Used when the component is disabled.
    */
  var disabled: js.UndefOr[String] = js.undefined
  /**
    * Used as the root class of the component.
    */
  var field: js.UndefOr[String] = js.undefined
  /**
    * Used for the input element.
    */
  var input: js.UndefOr[String] = js.undefined
  /**
    * Used for the ripple component.
    */
  var ripple: js.UndefOr[String] = js.undefined
  /**
    * Used for the text label.
    */
  var text: js.UndefOr[String] = js.undefined
}

object CheckboxTheme {
  @scala.inline
  def apply(
    check: String = null,
    checked: String = null,
    disabled: String = null,
    field: String = null,
    input: String = null,
    ripple: String = null,
    text: String = null
  ): CheckboxTheme = {
    val __obj = js.Dynamic.literal()
    if (check != null) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (checked != null) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (ripple != null) __obj.updateDynamic("ripple")(ripple.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxTheme]
  }
}


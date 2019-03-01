package typings
package reactDashToolboxLib.libCheckboxCheckboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxTheme extends js.Object {
  /**
    * Used as root in the check element.
    */
  var check: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the check element when it's checked.
    */
  var checked: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used when the component is disabled.
    */
  var disabled: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used as the root class of the component.
    */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the input element.
    */
  var input: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the ripple component.
    */
  var ripple: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the text label.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object CheckboxTheme {
  @scala.inline
  def apply(
    check: java.lang.String = null,
    checked: java.lang.String = null,
    disabled: java.lang.String = null,
    field: java.lang.String = null,
    input: java.lang.String = null,
    ripple: java.lang.String = null,
    text: java.lang.String = null
  ): CheckboxTheme = {
    val __obj = js.Dynamic.literal()
    if (check != null) __obj.updateDynamic("check")(check)
    if (checked != null) __obj.updateDynamic("checked")(checked)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (field != null) __obj.updateDynamic("field")(field)
    if (input != null) __obj.updateDynamic("input")(input)
    if (ripple != null) __obj.updateDynamic("ripple")(ripple)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[CheckboxTheme]
  }
}


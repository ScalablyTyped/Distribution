package typings.reactDashToolbox.componentsDropdownDropdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownTheme extends js.Object {
  /**
    * Added to the root element when the dropdown is active.
    */
  var active: js.UndefOr[String] = js.undefined
  /**
    * Added to the root element when it's disabled.
    */
  var disabled: js.UndefOr[String] = js.undefined
  /**
    * Root element class.
    */
  var dropdown: js.UndefOr[String] = js.undefined
  /**
    * Used for the error element.
    */
  var error: js.UndefOr[String] = js.undefined
  /**
    * Added to the inner wrapper if it's errored.
    */
  var errored: js.UndefOr[String] = js.undefined
  /**
    * Used for the inner wrapper of the component.
    */
  var field: js.UndefOr[String] = js.undefined
  /**
    * Used for the the label element.
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * Used when dropdown has required attribute.
    */
  var required: js.UndefOr[String] = js.undefined
  /**
    * Used to highlight the selected value.
    */
  var selected: js.UndefOr[String] = js.undefined
  /**
    * Used as a wrapper for the given template value.
    */
  var templateValue: js.UndefOr[String] = js.undefined
  /**
    * Added to the root element when it's opening up.
    */
  var up: js.UndefOr[String] = js.undefined
  /**
    * Used for each value in the dropdown component.
    */
  var value: js.UndefOr[String] = js.undefined
  /**
    * Used for the list of values.
    */
  var values: js.UndefOr[String] = js.undefined
}

object DropdownTheme {
  @scala.inline
  def apply(
    active: String = null,
    disabled: String = null,
    dropdown: String = null,
    error: String = null,
    errored: String = null,
    field: String = null,
    label: String = null,
    required: String = null,
    selected: String = null,
    templateValue: String = null,
    up: String = null,
    value: String = null,
    values: String = null
  ): DropdownTheme = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (dropdown != null) __obj.updateDynamic("dropdown")(dropdown.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (errored != null) __obj.updateDynamic("errored")(errored.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (templateValue != null) __obj.updateDynamic("templateValue")(templateValue.asInstanceOf[js.Any])
    if (up != null) __obj.updateDynamic("up")(up.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownTheme]
  }
}


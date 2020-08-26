package typings.reactToolbox.dropdownDropdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropdownTheme extends js.Object {
  /**
    * Added to the root element when the dropdown is active.
    */
  var active: js.UndefOr[String] = js.native
  /**
    * Added to the root element when it's disabled.
    */
  var disabled: js.UndefOr[String] = js.native
  /**
    * Root element class.
    */
  var dropdown: js.UndefOr[String] = js.native
  /**
    * Used for the error element.
    */
  var error: js.UndefOr[String] = js.native
  /**
    * Added to the inner wrapper if it's errored.
    */
  var errored: js.UndefOr[String] = js.native
  /**
    * Used for the inner wrapper of the component.
    */
  var field: js.UndefOr[String] = js.native
  /**
    * Used for the the label element.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * Used when dropdown has required attribute.
    */
  var required: js.UndefOr[String] = js.native
  /**
    * Used to highlight the selected value.
    */
  var selected: js.UndefOr[String] = js.native
  /**
    * Used as a wrapper for the given template value.
    */
  var templateValue: js.UndefOr[String] = js.native
  /**
    * Added to the root element when it's opening up.
    */
  var up: js.UndefOr[String] = js.native
  /**
    * Used for each value in the dropdown component.
    */
  var value: js.UndefOr[String] = js.native
  /**
    * Used for the list of values.
    */
  var values: js.UndefOr[String] = js.native
}

object DropdownTheme {
  @scala.inline
  def apply(): DropdownTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropdownTheme]
  }
  @scala.inline
  implicit class DropdownThemeOps[Self <: DropdownTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDropdown(value: String): Self = this.set("dropdown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdown: Self = this.set("dropdown", js.undefined)
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setErrored(value: String): Self = this.set("errored", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrored: Self = this.set("errored", js.undefined)
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setRequired(value: String): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setSelected(value: String): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setTemplateValue(value: String): Self = this.set("templateValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateValue: Self = this.set("templateValue", js.undefined)
    @scala.inline
    def setUp(value: String): Self = this.set("up", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUp: Self = this.set("up", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValues(value: String): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}


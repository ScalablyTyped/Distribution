package typings.reactToolbox.dropdownDropdownMod

import typings.reactToolbox.mod.ReactToolbox.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropdownProps extends Props {
  /**
    * If true the dropdown will preselect the first item if the supplied value matches none of the options' values.
    * @default true
    */
  var allowBlank: js.UndefOr[Boolean] = js.native
  /**
    * If true, the dropdown will open up or down depending on the position in the screen.
    * @default true
    */
  var auto: js.UndefOr[Boolean] = js.native
  /**
    * Set the component as disabled.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Give an error string to display under the field.
    */
  var error: js.UndefOr[String] = js.native
  /**
    * The text string to use for the floating label element.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * Used for setting the label from source
    */
  var labelKey: js.UndefOr[String] = js.native
  /**
    * Name for the input field.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Callback function that is fired when the component is blurred.
    */
  var onBlur: js.UndefOr[js.Function] = js.native
  /**
    * Callback function that is fired when the component's value changes.
    */
  var onChange: js.UndefOr[js.Function] = js.native
  /**
    * Callback function that is fired when the component is focused.
    */
  var onFocus: js.UndefOr[js.Function] = js.native
  /**
    * If true, the dropdown has a required attribute.
    * @default false
    */
  var required: js.UndefOr[Boolean] = js.native
  /**
    * Array of data objects with the data to represent in the dropdown.
    */
  var source: js.Array[_] = js.native
  /**
    * Callback function that returns a JSX template to represent the element.
    */
  var template: js.UndefOr[js.Function] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[DropdownTheme] = js.native
  /**
    * Default value using JSON data.
    */
  var value: js.UndefOr[String | Double] = js.native
  /**
    * Used for setting the value from source
    */
  var valueKey: js.UndefOr[String] = js.native
}

object DropdownProps {
  @scala.inline
  def apply(source: js.Array[_]): DropdownProps = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownProps]
  }
  @scala.inline
  implicit class DropdownPropsOps[Self <: DropdownProps] (val x: Self) extends AnyVal {
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
    def setSourceVarargs(value: js.Any*): Self = this.set("source", js.Array(value :_*))
    @scala.inline
    def setSource(value: js.Array[_]): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowBlank(value: Boolean): Self = this.set("allowBlank", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowBlank: Self = this.set("allowBlank", js.undefined)
    @scala.inline
    def setAuto(value: Boolean): Self = this.set("auto", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuto: Self = this.set("auto", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelKey(value: String): Self = this.set("labelKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelKey: Self = this.set("labelKey", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnBlur(value: js.Function): Self = this.set("onBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnChange(value: js.Function): Self = this.set("onChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnFocus(value: js.Function): Self = this.set("onFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setTemplate(value: js.Function): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTheme(value: DropdownTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setValue(value: String | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueKey(value: String): Self = this.set("valueKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueKey: Self = this.set("valueKey", js.undefined)
  }
  
}


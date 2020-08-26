package typings.reactToolbox.inputInputMod

import typings.react.mod.ReactNode
import typings.reactToolbox.mod.ReactToolbox.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputProps extends Props {
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[ReactNode] = js.native
  /**
    * If true, component will be disabled.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Give an error node to display under the field.
    */
  var error: js.UndefOr[ReactNode] = js.native
  /**
    * Indicates if the label is floating in the input field or not.
    * @default true
    */
  var floating: js.UndefOr[Boolean] = js.native
  /**
    * The text string to use for hint text element.
    */
  var hint: js.UndefOr[ReactNode] = js.native
  /**
    * Name of an icon to use as a label for the input.
    */
  var icon: js.UndefOr[ReactNode] = js.native
  /**
    * The text string to use for the floating label element.
    */
  var label: js.UndefOr[ReactNode] = js.native
  /**
    * Specifies the maximum number of characters allowed in the component
    */
  var maxLength: js.UndefOr[Double] = js.native
  /**
    * If true, a textarea element will be rendered. The textarea also grows and shrinks according to the number of lines.
    * @default false
    */
  var multiline: js.UndefOr[Boolean] = js.native
  /**
    * Name for the input field.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Callback function that is fired when component is blurred.
    */
  var onBlur: js.UndefOr[js.Function] = js.native
  /**
    * Callback function that is fired when the component's value changes
    */
  var onChange: js.UndefOr[js.Function] = js.native
  /**
    * Callback function that is fired when component is focused.
    */
  var onFocus: js.UndefOr[js.Function] = js.native
  /**
    * Callback function that is fired when a key is pressed down.
    */
  var onKeyDown: js.UndefOr[js.Function] = js.native
  /**
    * Callback function that is fired when a key is pressed.
    */
  var onKeyPress: js.UndefOr[js.Function] = js.native
  /**
    * Callback function that is fired when a key is released.
    */
  var onKeyUp: js.UndefOr[js.Function] = js.native
  /**
    * If true, the html input has a required attribute.
    * @default false
    */
  var required: js.UndefOr[Boolean] = js.native
  /**
    * The number of rows the multiline input field has.
    */
  var rows: js.UndefOr[Double] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[InputTheme] = js.native
  /**
    * Type of the input element. It can be a valid HTML5 input type.
    * @default "text"
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Current value of the input element.
    */
  var value: js.UndefOr[js.Any] = js.native
}

object InputProps {
  @scala.inline
  def apply(): InputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputProps]
  }
  @scala.inline
  implicit class InputPropsOps[Self <: InputProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setError(value: ReactNode): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setFloating(value: Boolean): Self = this.set("floating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloating: Self = this.set("floating", js.undefined)
    @scala.inline
    def setHint(value: ReactNode): Self = this.set("hint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    @scala.inline
    def setIcon(value: ReactNode): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setLabel(value: ReactNode): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    @scala.inline
    def setMultiline(value: Boolean): Self = this.set("multiline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiline: Self = this.set("multiline", js.undefined)
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
    def setOnKeyDown(value: js.Function): Self = this.set("onKeyDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setOnKeyPress(value: js.Function): Self = this.set("onKeyPress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    @scala.inline
    def setOnKeyUp(value: js.Function): Self = this.set("onKeyUp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setTheme(value: InputTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}


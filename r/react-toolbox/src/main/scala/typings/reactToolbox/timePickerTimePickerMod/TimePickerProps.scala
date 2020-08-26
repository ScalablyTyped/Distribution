package typings.reactToolbox.timePickerTimePickerMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.reactToolbox.reactToolboxStrings.`24hr`
import typings.reactToolbox.reactToolboxStrings.ampm
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimePickerProps
  extends /**
  * Additional properties passed to Radio container.
  */
/* key */ StringDictionary[js.Any] {
  /**
    * Whether time picker is active.
    * @default false
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Label used for cancel button.
    * @default "Cancel"
    */
  var cancelLabel: js.UndefOr[String] = js.native
  /**
    * Provide error text which will be displayed under the field.
    */
  var error: js.UndefOr[String] = js.native
  /**
    * Format to display the clock. It can be 24hr or ampm.
    * @default "24hr"
    */
  var format: js.UndefOr[`24hr` | ampm] = js.native
  /**
    * A key to identify an Icon from Material Design Icons or a custom Icon Element.
    */
  var icon: js.UndefOr[ReactNode] = js.native
  /**
    * This class will be applied to Input component of TimePicker.
    */
  var inputClassName: js.UndefOr[String] = js.native
  /**
    * The text string to use for the floating label element in the input component.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * Label used for 'OK' button on Dialog.
    * @default "Ok"
    */
  var okLabel: js.UndefOr[String] = js.native
  /**
    * Callback called when the picker value is changed.
    */
  var onChange: js.UndefOr[js.Function] = js.native
  /**
    * Callback fired on Input click.
    */
  var onClick: js.UndefOr[js.Function] = js.native
  /**
    * Callback fired after dismissing the Dialog.
    */
  var onDismiss: js.UndefOr[js.Function] = js.native
  /**
    * Callback called when the ESC key is pressed with the overlay active.
    */
  var onEscKeyDown: js.UndefOr[js.Function] = js.native
  /**
    * Callback invoked on Input key press.
    */
  var onKeyPress: js.UndefOr[js.Function] = js.native
  /**
    * Callback to be invoked when the dialog overlay is clicked.
    */
  var onOverlayClick: js.UndefOr[js.Function] = js.native
  /**
    * The input element will be readonly and look like disabled.
    */
  var readonly: js.UndefOr[Boolean] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[TimePickerTheme] = js.native
  /**
    * Datetime object with currrently selected time.
    */
  var value: js.UndefOr[Date] = js.native
}

object TimePickerProps {
  @scala.inline
  def apply(): TimePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerProps]
  }
  @scala.inline
  implicit class TimePickerPropsOps[Self <: TimePickerProps] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setCancelLabel(value: String): Self = this.set("cancelLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelLabel: Self = this.set("cancelLabel", js.undefined)
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setFormat(value: `24hr` | ampm): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setIcon(value: ReactNode): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setInputClassName(value: String): Self = this.set("inputClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputClassName: Self = this.set("inputClassName", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setOkLabel(value: String): Self = this.set("okLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOkLabel: Self = this.set("okLabel", js.undefined)
    @scala.inline
    def setOnChange(value: js.Function): Self = this.set("onChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnClick(value: js.Function): Self = this.set("onClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnDismiss(value: js.Function): Self = this.set("onDismiss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    @scala.inline
    def setOnEscKeyDown(value: js.Function): Self = this.set("onEscKeyDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEscKeyDown: Self = this.set("onEscKeyDown", js.undefined)
    @scala.inline
    def setOnKeyPress(value: js.Function): Self = this.set("onKeyPress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    @scala.inline
    def setOnOverlayClick(value: js.Function): Self = this.set("onOverlayClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnOverlayClick: Self = this.set("onOverlayClick", js.undefined)
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadonly: Self = this.set("readonly", js.undefined)
    @scala.inline
    def setTheme(value: TimePickerTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setValue(value: Date): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}


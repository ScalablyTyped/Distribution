package typings.reactToolbox.datePickerDatePickerMod

import typings.react.mod.ReactNode
import typings.reactToolbox.mod.ReactToolbox.Props
import typings.reactToolbox.reactToolboxStrings.`zh-cn`
import typings.reactToolbox.reactToolboxStrings.`zh-hk`
import typings.reactToolbox.reactToolboxStrings.`zh-tw`
import typings.reactToolbox.reactToolboxStrings.af
import typings.reactToolbox.reactToolboxStrings.ar
import typings.reactToolbox.reactToolboxStrings.be
import typings.reactToolbox.reactToolboxStrings.bg
import typings.reactToolbox.reactToolboxStrings.bn
import typings.reactToolbox.reactToolboxStrings.bo
import typings.reactToolbox.reactToolboxStrings.br
import typings.reactToolbox.reactToolboxStrings.bs
import typings.reactToolbox.reactToolboxStrings.ca
import typings.reactToolbox.reactToolboxStrings.de
import typings.reactToolbox.reactToolboxStrings.en
import typings.reactToolbox.reactToolboxStrings.es
import typings.reactToolbox.reactToolboxStrings.eu
import typings.reactToolbox.reactToolboxStrings.fr
import typings.reactToolbox.reactToolboxStrings.gl
import typings.reactToolbox.reactToolboxStrings.it
import typings.reactToolbox.reactToolboxStrings.no
import typings.reactToolbox.reactToolboxStrings.pt
import typings.reactToolbox.reactToolboxStrings.ru
import typings.reactToolbox.reactToolboxStrings.ua
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatePickerProps extends Props {
  /**
    * Allows to control if the picker should be shown from outside. Beware you should update the prop when the Dialog is closed.
    * @default false
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Automatically selects a date upon clicking on a day
    * @default false
    */
  var autoOk: js.UndefOr[Boolean] = js.native
  /**
    * Label used for cancel button on Dialog.
    * @default "Cancel"
    */
  var cancelLabel: js.UndefOr[String] = js.native
  /**
    * An array of date objects which will be disabled in the calendar. All other dates will be enabled.
    */
  var disabledDates: js.UndefOr[js.Array[Date]] = js.native
  /**
    * An array of date objects which will be enabled in the calendar. All other dates will be disabled.
    */
  var enabledDates: js.UndefOr[js.Array[Date]] = js.native
  /**
    * Give an error node to display under the field.
    */
  var error: js.UndefOr[String] = js.native
  /**
    * A key to identify an Icon from Material Design Icons or a custom Icon Element.
    */
  var icon: js.UndefOr[ReactNode] = js.native
  /**
    * This class will be applied to Input component of DatePicker.
    */
  var inputClassName: js.UndefOr[String] = js.native
  /**
    * Function to format the date displayed on the input.
    */
  var inputFormat: js.UndefOr[js.Function] = js.native
  /**
    * The text string to use for the floating label element in the input component.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * Sets locale for the Dialog.
    * @default "en"
    */
  var locale: js.UndefOr[
    de | no | en | es | af | ar | be | bg | bn | bo | br | bs | ca | gl | eu | pt | it | fr | ru | ua | `zh-cn` | `zh-hk` | `zh-tw` | DatePickerLocale
  ] = js.native
  /**
    * Date object with the maximum selectable date.
    */
  var maxDate: js.UndefOr[Date] = js.native
  /**
    * Date object with the minimum selectable date.
    */
  var minDate: js.UndefOr[Date] = js.native
  /**
    * Name for the input field.
    */
  var name: js.UndefOr[String] = js.native
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
    * Used in case the input is required.
    */
  var required: js.UndefOr[Boolean] = js.native
  /**
    * Set week's first day to Sunday. Default week's first day is Monday.
    * @default false
    */
  var sundayFirstDayOfWeek: js.UndefOr[Boolean] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[DatePickerTheme] = js.native
  /**
    * Date object with the currently selected date.
    */
  var value: js.UndefOr[Date | String] = js.native
}

object DatePickerProps {
  @scala.inline
  def apply(): DatePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerProps]
  }
  @scala.inline
  implicit class DatePickerPropsOps[Self <: DatePickerProps] (val x: Self) extends AnyVal {
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
    def setAutoOk(value: Boolean): Self = this.set("autoOk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoOk: Self = this.set("autoOk", js.undefined)
    @scala.inline
    def setCancelLabel(value: String): Self = this.set("cancelLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelLabel: Self = this.set("cancelLabel", js.undefined)
    @scala.inline
    def setDisabledDatesVarargs(value: Date*): Self = this.set("disabledDates", js.Array(value :_*))
    @scala.inline
    def setDisabledDates(value: js.Array[Date]): Self = this.set("disabledDates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledDates: Self = this.set("disabledDates", js.undefined)
    @scala.inline
    def setEnabledDatesVarargs(value: Date*): Self = this.set("enabledDates", js.Array(value :_*))
    @scala.inline
    def setEnabledDates(value: js.Array[Date]): Self = this.set("enabledDates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabledDates: Self = this.set("enabledDates", js.undefined)
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setIcon(value: ReactNode): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setInputClassName(value: String): Self = this.set("inputClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputClassName: Self = this.set("inputClassName", js.undefined)
    @scala.inline
    def setInputFormat(value: js.Function): Self = this.set("inputFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputFormat: Self = this.set("inputFormat", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLocale(
      value: de | no | en | es | af | ar | be | bg | bn | bo | br | bs | ca | gl | eu | pt | it | fr | ru | ua | `zh-cn` | `zh-hk` | `zh-tw` | DatePickerLocale
    ): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMaxDate(value: Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    @scala.inline
    def setMinDate(value: Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOkLabel(value: String): Self = this.set("okLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOkLabel: Self = this.set("okLabel", js.undefined)
    @scala.inline
    def setOnChange(value: js.Function): Self = this.set("onChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
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
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setSundayFirstDayOfWeek(value: Boolean): Self = this.set("sundayFirstDayOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSundayFirstDayOfWeek: Self = this.set("sundayFirstDayOfWeek", js.undefined)
    @scala.inline
    def setTheme(value: DatePickerTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setValue(value: Date | String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}


package typings
package reactDashToolboxLib.libDateUnderscorePickerDatePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props {
  /**
    * Allows to control if the picker should be shown from outside. Beware you should update the prop when the Dialog is closed.
    * @default false
    */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Automatically selects a date upon clicking on a day
    * @default false
    */
  var autoOk: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Label used for cancel button on Dialog.
    * @default "Cancel"
    */
  var cancelLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array of date objects which will be disabled in the calendar. All other dates will be enabled.
    */
  var disabledDates: js.UndefOr[coreDashJsLib.Array[coreDashJsLib.Date]] = js.undefined
  /**
    * An array of date objects which will be enabled in the calendar. All other dates will be disabled.
    */
  var enabledDates: js.UndefOr[coreDashJsLib.Array[coreDashJsLib.Date]] = js.undefined
  /**
    * Give an error node to display under the field.
    */
  var error: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A key to identify an Icon from Material Design Icons or a custom Icon Element.
    */
  var icon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * This class will be applied to Input component of DatePicker.
    */
  var inputClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Function to format the date displayed on the input.
    */
  var inputFormat: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
    * The text string to use for the floating label element in the input component.
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets locale for the Dialog.
    * @default "en"
    */
  var locale: js.UndefOr[
    reactDashToolboxLib.reactDashToolboxLibStrings.de | reactDashToolboxLib.reactDashToolboxLibStrings.no | reactDashToolboxLib.reactDashToolboxLibStrings.en | reactDashToolboxLib.reactDashToolboxLibStrings.es | reactDashToolboxLib.reactDashToolboxLibStrings.af | reactDashToolboxLib.reactDashToolboxLibStrings.ar | reactDashToolboxLib.reactDashToolboxLibStrings.be | reactDashToolboxLib.reactDashToolboxLibStrings.bg | reactDashToolboxLib.reactDashToolboxLibStrings.bn | reactDashToolboxLib.reactDashToolboxLibStrings.bo | reactDashToolboxLib.reactDashToolboxLibStrings.br | reactDashToolboxLib.reactDashToolboxLibStrings.bs | reactDashToolboxLib.reactDashToolboxLibStrings.ca | reactDashToolboxLib.reactDashToolboxLibStrings.gl | reactDashToolboxLib.reactDashToolboxLibStrings.eu | reactDashToolboxLib.reactDashToolboxLibStrings.pt | reactDashToolboxLib.reactDashToolboxLibStrings.it | reactDashToolboxLib.reactDashToolboxLibStrings.fr | reactDashToolboxLib.reactDashToolboxLibStrings.ru | reactDashToolboxLib.reactDashToolboxLibStrings.ua | reactDashToolboxLib.reactDashToolboxLibStrings.`zh-cn` | reactDashToolboxLib.reactDashToolboxLibStrings.`zh-hk` | reactDashToolboxLib.reactDashToolboxLibStrings.`zh-tw` | DatePickerLocale
  ] = js.undefined
  /**
    * Date object with the maximum selectable date.
    */
  var maxDate: js.UndefOr[coreDashJsLib.Date] = js.undefined
  /**
    * Date object with the minimum selectable date.
    */
  var minDate: js.UndefOr[coreDashJsLib.Date] = js.undefined
  /**
    * Name for the input field.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Label used for 'OK' button on Dialog.
    * @default "Ok"
    */
  var okLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Callback called when the picker value is changed.
    */
  var onChange: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
    * Callback fired after dismissing the Dialog.
    */
  var onDismiss: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
    * Callback called when the ESC key is pressed with the overlay active.
    */
  var onEscKeyDown: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
    * Callback invoked on Input key press.
    */
  var onKeyPress: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
    * Callback to be invoked when the dialog overlay is clicked.
    */
  var onOverlayClick: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
    * The input element will be readonly and look like disabled.
    */
  var readonly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Used in case the input is required.
    */
  var required: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set week's first day to Sunday. Default week's first day is Monday.
    * @default false
    */
  var sundayFirstDayOfWeek: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[DatePickerTheme] = js.undefined
  /**
    * Date object with the currently selected date.
    */
  var value: js.UndefOr[coreDashJsLib.Date | java.lang.String] = js.undefined
}


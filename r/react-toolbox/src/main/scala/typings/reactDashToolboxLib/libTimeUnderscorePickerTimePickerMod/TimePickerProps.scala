package typings
package reactDashToolboxLib.libTimeUnderscorePickerTimePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TimePickerProps
  extends /**
   * Additional attributes passed to inner Input component.
   */
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
     * Whether time picker is active.
     * @default false
     */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Label used for cancel button.
     * @default "Cancel"
     */
  var cancelLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
     * Provide error text which will be displayed under the field.
     */
  var error: js.UndefOr[java.lang.String] = js.undefined
  /**
     * Format to display the clock. It can be 24hr or ampm.
     * @default "24hr"
     */
  var format: js.UndefOr[
    reactDashToolboxLib.reactDashToolboxLibStrings.`24hr` | reactDashToolboxLib.reactDashToolboxLibStrings.ampm
  ] = js.undefined
  /**
     * A key to identify an Icon from Material Design Icons or a custom Icon Element.
     */
  var icon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
     * This class will be applied to Input component of TimePicker.
     */
  var inputClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
     * The text string to use for the floating label element in the input component.
     */
  var label: js.UndefOr[java.lang.String] = js.undefined
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
     * Callback fired on Input click.
     */
  var onClick: js.UndefOr[coreDashJsLib.Function] = js.undefined
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
     * Classnames object defining the component style.
     */
  var theme: js.UndefOr[TimePickerTheme] = js.undefined
  /**
     * Datetime object with currrently selected time.
     */
  var value: js.UndefOr[coreDashJsLib.Date] = js.undefined
}


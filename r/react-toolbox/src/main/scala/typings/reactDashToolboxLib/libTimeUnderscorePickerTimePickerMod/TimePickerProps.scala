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
  var onChange: js.UndefOr[js.Function] = js.undefined
  /**
    * Callback fired on Input click.
    */
  var onClick: js.UndefOr[js.Function] = js.undefined
  /**
    * Callback fired after dismissing the Dialog.
    */
  var onDismiss: js.UndefOr[js.Function] = js.undefined
  /**
    * Callback called when the ESC key is pressed with the overlay active.
    */
  var onEscKeyDown: js.UndefOr[js.Function] = js.undefined
  /**
    * Callback invoked on Input key press.
    */
  var onKeyPress: js.UndefOr[js.Function] = js.undefined
  /**
    * Callback to be invoked when the dialog overlay is clicked.
    */
  var onOverlayClick: js.UndefOr[js.Function] = js.undefined
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
  var value: js.UndefOr[stdLib.Date] = js.undefined
}

object TimePickerProps {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Additional attributes passed to inner Input component.
    */
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    cancelLabel: java.lang.String = null,
    error: java.lang.String = null,
    format: reactDashToolboxLib.reactDashToolboxLibStrings.`24hr` | reactDashToolboxLib.reactDashToolboxLibStrings.ampm = null,
    icon: reactLib.reactMod.ReactNs.ReactNode = null,
    inputClassName: java.lang.String = null,
    label: java.lang.String = null,
    okLabel: java.lang.String = null,
    onChange: js.Function = null,
    onClick: js.Function = null,
    onDismiss: js.Function = null,
    onEscKeyDown: js.Function = null,
    onKeyPress: js.Function = null,
    onOverlayClick: js.Function = null,
    readonly: js.UndefOr[scala.Boolean] = js.undefined,
    theme: TimePickerTheme = null,
    value: stdLib.Date = null
  ): TimePickerProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel)
    if (error != null) __obj.updateDynamic("error")(error)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName)
    if (label != null) __obj.updateDynamic("label")(label)
    if (okLabel != null) __obj.updateDynamic("okLabel")(okLabel)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(onDismiss)
    if (onEscKeyDown != null) __obj.updateDynamic("onEscKeyDown")(onEscKeyDown)
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(onKeyPress)
    if (onOverlayClick != null) __obj.updateDynamic("onOverlayClick")(onOverlayClick)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TimePickerProps]
  }
}


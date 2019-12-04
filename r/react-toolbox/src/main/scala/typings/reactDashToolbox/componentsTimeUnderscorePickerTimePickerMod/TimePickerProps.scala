package typings.reactDashToolbox.componentsTimeUnderscorePickerTimePickerMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
import typings.reactDashToolbox.reactDashToolboxStrings.`24hr`
import typings.reactDashToolbox.reactDashToolboxStrings.ampm
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerProps
  extends /**
  * Additional attributes passed to inner Input component.
  */
/* key */ StringDictionary[js.Any] {
  /**
    * Whether time picker is active.
    * @default false
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * Label used for cancel button.
    * @default "Cancel"
    */
  var cancelLabel: js.UndefOr[String] = js.undefined
  /**
    * Provide error text which will be displayed under the field.
    */
  var error: js.UndefOr[String] = js.undefined
  /**
    * Format to display the clock. It can be 24hr or ampm.
    * @default "24hr"
    */
  var format: js.UndefOr[`24hr` | ampm] = js.undefined
  /**
    * A key to identify an Icon from Material Design Icons or a custom Icon Element.
    */
  var icon: js.UndefOr[ReactNode] = js.undefined
  /**
    * This class will be applied to Input component of TimePicker.
    */
  var inputClassName: js.UndefOr[String] = js.undefined
  /**
    * The text string to use for the floating label element in the input component.
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * Label used for 'OK' button on Dialog.
    * @default "Ok"
    */
  var okLabel: js.UndefOr[String] = js.undefined
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
  var readonly: js.UndefOr[Boolean] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[TimePickerTheme] = js.undefined
  /**
    * Datetime object with currrently selected time.
    */
  var value: js.UndefOr[Date] = js.undefined
}

object TimePickerProps {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Additional attributes passed to inner Input component.
    */
  /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    cancelLabel: String = null,
    error: String = null,
    format: `24hr` | ampm = null,
    icon: ReactNode = null,
    inputClassName: String = null,
    label: String = null,
    okLabel: String = null,
    onChange: js.Function = null,
    onClick: js.Function = null,
    onDismiss: js.Function = null,
    onEscKeyDown: js.Function = null,
    onKeyPress: js.Function = null,
    onOverlayClick: js.Function = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    theme: TimePickerTheme = null,
    value: Date = null
  ): TimePickerProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (okLabel != null) __obj.updateDynamic("okLabel")(okLabel.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(onDismiss.asInstanceOf[js.Any])
    if (onEscKeyDown != null) __obj.updateDynamic("onEscKeyDown")(onEscKeyDown.asInstanceOf[js.Any])
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(onKeyPress.asInstanceOf[js.Any])
    if (onOverlayClick != null) __obj.updateDynamic("onOverlayClick")(onOverlayClick.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerProps]
  }
}


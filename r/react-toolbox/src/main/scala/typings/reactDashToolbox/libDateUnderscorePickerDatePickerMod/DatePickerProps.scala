package typings.reactDashToolbox.libDateUnderscorePickerDatePickerMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Key
import typings.react.reactMod.ReactNode
import typings.reactDashToolbox.libMod.ReactToolbox.Props
import typings.reactDashToolbox.reactDashToolboxStrings.`zh-cn`
import typings.reactDashToolbox.reactDashToolboxStrings.`zh-hk`
import typings.reactDashToolbox.reactDashToolboxStrings.`zh-tw`
import typings.reactDashToolbox.reactDashToolboxStrings.af
import typings.reactDashToolbox.reactDashToolboxStrings.ar
import typings.reactDashToolbox.reactDashToolboxStrings.be
import typings.reactDashToolbox.reactDashToolboxStrings.bg
import typings.reactDashToolbox.reactDashToolboxStrings.bn
import typings.reactDashToolbox.reactDashToolboxStrings.bo
import typings.reactDashToolbox.reactDashToolboxStrings.br
import typings.reactDashToolbox.reactDashToolboxStrings.bs
import typings.reactDashToolbox.reactDashToolboxStrings.ca
import typings.reactDashToolbox.reactDashToolboxStrings.de
import typings.reactDashToolbox.reactDashToolboxStrings.en
import typings.reactDashToolbox.reactDashToolboxStrings.es
import typings.reactDashToolbox.reactDashToolboxStrings.eu
import typings.reactDashToolbox.reactDashToolboxStrings.fr
import typings.reactDashToolbox.reactDashToolboxStrings.gl
import typings.reactDashToolbox.reactDashToolboxStrings.it
import typings.reactDashToolbox.reactDashToolboxStrings.no
import typings.reactDashToolbox.reactDashToolboxStrings.pt
import typings.reactDashToolbox.reactDashToolboxStrings.ru
import typings.reactDashToolbox.reactDashToolboxStrings.ua
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerProps extends Props {
  /**
    * Allows to control if the picker should be shown from outside. Beware you should update the prop when the Dialog is closed.
    * @default false
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * Automatically selects a date upon clicking on a day
    * @default false
    */
  var autoOk: js.UndefOr[Boolean] = js.undefined
  /**
    * Label used for cancel button on Dialog.
    * @default "Cancel"
    */
  var cancelLabel: js.UndefOr[String] = js.undefined
  /**
    * An array of date objects which will be disabled in the calendar. All other dates will be enabled.
    */
  var disabledDates: js.UndefOr[js.Array[Date]] = js.undefined
  /**
    * An array of date objects which will be enabled in the calendar. All other dates will be disabled.
    */
  var enabledDates: js.UndefOr[js.Array[Date]] = js.undefined
  /**
    * Give an error node to display under the field.
    */
  var error: js.UndefOr[String] = js.undefined
  /**
    * A key to identify an Icon from Material Design Icons or a custom Icon Element.
    */
  var icon: js.UndefOr[ReactNode] = js.undefined
  /**
    * This class will be applied to Input component of DatePicker.
    */
  var inputClassName: js.UndefOr[String] = js.undefined
  /**
    * Function to format the date displayed on the input.
    */
  var inputFormat: js.UndefOr[js.Function] = js.undefined
  /**
    * The text string to use for the floating label element in the input component.
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * Sets locale for the Dialog.
    * @default "en"
    */
  var locale: js.UndefOr[
    de | no | en | es | af | ar | be | bg | bn | bo | br | bs | ca | gl | eu | pt | it | fr | ru | ua | `zh-cn` | `zh-hk` | `zh-tw` | DatePickerLocale
  ] = js.undefined
  /**
    * Date object with the maximum selectable date.
    */
  var maxDate: js.UndefOr[Date] = js.undefined
  /**
    * Date object with the minimum selectable date.
    */
  var minDate: js.UndefOr[Date] = js.undefined
  /**
    * Name for the input field.
    */
  var name: js.UndefOr[String] = js.undefined
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
    * Used in case the input is required.
    */
  var required: js.UndefOr[Boolean] = js.undefined
  /**
    * Set week's first day to Sunday. Default week's first day is Monday.
    * @default false
    */
  var sundayFirstDayOfWeek: js.UndefOr[Boolean] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[DatePickerTheme] = js.undefined
  /**
    * Date object with the currently selected date.
    */
  var value: js.UndefOr[Date | String] = js.undefined
}

object DatePickerProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    autoOk: js.UndefOr[Boolean] = js.undefined,
    cancelLabel: String = null,
    className: String = null,
    disabledDates: js.Array[Date] = null,
    enabledDates: js.Array[Date] = null,
    error: String = null,
    icon: ReactNode = null,
    inputClassName: String = null,
    inputFormat: js.Function = null,
    key: Key = null,
    label: String = null,
    locale: de | no | en | es | af | ar | be | bg | bn | bo | br | bs | ca | gl | eu | pt | it | fr | ru | ua | `zh-cn` | `zh-hk` | `zh-tw` | DatePickerLocale = null,
    maxDate: Date = null,
    minDate: Date = null,
    name: String = null,
    okLabel: String = null,
    onChange: js.Function = null,
    onClick: js.Function = null,
    onContextMenu: js.Function = null,
    onDismiss: js.Function = null,
    onDoubleClick: js.Function = null,
    onDrag: js.Function = null,
    onDragEnd: js.Function = null,
    onDragEnter: js.Function = null,
    onDragExit: js.Function = null,
    onDragLeave: js.Function = null,
    onDragOver: js.Function = null,
    onDragStart: js.Function = null,
    onDrop: js.Function = null,
    onEscKeyDown: js.Function = null,
    onKeyPress: js.Function = null,
    onMouseDown: js.Function = null,
    onMouseEnter: js.Function = null,
    onMouseLeave: js.Function = null,
    onMouseMove: js.Function = null,
    onMouseOut: js.Function = null,
    onMouseOver: js.Function = null,
    onMouseUp: js.Function = null,
    onOverlayClick: js.Function = null,
    onTouchCancel: js.Function = null,
    onTouchEnd: js.Function = null,
    onTouchMove: js.Function = null,
    onTouchStart: js.Function = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    sundayFirstDayOfWeek: js.UndefOr[Boolean] = js.undefined,
    theme: DatePickerTheme = null,
    value: Date | String = null
  ): DatePickerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(autoOk)) __obj.updateDynamic("autoOk")(autoOk)
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel)
    if (className != null) __obj.updateDynamic("className")(className)
    if (disabledDates != null) __obj.updateDynamic("disabledDates")(disabledDates)
    if (enabledDates != null) __obj.updateDynamic("enabledDates")(enabledDates)
    if (error != null) __obj.updateDynamic("error")(error)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName)
    if (inputFormat != null) __obj.updateDynamic("inputFormat")(inputFormat)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (name != null) __obj.updateDynamic("name")(name)
    if (okLabel != null) __obj.updateDynamic("okLabel")(okLabel)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(onContextMenu)
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(onDismiss)
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(onDoubleClick)
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag)
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd)
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter)
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(onDragExit)
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave)
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop)
    if (onEscKeyDown != null) __obj.updateDynamic("onEscKeyDown")(onEscKeyDown)
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(onKeyPress)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut)
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (onOverlayClick != null) __obj.updateDynamic("onOverlayClick")(onOverlayClick)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(sundayFirstDayOfWeek)) __obj.updateDynamic("sundayFirstDayOfWeek")(sundayFirstDayOfWeek)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerProps]
  }
}


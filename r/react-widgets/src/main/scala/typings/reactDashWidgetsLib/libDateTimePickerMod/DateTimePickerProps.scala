package typings
package reactDashWidgetsLib.libDateTimePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimePickerProps
  extends reactDashWidgetsLib.libCommonPropsMod.ReactWidgetsCommonDropdownProps[DateTimePickerClass]
     with reactDashWidgetsLib.libCommonPropsMod.AutoFocus {
  /**
    * Whether to show the date picker button.
    * @default true
    * @deprecated Use `date` instead
    */
  var calendar: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Adds a css class to the input container element.
    */
  var containerClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set the culture of the DateTimePicker, passed to the configured localizer.
    */
  var culture: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default current date at which the calendar opens. If none is provided, opens at today's
    * date or the value date (if any).
    * @default Date()
    */
  var currentDate: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * Default value for current date. Useful for suggesting a date when the caldenar opens without keep forcing it once 'value' is set.
    */
  var date: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify the element used to render the calendar dropdown icon.
    */
  var dateIcon: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  /**
    * Default current date
    */
  var defaultCurrentDate: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * The defaultOpen prop can be used to set an
    * initialization value for uncontrolled widgets.
    */
  var defaultOpen: js.UndefOr[
    reactDashWidgetsLib.reactDashWidgetsLibNumbers.`false` | reactDashWidgetsLib.reactDashWidgetsLibStrings.calendar | reactDashWidgetsLib.reactDashWidgetsLibStrings.time
  ] = js.undefined
  /**
    * Default value.
    */
  var defaultValue: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * The speed, in milliseconds, of the either dropdown animation.
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * A string format to be used while the date input has focus. Useful for showing a simpler
    * format for inputing.
    */
  var editFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The highest level view the calendar can navigate up to. This value should be higher than
    * initialView.
    */
  var finalView: js.UndefOr[
    reactDashWidgetsLib.reactDashWidgetsLibStrings.month | reactDashWidgetsLib.reactDashWidgetsLibStrings.year | reactDashWidgetsLib.reactDashWidgetsLibStrings.decade | reactDashWidgetsLib.reactDashWidgetsLibStrings.century
  ] = js.undefined
  /**
    * A string format used to display the date value.
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The starting and lowest level view the calendar can navigate down to.
    */
  var initialView: js.UndefOr[
    reactDashWidgetsLib.reactDashWidgetsLibStrings.month | reactDashWidgetsLib.reactDashWidgetsLibStrings.year | reactDashWidgetsLib.reactDashWidgetsLibStrings.decade | reactDashWidgetsLib.reactDashWidgetsLibStrings.century
  ] = js.undefined
  /**
    * An object of props that is passed directly to the underlying input component.
    */
  var inputProps: js.UndefOr[js.Object] = js.undefined
  /**
    * The maximum Date that can be selected. Max only limits selection, it doesn't constrain
    * the date values that can be typed or pasted into the widget. If you need this behavior
    * you can constrain values via the onChange handler.
    * @default Date(2099, 11, 31)
    */
  var max: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * Object hash containing display text and/or text for screen readers. Use the messages
    * object to localize widget text and increase accessibility.
    */
  var messages: js.UndefOr[DateTimePickerMessages] = js.undefined
  /**
    * The minimum Date that can be selected. Min only limits selection, it doesn't constrain
    * the date values that can be typed or pasted into the widget. If you need this behavior
    * you can constrain values via the onChange handler.
    * @default Date(1900, 0, 1)
    */
  var min: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * The HTML name attribute, passed directly to the input element.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The native onBlur event, called when focus leaves the DateTimePicker entirely.
    */
  var onBlur: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Change event Handler that is called when the value is changed. The handler is called with
    * both the current Date object (or null if it was not parseable), and the second argument
    * is a string representation of the date value, formated by the format prop.
    */
  var onChange: js.UndefOr[
    js.Function2[
      /* date */ js.UndefOr[stdLib.Date], 
      /* dateStr */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Change event Handler that is called when the currentDate is changed. The handler is
    * called with the currentDate object.
    */
  var onCurrentDateChange: js.UndefOr[js.Function1[/* date */ js.UndefOr[stdLib.Date], scala.Unit]] = js.undefined
  /**
    * The native onFocus event, called when focus enters the DateTimePicker.
    */
  var onFocus: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * The native onKeyDown event, called preventDefault will prevent any custom behavior, included keyboard shortcuts.
    */
  var onKeyDown: js.UndefOr[js.Function1[/* event */ reactLib.reactMod.KeyboardEvent[_], scala.Unit]] = js.undefined
  /**
    * The native onKeyPress event, called preventDefault will stop any custom behavior.
    */
  var onKeyPress: js.UndefOr[js.Function1[/* event */ reactLib.reactMod.KeyboardEvent[_], scala.Unit]] = js.undefined
  /**
    * This handler fires when an item has been selected from the list or calendar. It fires
    * before the onChange handler, and fires regardless of whether the value has actually
    * changed.
    */
  var onSelect: js.UndefOr[js.Function1[/* date */ js.UndefOr[stdLib.Date], scala.Unit]] = js.undefined
  /**
    * Called when the DateTimePicker is about to open or close. onToggle should be used when
    * the open prop is set otherwise the widget will never open or close.
    */
  var onToggle: js.UndefOr[js.Function1[/* isOpen */ scala.Boolean, scala.Unit]] = js.undefined
  /**
    * Whether or not the DateTimePicker is open. When unset (undefined) the DateTimePicker will
    * handle the opening and closing internally.
    * @default false
    */
  var open: js.UndefOr[
    reactDashWidgetsLib.reactDashWidgetsLibNumbers.`false` | reactDashWidgetsLib.reactDashWidgetsLibStrings.date | reactDashWidgetsLib.reactDashWidgetsLibStrings.time
  ] = js.undefined
  /**
    * Determines how the widget parses the typed date string into a Date object. You can
    * provide an array of formats to try, or provide a function that returns a date to handle
    * parsing yourself. When parse is unspecified and the format prop is a String parse will
    * automatically use that format as its default
    */
  var parse: js.UndefOr[
    (js.Function1[/* str */ java.lang.String, stdLib.Date]) | js.Array[java.lang.String] | java.lang.String
  ] = js.undefined
  /**
    * Text to display in the input when the value is empty.
    */
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A Transition component from react-transition-group v2.
    * The provided component will be used instead of the default SlideDownTransition for fully customizable animations.
    * The transition component is also injected with a dropUp prop indicating the direction it should open.
    */
  var popupTransition: js.UndefOr[reactLib.reactMod.ReactType[_] | java.lang.String] = js.undefined
  /**
    * The amount of minutes between each entry in the time list.
    */
  var step: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  /**
    * Whether to show the time picker button.
    * @default true
    */
  var time: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A customize the rendering of times but providing a custom component.
    */
  var timeComponent: js.UndefOr[reactLib.reactMod.ReactType[_] | java.lang.String] = js.undefined
  /**
    * A string format used by the time dropdown to render times.
    */
  var timeFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specify the element used to render the time list dropdown icon.
    */
  var timeIcon: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  /**
    * The current selected date, should be a Date instance or null.
    */
  var value: js.UndefOr[stdLib.Date] = js.undefined
}

object DateTimePickerProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    calendar: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNode = null,
    containerClassName: java.lang.String = null,
    culture: java.lang.String = null,
    currentDate: stdLib.Date = null,
    date: js.UndefOr[scala.Boolean] = js.undefined,
    dateIcon: reactLib.reactMod.Global.JSXNs.Element = null,
    defaultCurrentDate: stdLib.Date = null,
    defaultOpen: reactDashWidgetsLib.reactDashWidgetsLibNumbers.`false` | reactDashWidgetsLib.reactDashWidgetsLibStrings.calendar | reactDashWidgetsLib.reactDashWidgetsLibStrings.time = null,
    defaultValue: stdLib.Date = null,
    disabled: scala.Boolean | js.Array[_] = null,
    dropUp: js.UndefOr[scala.Boolean] = js.undefined,
    duration: scala.Int | scala.Double = null,
    editFormat: java.lang.String = null,
    finalView: reactDashWidgetsLib.reactDashWidgetsLibStrings.month | reactDashWidgetsLib.reactDashWidgetsLibStrings.year | reactDashWidgetsLib.reactDashWidgetsLibStrings.decade | reactDashWidgetsLib.reactDashWidgetsLibStrings.century = null,
    format: java.lang.String = null,
    id: java.lang.String = null,
    initialView: reactDashWidgetsLib.reactDashWidgetsLibStrings.month | reactDashWidgetsLib.reactDashWidgetsLibStrings.year | reactDashWidgetsLib.reactDashWidgetsLibStrings.decade | reactDashWidgetsLib.reactDashWidgetsLibStrings.century = null,
    inputProps: js.Object = null,
    isRtl: js.UndefOr[scala.Boolean] = js.undefined,
    key: reactLib.reactMod.Key = null,
    max: stdLib.Date = null,
    messages: DateTimePickerMessages = null,
    min: stdLib.Date = null,
    name: java.lang.String = null,
    onBlur: () => scala.Unit = null,
    onChange: (/* date */ js.UndefOr[stdLib.Date], /* dateStr */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    onCurrentDateChange: /* date */ js.UndefOr[stdLib.Date] => scala.Unit = null,
    onFocus: () => scala.Unit = null,
    onKeyDown: /* event */ reactLib.reactMod.KeyboardEvent[_] => scala.Unit = null,
    onKeyPress: /* event */ reactLib.reactMod.KeyboardEvent[_] => scala.Unit = null,
    onSelect: /* date */ js.UndefOr[stdLib.Date] => scala.Unit = null,
    onToggle: /* isOpen */ scala.Boolean => scala.Unit = null,
    open: reactDashWidgetsLib.reactDashWidgetsLibNumbers.`false` | reactDashWidgetsLib.reactDashWidgetsLibStrings.date | reactDashWidgetsLib.reactDashWidgetsLibStrings.time = null,
    parse: (js.Function1[/* str */ java.lang.String, stdLib.Date]) | js.Array[java.lang.String] | java.lang.String = null,
    placeholder: java.lang.String = null,
    popupTransition: reactLib.reactMod.ReactType[_] | java.lang.String = null,
    readOnly: scala.Boolean | js.Array[_] = null,
    ref: reactLib.reactMod.LegacyRef[DateTimePickerClass] = null,
    step: scala.Double | scala.Boolean = null,
    time: js.UndefOr[scala.Boolean] = js.undefined,
    timeComponent: reactLib.reactMod.ReactType[_] | java.lang.String = null,
    timeFormat: java.lang.String = null,
    timeIcon: reactLib.reactMod.Global.JSXNs.Element = null,
    value: stdLib.Date = null
  ): DateTimePickerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (!js.isUndefined(calendar)) __obj.updateDynamic("calendar")(calendar)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName)
    if (culture != null) __obj.updateDynamic("culture")(culture)
    if (currentDate != null) __obj.updateDynamic("currentDate")(currentDate)
    if (!js.isUndefined(date)) __obj.updateDynamic("date")(date)
    if (dateIcon != null) __obj.updateDynamic("dateIcon")(dateIcon)
    if (defaultCurrentDate != null) __obj.updateDynamic("defaultCurrentDate")(defaultCurrentDate)
    if (defaultOpen != null) __obj.updateDynamic("defaultOpen")(defaultOpen.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(dropUp)) __obj.updateDynamic("dropUp")(dropUp)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (editFormat != null) __obj.updateDynamic("editFormat")(editFormat)
    if (finalView != null) __obj.updateDynamic("finalView")(finalView.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (id != null) __obj.updateDynamic("id")(id)
    if (initialView != null) __obj.updateDynamic("initialView")(initialView.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps)
    if (!js.isUndefined(isRtl)) __obj.updateDynamic("isRtl")(isRtl)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (min != null) __obj.updateDynamic("min")(min)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction0(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onCurrentDateChange != null) __obj.updateDynamic("onCurrentDateChange")(js.Any.fromFunction1(onCurrentDateChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction0(onFocus))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1(onToggle))
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (popupTransition != null) __obj.updateDynamic("popupTransition")(popupTransition.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time)
    if (timeComponent != null) __obj.updateDynamic("timeComponent")(timeComponent.asInstanceOf[js.Any])
    if (timeFormat != null) __obj.updateDynamic("timeFormat")(timeFormat)
    if (timeIcon != null) __obj.updateDynamic("timeIcon")(timeIcon)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DateTimePickerProps]
  }
}


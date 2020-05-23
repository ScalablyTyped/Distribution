package typings.reactDayPicker.propsMod

import typings.react.mod.FocusEvent
import typings.reactDayPicker.classNamesMod.InputClassNames
import typings.reactDayPicker.dayPickerInputMod.default
import typings.reactDayPicker.modifiersMod.DayModifiers
import typings.std.Date
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DayPickerInputProps extends js.Object {
  var classNames: js.UndefOr[InputClassNames] = js.undefined
  var clickUnselectsDay: js.UndefOr[Boolean] = js.undefined
  var component: js.UndefOr[js.Any] = js.undefined
  var dayPickerProps: js.UndefOr[DayPickerProps] = js.undefined
  var format: js.UndefOr[String | js.Array[String]] = js.undefined
  var formatDate: js.UndefOr[js.Function3[/* date */ Date, /* format */ String, /* locale */ String, String]] = js.undefined
  var hideOnDayClick: js.UndefOr[Boolean] = js.undefined
  var inputProps: js.UndefOr[js.Object] = js.undefined
  var keepFocus: js.UndefOr[Boolean] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLDivElement], Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLDivElement], Unit]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLDivElement], Unit]] = js.undefined
  var onDayChange: js.UndefOr[
    js.Function3[/* day */ Date, /* DayModifiers */ DayModifiers, /* dayPickerInput */ default, Unit]
  ] = js.undefined
  var onDayPickerHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onDayPickerShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLDivElement], Unit]] = js.undefined
  var onKeyUp: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLDivElement], Unit]] = js.undefined
  var overlayComponent: js.UndefOr[js.Any] = js.undefined
  var parseDate: js.UndefOr[
    js.Function3[/* str */ String, /* format */ String, /* locale */ String, Date | Unit]
  ] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var showOverlay: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var value: js.UndefOr[String | Date] = js.undefined
}

object DayPickerInputProps {
  @scala.inline
  def apply(
    classNames: InputClassNames = null,
    clickUnselectsDay: js.UndefOr[Boolean] = js.undefined,
    component: js.Any = null,
    dayPickerProps: DayPickerProps = null,
    format: String | js.Array[String] = null,
    formatDate: (/* date */ Date, /* format */ String, /* locale */ String) => String = null,
    hideOnDayClick: js.UndefOr[Boolean] = js.undefined,
    inputProps: js.Object = null,
    keepFocus: js.UndefOr[Boolean] = js.undefined,
    onBlur: /* e */ FocusEvent[HTMLDivElement] => Unit = null,
    onChange: /* e */ FocusEvent[HTMLDivElement] => Unit = null,
    onClick: /* e */ FocusEvent[HTMLDivElement] => Unit = null,
    onDayChange: (/* day */ Date, /* DayModifiers */ DayModifiers, /* dayPickerInput */ default) => Unit = null,
    onDayPickerHide: () => Unit = null,
    onDayPickerShow: () => Unit = null,
    onFocus: /* e */ FocusEvent[HTMLDivElement] => Unit = null,
    onKeyUp: /* e */ FocusEvent[HTMLDivElement] => Unit = null,
    overlayComponent: js.Any = null,
    parseDate: (/* str */ String, /* format */ String, /* locale */ String) => Date | Unit = null,
    placeholder: String = null,
    showOverlay: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    value: String | Date = null
  ): DayPickerInputProps = {
    val __obj = js.Dynamic.literal()
    if (classNames != null) __obj.updateDynamic("classNames")(classNames.asInstanceOf[js.Any])
    if (!js.isUndefined(clickUnselectsDay)) __obj.updateDynamic("clickUnselectsDay")(clickUnselectsDay.get.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (dayPickerProps != null) __obj.updateDynamic("dayPickerProps")(dayPickerProps.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formatDate != null) __obj.updateDynamic("formatDate")(js.Any.fromFunction3(formatDate))
    if (!js.isUndefined(hideOnDayClick)) __obj.updateDynamic("hideOnDayClick")(hideOnDayClick.get.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (!js.isUndefined(keepFocus)) __obj.updateDynamic("keepFocus")(keepFocus.get.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onDayChange != null) __obj.updateDynamic("onDayChange")(js.Any.fromFunction3(onDayChange))
    if (onDayPickerHide != null) __obj.updateDynamic("onDayPickerHide")(js.Any.fromFunction0(onDayPickerHide))
    if (onDayPickerShow != null) __obj.updateDynamic("onDayPickerShow")(js.Any.fromFunction0(onDayPickerShow))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (overlayComponent != null) __obj.updateDynamic("overlayComponent")(overlayComponent.asInstanceOf[js.Any])
    if (parseDate != null) __obj.updateDynamic("parseDate")(js.Any.fromFunction3(parseDate))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(showOverlay)) __obj.updateDynamic("showOverlay")(showOverlay.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayPickerInputProps]
  }
}


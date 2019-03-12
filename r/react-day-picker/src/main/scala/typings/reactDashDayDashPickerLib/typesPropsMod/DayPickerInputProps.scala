package typings
package reactDashDayDashPickerLib.typesPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DayPickerInputProps extends js.Object {
  var classNames: js.UndefOr[reactDashDayDashPickerLib.typesCommonMod.InputClassNames] = js.undefined
  var clickUnselectsDay: js.UndefOr[scala.Boolean] = js.undefined
  // Not sure React.ComponentClass<any> is the right type for _propTypes2.default.any
  var component: js.UndefOr[js.Any] = js.undefined
  var dayPickerProps: js.UndefOr[DayPickerProps] = js.undefined
  var format: java.lang.String | js.Array[java.lang.String]
  var formatDate: js.UndefOr[
    js.Function3[
      /* date */ stdLib.Date, 
      /* format */ java.lang.String, 
      /* locale */ java.lang.String, 
      java.lang.String
    ]
  ] = js.undefined
  var hideOnDayClick: js.UndefOr[scala.Boolean] = js.undefined
  var inputProps: js.UndefOr[js.Object] = js.undefined
  var keepFocus: js.UndefOr[scala.Boolean] = js.undefined
  var onBlur: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.ReactNs.FocusEvent[stdLib.HTMLDivElement], scala.Unit]
  ] = js.undefined
  var onChange: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.ReactNs.FocusEvent[stdLib.HTMLDivElement], scala.Unit]
  ] = js.undefined
  var onClick: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.ReactNs.FocusEvent[stdLib.HTMLDivElement], scala.Unit]
  ] = js.undefined
  var onDayChange: js.UndefOr[
    js.Function3[
      /* day */ stdLib.Date, 
      /* DayModifiers */ reactDashDayDashPickerLib.typesCommonMod.DayModifiers, 
      /* dayPickerInput */ reactDashDayDashPickerLib.typesDayPickerInputMod.DayPickerInput, 
      scala.Unit
    ]
  ] = js.undefined
  var onDayPickerHide: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onDayPickerShow: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onFocus: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.ReactNs.FocusEvent[stdLib.HTMLDivElement], scala.Unit]
  ] = js.undefined
  var onKeyUp: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.ReactNs.FocusEvent[stdLib.HTMLDivElement], scala.Unit]
  ] = js.undefined
  var overlayComponent: js.UndefOr[js.Any] = js.undefined
  var parseDate: js.UndefOr[
    js.Function3[
      /* str */ java.lang.String, 
      /* format */ java.lang.String, 
      /* locale */ java.lang.String, 
      stdLib.Date | scala.Unit
    ]
  ] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var showOverlay: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
}

object DayPickerInputProps {
  @scala.inline
  def apply(
    format: java.lang.String | js.Array[java.lang.String],
    classNames: reactDashDayDashPickerLib.typesCommonMod.InputClassNames = null,
    clickUnselectsDay: js.UndefOr[scala.Boolean] = js.undefined,
    component: js.Any = null,
    dayPickerProps: DayPickerProps = null,
    formatDate: (/* date */ stdLib.Date, /* format */ java.lang.String, /* locale */ java.lang.String) => java.lang.String = null,
    hideOnDayClick: js.UndefOr[scala.Boolean] = js.undefined,
    inputProps: js.Object = null,
    keepFocus: js.UndefOr[scala.Boolean] = js.undefined,
    onBlur: /* e */ reactLib.reactMod.ReactNs.FocusEvent[stdLib.HTMLDivElement] => scala.Unit = null,
    onChange: /* e */ reactLib.reactMod.ReactNs.FocusEvent[stdLib.HTMLDivElement] => scala.Unit = null,
    onClick: /* e */ reactLib.reactMod.ReactNs.FocusEvent[stdLib.HTMLDivElement] => scala.Unit = null,
    onDayChange: (/* day */ stdLib.Date, /* DayModifiers */ reactDashDayDashPickerLib.typesCommonMod.DayModifiers, /* dayPickerInput */ reactDashDayDashPickerLib.typesDayPickerInputMod.DayPickerInput) => scala.Unit = null,
    onDayPickerHide: () => scala.Unit = null,
    onDayPickerShow: () => scala.Unit = null,
    onFocus: /* e */ reactLib.reactMod.ReactNs.FocusEvent[stdLib.HTMLDivElement] => scala.Unit = null,
    onKeyUp: /* e */ reactLib.reactMod.ReactNs.FocusEvent[stdLib.HTMLDivElement] => scala.Unit = null,
    overlayComponent: js.Any = null,
    parseDate: (/* str */ java.lang.String, /* format */ java.lang.String, /* locale */ java.lang.String) => stdLib.Date | scala.Unit = null,
    placeholder: java.lang.String = null,
    showOverlay: js.UndefOr[scala.Boolean] = js.undefined,
    value: java.lang.String | stdLib.Date = null
  ): DayPickerInputProps = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    if (classNames != null) __obj.updateDynamic("classNames")(classNames)
    if (!js.isUndefined(clickUnselectsDay)) __obj.updateDynamic("clickUnselectsDay")(clickUnselectsDay)
    if (component != null) __obj.updateDynamic("component")(component)
    if (dayPickerProps != null) __obj.updateDynamic("dayPickerProps")(dayPickerProps)
    if (formatDate != null) __obj.updateDynamic("formatDate")(js.Any.fromFunction3(formatDate))
    if (!js.isUndefined(hideOnDayClick)) __obj.updateDynamic("hideOnDayClick")(hideOnDayClick)
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps)
    if (!js.isUndefined(keepFocus)) __obj.updateDynamic("keepFocus")(keepFocus)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onDayChange != null) __obj.updateDynamic("onDayChange")(js.Any.fromFunction3(onDayChange))
    if (onDayPickerHide != null) __obj.updateDynamic("onDayPickerHide")(js.Any.fromFunction0(onDayPickerHide))
    if (onDayPickerShow != null) __obj.updateDynamic("onDayPickerShow")(js.Any.fromFunction0(onDayPickerShow))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (overlayComponent != null) __obj.updateDynamic("overlayComponent")(overlayComponent)
    if (parseDate != null) __obj.updateDynamic("parseDate")(js.Any.fromFunction3(parseDate))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(showOverlay)) __obj.updateDynamic("showOverlay")(showOverlay)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayPickerInputProps]
  }
}


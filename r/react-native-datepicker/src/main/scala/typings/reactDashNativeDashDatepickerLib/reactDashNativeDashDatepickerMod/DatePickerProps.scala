package typings
package reactDashNativeDashDatepickerLib.reactDashNativeDashDatepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerProps extends js.Object {
  var TouchableComponent: js.UndefOr[reactLib.reactMod.Component[js.Object, js.Object, _]] = js.undefined
  var allowFontScaling: js.UndefOr[scala.Boolean] = js.undefined
  var androidMode: js.UndefOr[
    reactDashNativeDashDatepickerLib.reactDashNativeDashDatepickerLibStrings.default | reactDashNativeDashDatepickerLib.reactDashNativeDashDatepickerLibStrings.calendar | reactDashNativeDashDatepickerLib.reactDashNativeDashDatepickerLibStrings.spinner
  ] = js.undefined
  var cancelBtnTestID: js.UndefOr[java.lang.String] = js.undefined
  var cancelBtnText: js.UndefOr[java.lang.String] = js.undefined
  var confirmBtnTestID: js.UndefOr[java.lang.String] = js.undefined
  var confirmBtnText: js.UndefOr[java.lang.String] = js.undefined
  var customStyles: js.UndefOr[DatePickerCustomStylesProps] = js.undefined
  var date: js.UndefOr[java.lang.String | stdLib.Date | momentLib.momentMod.Moment] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var getDateStr: js.UndefOr[js.Function1[/* date */ stdLib.Date, java.lang.String]] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var hideText: js.UndefOr[scala.Boolean] = js.undefined
  var iconComponent: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  var iconSource: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ImageURISource] = js.undefined
  var is24Hour: js.UndefOr[scala.Boolean] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var maxDate: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
  var minDate: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
  var minuteInterval: js.UndefOr[scala.Double] = js.undefined
  var modalOnResponderTerminationRequest: js.UndefOr[js.Function1[/* e */ js.Any, scala.Boolean]] = js.undefined
  var mode: js.UndefOr[
    reactDashNativeDashDatepickerLib.reactDashNativeDashDatepickerLibStrings.date | reactDashNativeDashDatepickerLib.reactDashNativeDashDatepickerLibStrings.datetime | reactDashNativeDashDatepickerLib.reactDashNativeDashDatepickerLibStrings.time
  ] = js.undefined
  var onCloseModal: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onDateChange: js.UndefOr[js.Function2[/* dateStr */ java.lang.String, /* date */ stdLib.Date, scala.Unit]] = js.undefined
  var onOpenModal: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPressMask: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var showIcon: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactDashNativeLib.reactDashNativeMod.StyleProp[_]] = js.undefined
  var testID: js.UndefOr[java.lang.String] = js.undefined
  var timeZoneOffsetInMinutes: js.UndefOr[scala.Double] = js.undefined
}

object DatePickerProps {
  @scala.inline
  def apply(
    TouchableComponent: reactLib.reactMod.Component[js.Object, js.Object, _] = null,
    allowFontScaling: js.UndefOr[scala.Boolean] = js.undefined,
    androidMode: reactDashNativeDashDatepickerLib.reactDashNativeDashDatepickerLibStrings.default | reactDashNativeDashDatepickerLib.reactDashNativeDashDatepickerLibStrings.calendar | reactDashNativeDashDatepickerLib.reactDashNativeDashDatepickerLibStrings.spinner = null,
    cancelBtnTestID: java.lang.String = null,
    cancelBtnText: java.lang.String = null,
    confirmBtnTestID: java.lang.String = null,
    confirmBtnText: java.lang.String = null,
    customStyles: DatePickerCustomStylesProps = null,
    date: java.lang.String | stdLib.Date | momentLib.momentMod.Moment = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    duration: scala.Int | scala.Double = null,
    format: java.lang.String = null,
    getDateStr: /* date */ stdLib.Date => java.lang.String = null,
    height: scala.Int | scala.Double = null,
    hideText: js.UndefOr[scala.Boolean] = js.undefined,
    iconComponent: reactLib.reactMod.Global.JSXNs.Element = null,
    iconSource: reactDashNativeLib.reactDashNativeMod.ImageURISource = null,
    is24Hour: js.UndefOr[scala.Boolean] = js.undefined,
    locale: java.lang.String = null,
    maxDate: java.lang.String | stdLib.Date = null,
    minDate: java.lang.String | stdLib.Date = null,
    minuteInterval: scala.Int | scala.Double = null,
    modalOnResponderTerminationRequest: /* e */ js.Any => scala.Boolean = null,
    mode: reactDashNativeDashDatepickerLib.reactDashNativeDashDatepickerLibStrings.date | reactDashNativeDashDatepickerLib.reactDashNativeDashDatepickerLibStrings.datetime | reactDashNativeDashDatepickerLib.reactDashNativeDashDatepickerLibStrings.time = null,
    onCloseModal: () => scala.Unit = null,
    onDateChange: (/* dateStr */ java.lang.String, /* date */ stdLib.Date) => scala.Unit = null,
    onOpenModal: () => scala.Unit = null,
    onPressMask: () => scala.Unit = null,
    placeholder: java.lang.String = null,
    showIcon: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[_] = null,
    testID: java.lang.String = null,
    timeZoneOffsetInMinutes: scala.Int | scala.Double = null
  ): DatePickerProps = {
    val __obj = js.Dynamic.literal()
    if (TouchableComponent != null) __obj.updateDynamic("TouchableComponent")(TouchableComponent)
    if (!js.isUndefined(allowFontScaling)) __obj.updateDynamic("allowFontScaling")(allowFontScaling)
    if (androidMode != null) __obj.updateDynamic("androidMode")(androidMode.asInstanceOf[js.Any])
    if (cancelBtnTestID != null) __obj.updateDynamic("cancelBtnTestID")(cancelBtnTestID)
    if (cancelBtnText != null) __obj.updateDynamic("cancelBtnText")(cancelBtnText)
    if (confirmBtnTestID != null) __obj.updateDynamic("confirmBtnTestID")(confirmBtnTestID)
    if (confirmBtnText != null) __obj.updateDynamic("confirmBtnText")(confirmBtnText)
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles)
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (getDateStr != null) __obj.updateDynamic("getDateStr")(js.Any.fromFunction1(getDateStr))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hideText)) __obj.updateDynamic("hideText")(hideText)
    if (iconComponent != null) __obj.updateDynamic("iconComponent")(iconComponent)
    if (iconSource != null) __obj.updateDynamic("iconSource")(iconSource)
    if (!js.isUndefined(is24Hour)) __obj.updateDynamic("is24Hour")(is24Hour)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minuteInterval != null) __obj.updateDynamic("minuteInterval")(minuteInterval.asInstanceOf[js.Any])
    if (modalOnResponderTerminationRequest != null) __obj.updateDynamic("modalOnResponderTerminationRequest")(js.Any.fromFunction1(modalOnResponderTerminationRequest))
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onCloseModal != null) __obj.updateDynamic("onCloseModal")(js.Any.fromFunction0(onCloseModal))
    if (onDateChange != null) __obj.updateDynamic("onDateChange")(js.Any.fromFunction2(onDateChange))
    if (onOpenModal != null) __obj.updateDynamic("onOpenModal")(js.Any.fromFunction0(onOpenModal))
    if (onPressMask != null) __obj.updateDynamic("onPressMask")(js.Any.fromFunction0(onPressMask))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (timeZoneOffsetInMinutes != null) __obj.updateDynamic("timeZoneOffsetInMinutes")(timeZoneOffsetInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerProps]
  }
}


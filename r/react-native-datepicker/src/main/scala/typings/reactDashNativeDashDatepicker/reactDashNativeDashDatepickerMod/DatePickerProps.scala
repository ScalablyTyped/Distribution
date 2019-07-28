package typings.reactDashNativeDashDatepicker.reactDashNativeDashDatepickerMod

import typings.moment.momentMod.Moment
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSXNs.Element
import typings.reactDashNative.reactDashNativeMod.ImageURISource
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNativeDashDatepicker.reactDashNativeDashDatepickerStrings.calendar
import typings.reactDashNativeDashDatepicker.reactDashNativeDashDatepickerStrings.date
import typings.reactDashNativeDashDatepicker.reactDashNativeDashDatepickerStrings.datetime
import typings.reactDashNativeDashDatepicker.reactDashNativeDashDatepickerStrings.spinner
import typings.reactDashNativeDashDatepicker.reactDashNativeDashDatepickerStrings.time
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerProps extends js.Object {
  var TouchableComponent: js.UndefOr[Component[js.Object, js.Object, _]] = js.undefined
  var allowFontScaling: js.UndefOr[Boolean] = js.undefined
  var androidMode: js.UndefOr[
    typings.reactDashNativeDashDatepicker.reactDashNativeDashDatepickerStrings.default | calendar | spinner
  ] = js.undefined
  var cancelBtnTestID: js.UndefOr[String] = js.undefined
  var cancelBtnText: js.UndefOr[String] = js.undefined
  var confirmBtnTestID: js.UndefOr[String] = js.undefined
  var confirmBtnText: js.UndefOr[String] = js.undefined
  var customStyles: js.UndefOr[DatePickerCustomStylesProps] = js.undefined
  var date: js.UndefOr[String | Date | Moment] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var getDateStr: js.UndefOr[js.Function1[/* date */ Date, String]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hideText: js.UndefOr[Boolean] = js.undefined
  var iconComponent: js.UndefOr[Element] = js.undefined
  var iconSource: js.UndefOr[ImageURISource] = js.undefined
  var is24Hour: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var maxDate: js.UndefOr[String | Date] = js.undefined
  var minDate: js.UndefOr[String | Date] = js.undefined
  var minuteInterval: js.UndefOr[Double] = js.undefined
  var modalOnResponderTerminationRequest: js.UndefOr[js.Function1[/* e */ js.Any, Boolean]] = js.undefined
  var mode: js.UndefOr[date | datetime | time] = js.undefined
  var onCloseModal: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onDateChange: js.UndefOr[js.Function2[/* dateStr */ String, /* date */ Date, Unit]] = js.undefined
  var onOpenModal: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPressMask: js.UndefOr[js.Function0[Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var showIcon: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[StyleProp[_]] = js.undefined
  var testID: js.UndefOr[String] = js.undefined
  var timeZoneOffsetInMinutes: js.UndefOr[Double] = js.undefined
}

object DatePickerProps {
  @scala.inline
  def apply(
    TouchableComponent: Component[js.Object, js.Object, _] = null,
    allowFontScaling: js.UndefOr[Boolean] = js.undefined,
    androidMode: typings.reactDashNativeDashDatepicker.reactDashNativeDashDatepickerStrings.default | calendar | spinner = null,
    cancelBtnTestID: String = null,
    cancelBtnText: String = null,
    confirmBtnTestID: String = null,
    confirmBtnText: String = null,
    customStyles: DatePickerCustomStylesProps = null,
    date: String | Date | Moment = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    format: String = null,
    getDateStr: /* date */ Date => String = null,
    height: Int | Double = null,
    hideText: js.UndefOr[Boolean] = js.undefined,
    iconComponent: Element = null,
    iconSource: ImageURISource = null,
    is24Hour: js.UndefOr[Boolean] = js.undefined,
    locale: String = null,
    maxDate: String | Date = null,
    minDate: String | Date = null,
    minuteInterval: Int | Double = null,
    modalOnResponderTerminationRequest: /* e */ js.Any => Boolean = null,
    mode: date | datetime | time = null,
    onCloseModal: () => Unit = null,
    onDateChange: (/* dateStr */ String, /* date */ Date) => Unit = null,
    onOpenModal: () => Unit = null,
    onPressMask: () => Unit = null,
    placeholder: String = null,
    showIcon: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[_] = null,
    testID: String = null,
    timeZoneOffsetInMinutes: Int | Double = null
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


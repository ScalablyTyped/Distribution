package typings.rmcDashDateDashPicker.libIDatePickerPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatePickerProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var date: js.UndefOr[js.Any] = js.undefined
  var defaultDate: js.UndefOr[js.Any] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var formatDay: js.UndefOr[js.Function2[/* day */ Double, /* date */ js.UndefOr[js.Any], _]] = js.undefined
  var formatMonth: js.UndefOr[js.Function2[/* month */ Double, /* date */ js.UndefOr[js.Any], _]] = js.undefined
  var itemStyle: js.UndefOr[js.Any] = js.undefined
  var locale: js.UndefOr[js.Any] = js.undefined
  var maxDate: js.UndefOr[js.Any] = js.undefined
  var maxHour: js.UndefOr[Double] = js.undefined
  var maxMinute: js.UndefOr[Double] = js.undefined
  var minDate: js.UndefOr[js.Any] = js.undefined
  var minHour: js.UndefOr[Double] = js.undefined
  var minMinute: js.UndefOr[Double] = js.undefined
  var minuteStep: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var onDateChange: js.UndefOr[js.Function1[/* date */ js.Any, Unit]] = js.undefined
  /** web only */
  var onScrollChange: js.UndefOr[js.Function3[/* date */ js.Any, /* vals */ js.Any, /* index */ Double, Unit]] = js.undefined
  var onValueChange: js.UndefOr[js.Function2[/* vals */ js.Any, /* index */ Double, Unit]] = js.undefined
  var pickerPrefixCls: js.UndefOr[String] = js.undefined
  /** web only */
  var prefixCls: js.UndefOr[String] = js.undefined
  var rootNativeProps: js.UndefOr[js.Object] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var use12Hours: js.UndefOr[Boolean] = js.undefined
}

object IDatePickerProps {
  @scala.inline
  def apply(
    className: String = null,
    date: js.Any = null,
    defaultDate: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    formatDay: (/* day */ Double, /* date */ js.UndefOr[js.Any]) => _ = null,
    formatMonth: (/* month */ Double, /* date */ js.UndefOr[js.Any]) => _ = null,
    itemStyle: js.Any = null,
    locale: js.Any = null,
    maxDate: js.Any = null,
    maxHour: Int | Double = null,
    maxMinute: Int | Double = null,
    minDate: js.Any = null,
    minHour: Int | Double = null,
    minMinute: Int | Double = null,
    minuteStep: Int | Double = null,
    mode: String = null,
    onDateChange: /* date */ js.Any => Unit = null,
    onScrollChange: (/* date */ js.Any, /* vals */ js.Any, /* index */ Double) => Unit = null,
    onValueChange: (/* vals */ js.Any, /* index */ Double) => Unit = null,
    pickerPrefixCls: String = null,
    prefixCls: String = null,
    rootNativeProps: js.Object = null,
    style: js.Any = null,
    use12Hours: js.UndefOr[Boolean] = js.undefined
  ): IDatePickerProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (formatDay != null) __obj.updateDynamic("formatDay")(js.Any.fromFunction2(formatDay))
    if (formatMonth != null) __obj.updateDynamic("formatMonth")(js.Any.fromFunction2(formatMonth))
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (maxHour != null) __obj.updateDynamic("maxHour")(maxHour.asInstanceOf[js.Any])
    if (maxMinute != null) __obj.updateDynamic("maxMinute")(maxMinute.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minHour != null) __obj.updateDynamic("minHour")(minHour.asInstanceOf[js.Any])
    if (minMinute != null) __obj.updateDynamic("minMinute")(minMinute.asInstanceOf[js.Any])
    if (minuteStep != null) __obj.updateDynamic("minuteStep")(minuteStep.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onDateChange != null) __obj.updateDynamic("onDateChange")(js.Any.fromFunction1(onDateChange))
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(js.Any.fromFunction3(onScrollChange))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction2(onValueChange))
    if (pickerPrefixCls != null) __obj.updateDynamic("pickerPrefixCls")(pickerPrefixCls.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (rootNativeProps != null) __obj.updateDynamic("rootNativeProps")(rootNativeProps.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(use12Hours)) __obj.updateDynamic("use12Hours")(use12Hours.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatePickerProps]
  }
}


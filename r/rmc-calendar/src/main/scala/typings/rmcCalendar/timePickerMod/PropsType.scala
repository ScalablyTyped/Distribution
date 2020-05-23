package typings.rmcCalendar.timePickerMod

import typings.rmcCalendar.dataTypesMod.Models.Locale
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType extends js.Object {
  var clientHeight: js.UndefOr[Double] = js.undefined
  var defaultValue: js.UndefOr[Date] = js.undefined
  var locale: Locale
  var maxDate: js.UndefOr[Date] = js.undefined
  var minDate: js.UndefOr[Date] = js.undefined
  var onValueChange: js.UndefOr[js.Function1[/* time */ Date, Unit]] = js.undefined
  var pickerPrefixCls: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Date] = js.undefined
}

object PropsType {
  @scala.inline
  def apply(
    locale: Locale,
    clientHeight: js.UndefOr[Double] = js.undefined,
    defaultValue: Date = null,
    maxDate: Date = null,
    minDate: Date = null,
    onValueChange: /* time */ Date => Unit = null,
    pickerPrefixCls: String = null,
    prefixCls: String = null,
    title: String = null,
    value: Date = null
  ): PropsType = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    if (!js.isUndefined(clientHeight)) __obj.updateDynamic("clientHeight")(clientHeight.get.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction1(onValueChange))
    if (pickerPrefixCls != null) __obj.updateDynamic("pickerPrefixCls")(pickerPrefixCls.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
}


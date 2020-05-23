package typings.rcPicker.rangePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<rc-picker.rc-picker/lib/panels/TimePanel.SharedTimeProps<DateType>, 'defaultValue'> & {  defaultValue ? :std.Array<DateType>} */
trait RangeShowTimeObject[DateType] extends js.Object {
  var defaultValue: js.UndefOr[js.Array[DateType]] = js.undefined
  var disabledHours: js.UndefOr[js.Function0[js.Array[Double]]] = js.undefined
  var disabledMinutes: js.UndefOr[js.Function1[/* hour */ Double, js.Array[Double]]] = js.undefined
  var disabledSeconds: js.UndefOr[js.Function2[/* hour */ Double, /* minute */ Double, js.Array[Double]]] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var hideDisabledOptions: js.UndefOr[Boolean] = js.undefined
  var hourStep: js.UndefOr[Double] = js.undefined
  var minuteStep: js.UndefOr[Double] = js.undefined
  var secondStep: js.UndefOr[Double] = js.undefined
  var showHour: js.UndefOr[Boolean] = js.undefined
  var showMinute: js.UndefOr[Boolean] = js.undefined
  var showSecond: js.UndefOr[Boolean] = js.undefined
  var use12Hours: js.UndefOr[Boolean] = js.undefined
}

object RangeShowTimeObject {
  @scala.inline
  def apply[DateType](
    defaultValue: js.Array[DateType] = null,
    disabledHours: () => js.Array[Double] = null,
    disabledMinutes: /* hour */ Double => js.Array[Double] = null,
    disabledSeconds: (/* hour */ Double, /* minute */ Double) => js.Array[Double] = null,
    format: String = null,
    hideDisabledOptions: js.UndefOr[Boolean] = js.undefined,
    hourStep: js.UndefOr[Double] = js.undefined,
    minuteStep: js.UndefOr[Double] = js.undefined,
    secondStep: js.UndefOr[Double] = js.undefined,
    showHour: js.UndefOr[Boolean] = js.undefined,
    showMinute: js.UndefOr[Boolean] = js.undefined,
    showSecond: js.UndefOr[Boolean] = js.undefined,
    use12Hours: js.UndefOr[Boolean] = js.undefined
  ): RangeShowTimeObject[DateType] = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (disabledHours != null) __obj.updateDynamic("disabledHours")(js.Any.fromFunction0(disabledHours))
    if (disabledMinutes != null) __obj.updateDynamic("disabledMinutes")(js.Any.fromFunction1(disabledMinutes))
    if (disabledSeconds != null) __obj.updateDynamic("disabledSeconds")(js.Any.fromFunction2(disabledSeconds))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(hideDisabledOptions)) __obj.updateDynamic("hideDisabledOptions")(hideDisabledOptions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hourStep)) __obj.updateDynamic("hourStep")(hourStep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minuteStep)) __obj.updateDynamic("minuteStep")(minuteStep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(secondStep)) __obj.updateDynamic("secondStep")(secondStep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showHour)) __obj.updateDynamic("showHour")(showHour.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showMinute)) __obj.updateDynamic("showMinute")(showMinute.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showSecond)) __obj.updateDynamic("showSecond")(showSecond.get.asInstanceOf[js.Any])
    if (!js.isUndefined(use12Hours)) __obj.updateDynamic("use12Hours")(use12Hours.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeShowTimeObject[DateType]]
  }
}


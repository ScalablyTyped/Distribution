package typings.rcPicker.timePanelMod

import typings.rcPicker.interfaceMod.DisabledTimes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedTimeProps[DateType] extends DisabledTimes {
  var defaultValue: js.UndefOr[DateType] = js.undefined
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

object SharedTimeProps {
  @scala.inline
  def apply[DateType](
    defaultValue: DateType = null,
    disabledHours: () => js.Array[Double] = null,
    disabledMinutes: /* hour */ Double => js.Array[Double] = null,
    disabledSeconds: (/* hour */ Double, /* minute */ Double) => js.Array[Double] = null,
    format: String = null,
    hideDisabledOptions: js.UndefOr[Boolean] = js.undefined,
    hourStep: Int | Double = null,
    minuteStep: Int | Double = null,
    secondStep: Int | Double = null,
    showHour: js.UndefOr[Boolean] = js.undefined,
    showMinute: js.UndefOr[Boolean] = js.undefined,
    showSecond: js.UndefOr[Boolean] = js.undefined,
    use12Hours: js.UndefOr[Boolean] = js.undefined
  ): SharedTimeProps[DateType] = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (disabledHours != null) __obj.updateDynamic("disabledHours")(js.Any.fromFunction0(disabledHours))
    if (disabledMinutes != null) __obj.updateDynamic("disabledMinutes")(js.Any.fromFunction1(disabledMinutes))
    if (disabledSeconds != null) __obj.updateDynamic("disabledSeconds")(js.Any.fromFunction2(disabledSeconds))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(hideDisabledOptions)) __obj.updateDynamic("hideDisabledOptions")(hideDisabledOptions.asInstanceOf[js.Any])
    if (hourStep != null) __obj.updateDynamic("hourStep")(hourStep.asInstanceOf[js.Any])
    if (minuteStep != null) __obj.updateDynamic("minuteStep")(minuteStep.asInstanceOf[js.Any])
    if (secondStep != null) __obj.updateDynamic("secondStep")(secondStep.asInstanceOf[js.Any])
    if (!js.isUndefined(showHour)) __obj.updateDynamic("showHour")(showHour.asInstanceOf[js.Any])
    if (!js.isUndefined(showMinute)) __obj.updateDynamic("showMinute")(showMinute.asInstanceOf[js.Any])
    if (!js.isUndefined(showSecond)) __obj.updateDynamic("showSecond")(showSecond.asInstanceOf[js.Any])
    if (!js.isUndefined(use12Hours)) __obj.updateDynamic("use12Hours")(use12Hours.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedTimeProps[DateType]]
  }
}


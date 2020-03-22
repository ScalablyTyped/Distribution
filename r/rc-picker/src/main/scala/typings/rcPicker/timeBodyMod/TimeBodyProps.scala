package typings.rcPicker.timeBodyMod

import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.Locale
import typings.rcPicker.interfaceMod.OnSelect
import typings.rcPicker.rcPickerStrings.key
import typings.rcPicker.rcPickerStrings.mouse
import typings.rcPicker.rcPickerStrings.submit
import typings.rcPicker.timePanelMod.SharedTimeProps
import typings.react.mod.MutableRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeBodyProps[DateType] extends SharedTimeProps[DateType] {
  var activeColumnIndex: Double
  var generateConfig: GenerateConfig[DateType]
  var locale: Locale
  var onSelect: OnSelect[DateType]
  var operationRef: MutableRefObject[js.UndefOr[BodyOperationRef]]
  var prefixCls: String
  var value: js.UndefOr[DateType | Null] = js.undefined
}

object TimeBodyProps {
  @scala.inline
  def apply[DateType](
    activeColumnIndex: Double,
    generateConfig: GenerateConfig[DateType],
    locale: Locale,
    onSelect: (DateType, /* type */ key | mouse | submit) => Unit,
    operationRef: MutableRefObject[js.UndefOr[BodyOperationRef]],
    prefixCls: String,
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
    use12Hours: js.UndefOr[Boolean] = js.undefined,
    value: DateType = null
  ): TimeBodyProps[DateType] = {
    val __obj = js.Dynamic.literal(activeColumnIndex = activeColumnIndex.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onSelect = js.Any.fromFunction2(onSelect), operationRef = operationRef.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
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
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeBodyProps[DateType]]
  }
}


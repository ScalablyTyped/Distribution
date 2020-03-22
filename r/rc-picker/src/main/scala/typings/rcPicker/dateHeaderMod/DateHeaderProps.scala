package typings.rcPicker.dateHeaderMod

import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateHeaderProps[DateType] extends js.Object {
  var generateConfig: GenerateConfig[DateType]
  var locale: Locale
  var prefixCls: String
  var value: js.UndefOr[DateType | Null] = js.undefined
  var viewDate: DateType
  def onMonthClick(): Unit
  def onNextMonth(): Unit
  def onNextYear(): Unit
  def onPrevMonth(): Unit
  def onPrevYear(): Unit
  def onYearClick(): Unit
}

object DateHeaderProps {
  @scala.inline
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    locale: Locale,
    onMonthClick: () => Unit,
    onNextMonth: () => Unit,
    onNextYear: () => Unit,
    onPrevMonth: () => Unit,
    onPrevYear: () => Unit,
    onYearClick: () => Unit,
    prefixCls: String,
    viewDate: DateType,
    value: DateType = null
  ): DateHeaderProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onMonthClick = js.Any.fromFunction0(onMonthClick), onNextMonth = js.Any.fromFunction0(onNextMonth), onNextYear = js.Any.fromFunction0(onNextYear), onPrevMonth = js.Any.fromFunction0(onPrevMonth), onPrevYear = js.Any.fromFunction0(onPrevYear), onYearClick = js.Any.fromFunction0(onYearClick), prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateHeaderProps[DateType]]
  }
}


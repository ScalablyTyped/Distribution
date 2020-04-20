package typings.rcPicker.monthHeaderMod

import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonthHeaderProps[DateType] extends js.Object {
  var generateConfig: GenerateConfig[DateType]
  var locale: Locale
  var prefixCls: String
  var viewDate: DateType
  def onNextYear(): Unit
  def onPrevYear(): Unit
  def onYearClick(): Unit
}

object MonthHeaderProps {
  @scala.inline
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    locale: Locale,
    onNextYear: () => Unit,
    onPrevYear: () => Unit,
    onYearClick: () => Unit,
    prefixCls: String,
    viewDate: DateType
  ): MonthHeaderProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onNextYear = js.Any.fromFunction0(onNextYear), onPrevYear = js.Any.fromFunction0(onPrevYear), onYearClick = js.Any.fromFunction0(onYearClick), prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonthHeaderProps[DateType]]
  }
}


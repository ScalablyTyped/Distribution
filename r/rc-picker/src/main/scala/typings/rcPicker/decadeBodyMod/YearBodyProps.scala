package typings.rcPicker.decadeBodyMod

import typings.rcPicker.generateMod.GenerateConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YearBodyProps[DateType] extends js.Object {
  var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.undefined
  var generateConfig: GenerateConfig[DateType]
  var prefixCls: String
  var viewDate: DateType
  def onSelect(value: DateType): Unit
}

object YearBodyProps {
  @scala.inline
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    onSelect: DateType => Unit,
    prefixCls: String,
    viewDate: DateType,
    disabledDate: /* date */ DateType => Boolean = null
  ): YearBodyProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], onSelect = js.Any.fromFunction1(onSelect), prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1(disabledDate))
    __obj.asInstanceOf[YearBodyProps[DateType]]
  }
}


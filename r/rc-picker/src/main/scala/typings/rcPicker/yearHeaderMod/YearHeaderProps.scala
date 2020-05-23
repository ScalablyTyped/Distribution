package typings.rcPicker.yearHeaderMod

import typings.rcPicker.generateMod.GenerateConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YearHeaderProps[DateType] extends js.Object {
  var generateConfig: GenerateConfig[DateType]
  var prefixCls: String
  var value: js.UndefOr[DateType | Null] = js.undefined
  var viewDate: DateType
  def onDecadeClick(): Unit
  def onNextDecade(): Unit
  def onPrevDecade(): Unit
}

object YearHeaderProps {
  @scala.inline
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    onDecadeClick: () => Unit,
    onNextDecade: () => Unit,
    onPrevDecade: () => Unit,
    prefixCls: String,
    viewDate: DateType,
    value: js.UndefOr[Null | DateType] = js.undefined
  ): YearHeaderProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], onDecadeClick = js.Any.fromFunction0(onDecadeClick), onNextDecade = js.Any.fromFunction0(onNextDecade), onPrevDecade = js.Any.fromFunction0(onPrevDecade), prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[YearHeaderProps[DateType]]
  }
}


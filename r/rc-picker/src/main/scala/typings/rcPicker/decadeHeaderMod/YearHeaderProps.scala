package typings.rcPicker.decadeHeaderMod

import typings.rcPicker.generateMod.GenerateConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YearHeaderProps[DateType] extends js.Object {
  var generateConfig: GenerateConfig[DateType]
  var prefixCls: String
  var viewDate: DateType
  def onNextDecades(): Unit
  def onPrevDecades(): Unit
}

object YearHeaderProps {
  @scala.inline
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    onNextDecades: () => Unit,
    onPrevDecades: () => Unit,
    prefixCls: String,
    viewDate: DateType
  ): YearHeaderProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], onNextDecades = js.Any.fromFunction0(onNextDecades), onPrevDecades = js.Any.fromFunction0(onPrevDecades), prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[YearHeaderProps[DateType]]
  }
}


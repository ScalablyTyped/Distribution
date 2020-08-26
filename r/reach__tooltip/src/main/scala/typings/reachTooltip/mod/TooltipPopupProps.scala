package typings.reachTooltip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipPopupProps extends BaseTooltipProps

object TooltipPopupProps {
  @scala.inline
  def apply(BaseTooltipProps: BaseTooltipProps): TooltipPopupProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, BaseTooltipProps)
    __obj.asInstanceOf[TooltipPopupProps]
  }
}


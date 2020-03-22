package typings.reachTooltip.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps extends BaseTooltipProps {
  @JSName("children")
  var children_TooltipProps: ReactNode
}

object TooltipProps {
  @scala.inline
  def apply(BaseTooltipProps: BaseTooltipProps, children: ReactNode = null): TooltipProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, BaseTooltipProps)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
}


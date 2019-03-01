package typings
package reactDashMdLib.libTooltipsInjectTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps extends js.Object {
  var tooltip: reactLib.reactMod.ReactNs.ReactNode | scala.Null
}

object TooltipProps {
  @scala.inline
  def apply(tooltip: reactLib.reactMod.ReactNs.ReactNode = null): TooltipProps = {
    val __obj = js.Dynamic.literal()
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
}


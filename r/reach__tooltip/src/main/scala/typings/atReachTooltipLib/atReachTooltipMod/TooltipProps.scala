package typings
package atReachTooltipLib.atReachTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps extends BaseTooltipProps {
  var children: reactLib.reactMod.ReactNode
}

object TooltipProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    label: reactLib.reactMod.ReactNode,
    ariaLabel: java.lang.String = null,
    position: (/* position1 */ stdLib.DOMRect, /* position2 */ stdLib.DOMRect) => stdLib.DOMRect = null
  ): TooltipProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (position != null) __obj.updateDynamic("position")(js.Any.fromFunction2(position))
    __obj.asInstanceOf[TooltipProps]
  }
}


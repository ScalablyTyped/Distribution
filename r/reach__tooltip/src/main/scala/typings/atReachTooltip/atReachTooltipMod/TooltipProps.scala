package typings.atReachTooltip.atReachTooltipMod

import typings.react.reactMod.ReactNode
import typings.std.DOMRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps extends BaseTooltipProps {
  var children: ReactNode
}

object TooltipProps {
  @scala.inline
  def apply(
    children: ReactNode,
    label: ReactNode,
    ariaLabel: String = null,
    position: (/* position1 */ DOMRect, /* position2 */ DOMRect) => DOMRect = null
  ): TooltipProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (position != null) __obj.updateDynamic("position")(js.Any.fromFunction2(position))
    __obj.asInstanceOf[TooltipProps]
  }
}


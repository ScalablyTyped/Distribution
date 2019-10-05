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
    ariaLabel: String = null,
    children: ReactNode = null,
    label: ReactNode = null,
    position: (/* position1 */ DOMRect, /* position2 */ DOMRect) => DOMRect = null
  ): TooltipProps = {
    val __obj = js.Dynamic.literal()
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(js.Any.fromFunction2(position))
    __obj.asInstanceOf[TooltipProps]
  }
}


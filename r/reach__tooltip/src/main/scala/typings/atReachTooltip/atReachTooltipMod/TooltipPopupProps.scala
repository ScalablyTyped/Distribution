package typings.atReachTooltip.atReachTooltipMod

import typings.react.reactMod.ReactNode
import typings.std.DOMRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipPopupProps extends BaseTooltipProps {
  var children: js.UndefOr[ReactNode] = js.undefined
}

object TooltipPopupProps {
  @scala.inline
  def apply(
    label: ReactNode,
    ariaLabel: String = null,
    children: ReactNode = null,
    position: (/* position1 */ DOMRect, /* position2 */ DOMRect) => DOMRect = null
  ): TooltipPopupProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(js.Any.fromFunction2(position))
    __obj.asInstanceOf[TooltipPopupProps]
  }
}


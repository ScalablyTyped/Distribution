package typings
package atReachTooltipLib.atReachTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipPopupProps extends BaseTooltipProps {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object TooltipPopupProps {
  @scala.inline
  def apply(
    label: reactLib.reactMod.ReactNode,
    ariaLabel: java.lang.String = null,
    children: reactLib.reactMod.ReactNode = null,
    position: (/* position1 */ stdLib.DOMRect, /* position2 */ stdLib.DOMRect) => stdLib.DOMRect = null
  ): TooltipPopupProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(js.Any.fromFunction2(position))
    __obj.asInstanceOf[TooltipPopupProps]
  }
}


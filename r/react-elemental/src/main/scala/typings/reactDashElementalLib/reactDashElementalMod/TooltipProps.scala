package typings
package reactDashElementalLib.reactDashElementalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps extends js.Object {
  val bottom: js.UndefOr[scala.Boolean] = js.undefined
  val children: reactLib.reactMod.ReactNode
  val contents: reactLib.reactMod.ReactElement[_]
  val offset: js.UndefOr[scala.Double] = js.undefined
  val persistent: js.UndefOr[scala.Boolean] = js.undefined
  val style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  val top: js.UndefOr[scala.Boolean] = js.undefined
  val width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object TooltipProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    contents: reactLib.reactMod.ReactElement[_],
    bottom: js.UndefOr[scala.Boolean] = js.undefined,
    offset: scala.Int | scala.Double = null,
    persistent: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null,
    top: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Double | java.lang.String = null
  ): TooltipProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], contents = contents)
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
}


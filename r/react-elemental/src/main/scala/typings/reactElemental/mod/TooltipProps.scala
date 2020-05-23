package typings.reactElemental.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps extends js.Object {
  val bottom: js.UndefOr[Boolean] = js.undefined
  val children: ReactNode
  val contents: ReactElement
  val offset: js.UndefOr[Double] = js.undefined
  val persistent: js.UndefOr[Boolean] = js.undefined
  val style: js.UndefOr[CSSProperties] = js.undefined
  val top: js.UndefOr[Boolean] = js.undefined
  val width: js.UndefOr[Double | String] = js.undefined
}

object TooltipProps {
  @scala.inline
  def apply(
    contents: ReactElement,
    bottom: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    offset: js.UndefOr[Double] = js.undefined,
    persistent: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    top: js.UndefOr[Boolean] = js.undefined,
    width: Double | String = null
  ): TooltipProps = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
}


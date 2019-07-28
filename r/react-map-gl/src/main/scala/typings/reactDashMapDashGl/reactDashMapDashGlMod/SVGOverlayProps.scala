package typings.reactDashMapDashGl.reactDashMapDashGlMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGOverlayProps extends BaseControlProps {
  var style: js.UndefOr[CSSProperties] = js.undefined
  def redraw(opts: SVGRedrawOptions): Unit
}

object SVGOverlayProps {
  @scala.inline
  def apply(
    redraw: SVGRedrawOptions => Unit,
    captureClick: js.UndefOr[Boolean] = js.undefined,
    captureDoubleClick: js.UndefOr[Boolean] = js.undefined,
    captureDrag: js.UndefOr[Boolean] = js.undefined,
    captureScroll: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): SVGOverlayProps = {
    val __obj = js.Dynamic.literal(redraw = js.Any.fromFunction1(redraw))
    if (!js.isUndefined(captureClick)) __obj.updateDynamic("captureClick")(captureClick)
    if (!js.isUndefined(captureDoubleClick)) __obj.updateDynamic("captureDoubleClick")(captureDoubleClick)
    if (!js.isUndefined(captureDrag)) __obj.updateDynamic("captureDrag")(captureDrag)
    if (!js.isUndefined(captureScroll)) __obj.updateDynamic("captureScroll")(captureScroll)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SVGOverlayProps]
  }
}


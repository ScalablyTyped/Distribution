package typings
package reactDashMapDashGlLib.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLOverlayProps extends BaseControlProps {
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  def redraw(opts: HTMLRedrawOptions): scala.Unit
}

object HTMLOverlayProps {
  @scala.inline
  def apply(
    redraw: js.Function1[HTMLRedrawOptions, scala.Unit],
    captureClick: js.UndefOr[scala.Boolean] = js.undefined,
    captureDoubleClick: js.UndefOr[scala.Boolean] = js.undefined,
    captureDrag: js.UndefOr[scala.Boolean] = js.undefined,
    captureScroll: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): HTMLOverlayProps = {
    val __obj = js.Dynamic.literal(redraw = redraw)
    if (!js.isUndefined(captureClick)) __obj.updateDynamic("captureClick")(captureClick)
    if (!js.isUndefined(captureDoubleClick)) __obj.updateDynamic("captureDoubleClick")(captureDoubleClick)
    if (!js.isUndefined(captureDrag)) __obj.updateDynamic("captureDrag")(captureDrag)
    if (!js.isUndefined(captureScroll)) __obj.updateDynamic("captureScroll")(captureScroll)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[HTMLOverlayProps]
  }
}


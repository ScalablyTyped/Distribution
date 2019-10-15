package typings.reactDashSvgDashPanDashZoom

import typings.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomMod.ToolbarPosition
import typings.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomStrings.bottom
import typings.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomStrings.center
import typings.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomStrings.left
import typings.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomStrings.right
import typings.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  var SVGAlignX: js.UndefOr[center | left | right] = js.undefined
  var SVGAlignY: js.UndefOr[center | top | bottom] = js.undefined
  var position: js.UndefOr[ToolbarPosition] = js.undefined
}

object Anon_Bottom {
  @scala.inline
  def apply(
    SVGAlignX: center | left | right = null,
    SVGAlignY: center | top | bottom = null,
    position: ToolbarPosition = null
  ): Anon_Bottom = {
    val __obj = js.Dynamic.literal()
    if (SVGAlignX != null) __obj.updateDynamic("SVGAlignX")(SVGAlignX.asInstanceOf[js.Any])
    if (SVGAlignY != null) __obj.updateDynamic("SVGAlignY")(SVGAlignY.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Anon_Bottom]
  }
}


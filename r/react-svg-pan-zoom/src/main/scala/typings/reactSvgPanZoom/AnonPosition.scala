package typings.reactSvgPanZoom

import typings.reactSvgPanZoom.mod.ToolbarPosition
import typings.reactSvgPanZoom.reactSvgPanZoomStrings.bottom
import typings.reactSvgPanZoom.reactSvgPanZoomStrings.center
import typings.reactSvgPanZoom.reactSvgPanZoomStrings.left
import typings.reactSvgPanZoom.reactSvgPanZoomStrings.right
import typings.reactSvgPanZoom.reactSvgPanZoomStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPosition extends js.Object {
  var SVGAlignX: js.UndefOr[center | left | right] = js.undefined
  var SVGAlignY: js.UndefOr[center | top | bottom] = js.undefined
  var position: js.UndefOr[ToolbarPosition] = js.undefined
}

object AnonPosition {
  @scala.inline
  def apply(
    SVGAlignX: center | left | right = null,
    SVGAlignY: center | top | bottom = null,
    position: ToolbarPosition = null
  ): AnonPosition = {
    val __obj = js.Dynamic.literal()
    if (SVGAlignX != null) __obj.updateDynamic("SVGAlignX")(SVGAlignX.asInstanceOf[js.Any])
    if (SVGAlignY != null) __obj.updateDynamic("SVGAlignY")(SVGAlignY.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPosition]
  }
}


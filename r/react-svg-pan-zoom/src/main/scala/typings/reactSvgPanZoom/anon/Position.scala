package typings.reactSvgPanZoom.anon

import typings.reactSvgPanZoom.mod.ToolbarPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var SVGAlignX: js.UndefOr[/* "center" */ String] = js.undefined
  var SVGAlignY: js.UndefOr[/* "center" */ String] = js.undefined
  var position: js.UndefOr[ToolbarPosition] = js.undefined
}

object Position {
  @scala.inline
  def apply(
    SVGAlignX: /* "center" */ String = null,
    SVGAlignY: /* "center" */ String = null,
    position: ToolbarPosition = null
  ): Position = {
    val __obj = js.Dynamic.literal()
    if (SVGAlignX != null) __obj.updateDynamic("SVGAlignX")(SVGAlignX.asInstanceOf[js.Any])
    if (SVGAlignY != null) __obj.updateDynamic("SVGAlignY")(SVGAlignY.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
}


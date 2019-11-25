package typings.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomMod

import typings.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var SVGHeight: Double
  var SVGWidth: Double
  var a: Double
  var b: Double
  var c: Double
  var d: Double
  var e: Double
  var endX: js.UndefOr[Double | Null] = js.undefined
  var endY: js.UndefOr[Double | Null] = js.undefined
  var f: Double
  var focus: Boolean
  var miniatureOpen: Boolean
  var mode: Mode
  var startX: js.UndefOr[Double | Null] = js.undefined
  var startY: js.UndefOr[Double | Null] = js.undefined
  var version: `2`
  var viewerHeight: Double
  var viewerWidth: Double
}

object Value {
  @scala.inline
  def apply(
    SVGHeight: Double,
    SVGWidth: Double,
    a: Double,
    b: Double,
    c: Double,
    d: Double,
    e: Double,
    f: Double,
    focus: Boolean,
    miniatureOpen: Boolean,
    mode: Mode,
    version: `2`,
    viewerHeight: Double,
    viewerWidth: Double,
    endX: Int | Double = null,
    endY: Int | Double = null,
    startX: Int | Double = null,
    startY: Int | Double = null
  ): Value = {
    val __obj = js.Dynamic.literal(SVGHeight = SVGHeight.asInstanceOf[js.Any], SVGWidth = SVGWidth.asInstanceOf[js.Any], a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], miniatureOpen = miniatureOpen.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], viewerHeight = viewerHeight.asInstanceOf[js.Any], viewerWidth = viewerWidth.asInstanceOf[js.Any])
    if (endX != null) __obj.updateDynamic("endX")(endX.asInstanceOf[js.Any])
    if (endY != null) __obj.updateDynamic("endY")(endY.asInstanceOf[js.Any])
    if (startX != null) __obj.updateDynamic("startX")(startX.asInstanceOf[js.Any])
    if (startY != null) __obj.updateDynamic("startY")(startY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}


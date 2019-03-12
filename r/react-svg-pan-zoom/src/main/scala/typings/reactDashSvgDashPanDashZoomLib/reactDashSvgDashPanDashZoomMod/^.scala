package typings
package reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-svg-pan-zoom", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val MODE_IDLE: /* idle */ java.lang.String = js.native
  val MODE_PANNING: /* panning */ java.lang.String = js.native
  val MODE_ZOOMING: /* zooming */ java.lang.String = js.native
  val POSITION_BOTTOM: /* bottom */ java.lang.String = js.native
  val POSITION_LEFT: /* left */ java.lang.String = js.native
  val POSITION_NONE: /* none */ java.lang.String = js.native
  val POSITION_RIGHT: /* right */ java.lang.String = js.native
  val POSITION_TOP: /* top */ java.lang.String = js.native
  val TOOL_AUTO: /* auto */ java.lang.String = js.native
  val TOOL_NONE: /* none */ java.lang.String = js.native
  val TOOL_PAN: /* pan */ java.lang.String = js.native
  val TOOL_ZOOM_IN: /* zoom-in */ java.lang.String = js.native
  val TOOL_ZOOM_OUT: /* zoom-out */ java.lang.String = js.native
  def fitSelection(
    value: Value,
    selectionSVGPointX: scala.Double,
    selectionSVGPointY: scala.Double,
    selectionWidth: scala.Double,
    selectionHeight: scala.Double
  ): Value = js.native
  def fitToViewer(value: Value): Value = js.native
  def pan(value: Value, SVGDeltaX: scala.Double, SVGDeltaY: scala.Double): Value = js.native
  def pan(value: Value, SVGDeltaX: scala.Double, SVGDeltaY: scala.Double, panLimit: scala.Double): Value = js.native
  def reset(value: Value): Value = js.native
  def setPointOnViewerCenter(value: Value, SVGPointX: scala.Double, SVGPointY: scala.Double, zoomLevel: scala.Double): Value = js.native
  def zoom(value: Value, SVGPointX: scala.Double, SVGPointY: scala.Double, scaleFactor: scala.Double): Value = js.native
  def zoomOnViewerCenter(value: Value, scaleFactor: scala.Double): Value = js.native
}


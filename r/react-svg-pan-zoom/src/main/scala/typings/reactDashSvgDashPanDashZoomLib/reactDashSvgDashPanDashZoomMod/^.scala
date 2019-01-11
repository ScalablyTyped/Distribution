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
    value: reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomMod.Value,
    selectionSVGPointX: scala.Double,
    selectionSVGPointY: scala.Double,
    selectionWidth: scala.Double,
    selectionHeight: scala.Double
  ): reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomMod.Value = js.native
  def fitToViewer(value: reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomMod.Value): reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomMod.Value = js.native
  def pan(
    value: reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomMod.Value,
    SVGDeltaX: scala.Double,
    SVGDeltaY: scala.Double
  ): reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomMod.Value = js.native
  def pan(
    value: reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomMod.Value,
    SVGDeltaX: scala.Double,
    SVGDeltaY: scala.Double,
    panLimit: scala.Double
  ): reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomMod.Value = js.native
  def reset(value: reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomMod.Value): reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomMod.Value = js.native
  def setPointOnViewerCenter(
    value: reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomMod.Value,
    SVGPointX: scala.Double,
    SVGPointY: scala.Double,
    zoomLevel: scala.Double
  ): reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomMod.Value = js.native
  def zoom(
    value: reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomMod.Value,
    SVGPointX: scala.Double,
    SVGPointY: scala.Double,
    scaleFactor: scala.Double
  ): reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomMod.Value = js.native
  def zoomOnViewerCenter(
    value: reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomMod.Value,
    scaleFactor: scala.Double
  ): reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomMod.Value = js.native
}


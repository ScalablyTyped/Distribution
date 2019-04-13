package typings
package reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-svg-pan-zoom", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val MODE_IDLE: reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomLibStrings.idle = js.native
  val MODE_PANNING: reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomLibStrings.panning = js.native
  val MODE_ZOOMING: reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomLibStrings.zooming = js.native
  val POSITION_BOTTOM: reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomLibStrings.bottom = js.native
  val POSITION_LEFT: reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomLibStrings.left = js.native
  val POSITION_NONE: reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomLibStrings.none = js.native
  val POSITION_RIGHT: reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomLibStrings.right = js.native
  val POSITION_TOP: reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomLibStrings.top = js.native
  val TOOL_AUTO: reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomLibStrings.auto = js.native
  val TOOL_NONE: reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomLibStrings.none = js.native
  val TOOL_PAN: reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomLibStrings.pan = js.native
  val TOOL_ZOOM_IN: reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomLibStrings.`zoom-in` = js.native
  val TOOL_ZOOM_OUT: reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomLibStrings.`zoom-out` = js.native
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


package typings.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomMod

import typings.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomStrings.`zoom-in`
import typings.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomStrings.`zoom-out`
import typings.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomStrings.auto
import typings.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomStrings.bottom
import typings.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomStrings.idle
import typings.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomStrings.left
import typings.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomStrings.none
import typings.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomStrings.pan
import typings.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomStrings.panning
import typings.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomStrings.right
import typings.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomStrings.top
import typings.reactDashSvgDashPanDashZoom.reactDashSvgDashPanDashZoomStrings.zooming
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-svg-pan-zoom", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val MODE_IDLE: idle = js.native
  val MODE_PANNING: panning = js.native
  val MODE_ZOOMING: zooming = js.native
  val POSITION_BOTTOM: bottom = js.native
  val POSITION_LEFT: left = js.native
  val POSITION_NONE: none = js.native
  val POSITION_RIGHT: right = js.native
  val POSITION_TOP: top = js.native
  val TOOL_AUTO: auto = js.native
  val TOOL_NONE: none = js.native
  val TOOL_PAN: pan = js.native
  val TOOL_ZOOM_IN: `zoom-in` = js.native
  val TOOL_ZOOM_OUT: `zoom-out` = js.native
  def fitSelection(
    value: Value,
    selectionSVGPointX: Double,
    selectionSVGPointY: Double,
    selectionWidth: Double,
    selectionHeight: Double
  ): Value = js.native
  def fitToViewer(value: Value): Value = js.native
  def pan(value: Value, SVGDeltaX: Double, SVGDeltaY: Double): Value = js.native
  def pan(value: Value, SVGDeltaX: Double, SVGDeltaY: Double, panLimit: Double): Value = js.native
  def reset(value: Value): Value = js.native
  def setPointOnViewerCenter(value: Value, SVGPointX: Double, SVGPointY: Double, zoomLevel: Double): Value = js.native
  def zoom(value: Value, SVGPointX: Double, SVGPointY: Double, scaleFactor: Double): Value = js.native
  def zoomOnViewerCenter(value: Value, scaleFactor: Double): Value = js.native
}


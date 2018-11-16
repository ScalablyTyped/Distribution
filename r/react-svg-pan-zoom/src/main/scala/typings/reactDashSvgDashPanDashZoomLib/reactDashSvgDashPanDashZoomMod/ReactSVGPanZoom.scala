package typings
package reactDashSvgDashPanDashZoomLib.reactDashSvgDashPanDashZoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-svg-pan-zoom", "ReactSVGPanZoom")
@js.native
class ReactSVGPanZoom ()
  extends reactLib.reactMod.Component[Props, js.Object, js.Any] {
  def fitSelection(
    selectionSVGPointX: scala.Double,
    selectionSVGPointY: scala.Double,
    selectionWidth: scala.Double,
    selectionHeight: scala.Double
  ): scala.Unit = js.native
  def fitToViewer(): scala.Unit = js.native
  def getTool(): Tool = js.native
  def getValue(): Value = js.native
  def pan(SVGDeltaX: scala.Double, SVGDeltaY: scala.Double): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def setPointOnViewerCenter(SVGPointX: scala.Double, SVGPointY: scala.Double, zoomLevel: scala.Double): scala.Unit = js.native
  def setTool(tool: Tool): scala.Unit = js.native
  def setValue(value: Value): scala.Unit = js.native
  def zoom(SVGPointX: scala.Double, SVGPointY: scala.Double, scaleFactor: scala.Double): scala.Unit = js.native
  def zoomOnViewerCenter(scaleFactor: scala.Double): scala.Unit = js.native
}


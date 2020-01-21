package typings.reactSvgPanZoom.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-svg-pan-zoom", "UncontrolledReactSVGPanZoom")
@js.native
class UncontrolledReactSVGPanZoom ()
  extends Component[UncontrolledProps, js.Object, js.Any] {
  def fitSelection(
    selectionSVGPointX: Double,
    selectionSVGPointY: Double,
    selectionWidth: Double,
    selectionHeight: Double
  ): Unit = js.native
  def fitToViewer(): Unit = js.native
  def getTool(): Tool = js.native
  def getValue(): Value = js.native
  def pan(SVGDeltaX: Double, SVGDeltaY: Double): Unit = js.native
  def reset(): Unit = js.native
  def setPointOnViewerCenter(SVGPointX: Double, SVGPointY: Double, zoomLevel: Double): Unit = js.native
  def setTool(tool: Tool): Unit = js.native
  def setValue(value: Value): Unit = js.native
  def zoom(SVGPointX: Double, SVGPointY: Double, scaleFactor: Double): Unit = js.native
  def zoomOnViewerCenter(scaleFactor: Double): Unit = js.native
}


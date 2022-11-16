package typings.skiaCanvas.libMod

import typings.skiaCanvas.skiaCanvasStrings.follow
import typings.skiaCanvas.skiaCanvasStrings.move
import typings.skiaCanvas.skiaCanvasStrings.turn
import typings.std.CanvasCompositing
import typings.std.CanvasDrawPath
import typings.std.CanvasFilters
import typings.std.CanvasImageData
import typings.std.CanvasImageSmoothing
import typings.std.CanvasPath
import typings.std.CanvasPathDrawingStyles
import typings.std.CanvasRect
import typings.std.CanvasShadowStyles
import typings.std.CanvasState
import typings.std.CanvasText
import typings.std.CanvasTextDrawingStyles
import typings.std.CanvasTransform
import typings.std.CanvasUserInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasRenderingContext2D
  extends StObject
     with CanvasCompositing
     with CanvasDrawImage
     with CanvasDrawPath
     with CanvasFillStrokeStyles
     with CanvasFilters
     with CanvasImageData
     with CanvasImageSmoothing
     with CanvasPath
     with CanvasPathDrawingStyles
     with CanvasRect
     with CanvasShadowStyles
     with CanvasState
     with CanvasText
     with CanvasTextDrawingStyles
     with CanvasTransform
     with CanvasUserInterface {
  
  val canvas: Canvas = js.native
  
  def conicCurveTo(cpx: Double, cpy: Double, x: Double, y: Double, weight: Double): Unit = js.native
  
  def createProjection(quad: QuadOrRect): DOMMatrix = js.native
  def createProjection(quad: QuadOrRect, basis: QuadOrRect): DOMMatrix = js.native
  
  def currentTransform: DOMMatrix = js.native
  def currentTransform_=(matrix: DOMMatrix): Unit = js.native
  
  var fontVariant: String = js.native
  
  var lineDashFit: move | turn | follow = js.native
  
  var lineDashMarker: Path2D | Null = js.native
  
  def measureText(text: String, maxWidth: Double): TextMetrics = js.native
  
  def outlineText(text: String): Path2D = js.native
  
  def reset(): Unit = js.native
  
  var textTracking: Double = js.native
  
  var textWrap: Boolean = js.native
}

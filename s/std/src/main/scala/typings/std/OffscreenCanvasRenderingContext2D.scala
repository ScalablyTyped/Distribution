package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OffscreenCanvasRenderingContext2D
  extends CanvasCompositing
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
     with OffscreenRenderingContext {
  val canvas: OffscreenCanvas = js.native
  def commit(): Unit = js.native
}


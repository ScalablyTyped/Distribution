package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OffscreenCanvasRenderingContext2D
  extends CanvasState
     with CanvasTransform
     with CanvasCompositing
     with CanvasImageSmoothing
     with CanvasFillStrokeStyles
     with CanvasShadowStyles
     with CanvasFilters
     with CanvasRect
     with CanvasDrawPath
     with CanvasText
     with CanvasDrawImage
     with CanvasImageData
     with CanvasPathDrawingStyles
     with CanvasTextDrawingStyles
     with CanvasPath
     with OffscreenRenderingContext {
  val canvas: OffscreenCanvas = js.native
  def commit(): Unit = js.native
}

@JSGlobal("OffscreenCanvasRenderingContext2D")
@js.native
object OffscreenCanvasRenderingContext2D extends Instantiable0[OffscreenCanvasRenderingContext2D]


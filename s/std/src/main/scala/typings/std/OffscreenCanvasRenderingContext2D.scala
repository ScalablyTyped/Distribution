package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvasRenderingContext2D) */
@js.native
trait OffscreenCanvasRenderingContext2D
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
     with OffscreenRenderingContext {
  
  /* standard dom */
  val canvas: OffscreenCanvas = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvasRenderingContext2D/commit) */
  /* standard dom */
  def commit(): Unit = js.native
}

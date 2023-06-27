package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The CanvasRenderingContext2D interface, part of the Canvas API, provides the 2D rendering context for the drawing surface of a <canvas> element. It is used for drawing shapes, text, images, and other objects.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D)
  */
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
     with CanvasUserInterface
     with RenderingContext {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/canvas) */
  /* standard dom */
  val canvas: HTMLCanvasElement = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/getContextAttributes) */
  /* standard dom */
  def getContextAttributes(): CanvasRenderingContext2DSettings = js.native
}

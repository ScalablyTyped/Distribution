package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The CanvasRenderingContext2D interface, part of the Canvas API, provides the 2D rendering context for the drawing surface of a <canvas> element. It is used for drawing shapes, text, images, and other objects. */
@js.native
trait CanvasRenderingContext2D
  extends CanvasState
     with CanvasTransform
     with CanvasCompositing
     with CanvasImageSmoothing
     with CanvasFillStrokeStyles
     with CanvasShadowStyles
     with CanvasFilters
     with CanvasRect
     with CanvasDrawPath
     with CanvasUserInterface
     with CanvasText
     with CanvasDrawImage
     with CanvasImageData
     with CanvasPathDrawingStyles
     with CanvasTextDrawingStyles
     with CanvasPath
     with RenderingContext {
  val canvas: HTMLCanvasElement = js.native
}

@JSGlobal("CanvasRenderingContext2D")
@js.native
class CanvasRenderingContext2DCls () extends CanvasRenderingContext2D {
  /* CompleteClass */
  override var direction: CanvasDirection = js.native
  /* CompleteClass */
  override var fillStyle: java.lang.String | CanvasGradient | CanvasPattern = js.native
  /* CompleteClass */
  override var filter: java.lang.String = js.native
  /* CompleteClass */
  override var font: java.lang.String = js.native
  /* CompleteClass */
  override var globalAlpha: Double = js.native
  /* CompleteClass */
  override var globalCompositeOperation: java.lang.String = js.native
  /* CompleteClass */
  override var imageSmoothingEnabled: scala.Boolean = js.native
  /* CompleteClass */
  override var imageSmoothingQuality: ImageSmoothingQuality = js.native
  /* CompleteClass */
  override var shadowBlur: Double = js.native
  /* CompleteClass */
  override var shadowColor: java.lang.String = js.native
  /* CompleteClass */
  override var shadowOffsetX: Double = js.native
  /* CompleteClass */
  override var shadowOffsetY: Double = js.native
  /* CompleteClass */
  override var strokeStyle: java.lang.String | CanvasGradient | CanvasPattern = js.native
  /* CompleteClass */
  override var textAlign: CanvasTextAlign = js.native
  /* CompleteClass */
  override var textBaseline: CanvasTextBaseline = js.native
  /* CompleteClass */
  override def clearRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  /* CompleteClass */
  override def createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): CanvasGradient = js.native
  /* CompleteClass */
  override def createPattern(image: CanvasImageSource, repetition: java.lang.String): CanvasPattern | Null = js.native
  /* CompleteClass */
  override def createRadialGradient(x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): CanvasGradient = js.native
  /* CompleteClass */
  override def fillRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  /* CompleteClass */
  override def restore(): Unit = js.native
  /* CompleteClass */
  override def save(): Unit = js.native
  /* CompleteClass */
  override def strokeRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
}

@JSGlobal("CanvasRenderingContext2D")
@js.native
object CanvasRenderingContext2D extends Instantiable0[CanvasRenderingContext2D]


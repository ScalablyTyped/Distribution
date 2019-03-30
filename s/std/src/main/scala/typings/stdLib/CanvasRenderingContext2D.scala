package typings
package stdLib

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
     with _RenderingContext {
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
  override var globalAlpha: scala.Double = js.native
  /* CompleteClass */
  override var globalCompositeOperation: java.lang.String = js.native
  /* CompleteClass */
  override var imageSmoothingEnabled: scala.Boolean = js.native
  /* CompleteClass */
  override var imageSmoothingQuality: ImageSmoothingQuality = js.native
  /* CompleteClass */
  override var lineCap: CanvasLineCap = js.native
  /* CompleteClass */
  override var lineDashOffset: scala.Double = js.native
  /* CompleteClass */
  override var lineJoin: CanvasLineJoin = js.native
  /* CompleteClass */
  override var lineWidth: scala.Double = js.native
  /* CompleteClass */
  override var miterLimit: scala.Double = js.native
  /* CompleteClass */
  override var shadowBlur: scala.Double = js.native
  /* CompleteClass */
  override var shadowColor: java.lang.String = js.native
  /* CompleteClass */
  override var shadowOffsetX: scala.Double = js.native
  /* CompleteClass */
  override var shadowOffsetY: scala.Double = js.native
  /* CompleteClass */
  override var strokeStyle: java.lang.String | CanvasGradient | CanvasPattern = js.native
  /* CompleteClass */
  override var textAlign: CanvasTextAlign = js.native
  /* CompleteClass */
  override var textBaseline: CanvasTextBaseline = js.native
  /* CompleteClass */
  override def clearRect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def createLinearGradient(x0: scala.Double, y0: scala.Double, x1: scala.Double, y1: scala.Double): CanvasGradient = js.native
  /* CompleteClass */
  override def createPattern(image: CanvasImageSource, repetition: java.lang.String): CanvasPattern | scala.Null = js.native
  /* CompleteClass */
  override def createRadialGradient(
    x0: scala.Double,
    y0: scala.Double,
    r0: scala.Double,
    x1: scala.Double,
    y1: scala.Double,
    r1: scala.Double
  ): CanvasGradient = js.native
  /* CompleteClass */
  override def fillRect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def getLineDash(): js.Array[scala.Double] = js.native
  /* CompleteClass */
  override def restore(): scala.Unit = js.native
  /* CompleteClass */
  override def save(): scala.Unit = js.native
  /* CompleteClass */
  override def setLineDash(segments: js.Array[scala.Double]): scala.Unit = js.native
  /* CompleteClass */
  override def strokeRect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): scala.Unit = js.native
}

@JSGlobal("CanvasRenderingContext2D")
@js.native
object CanvasRenderingContext2D
  extends org.scalablytyped.runtime.Instantiable0[CanvasRenderingContext2D]


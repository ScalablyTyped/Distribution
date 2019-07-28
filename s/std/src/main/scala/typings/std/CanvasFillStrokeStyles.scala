package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasFillStrokeStyles extends js.Object {
  var fillStyle: java.lang.String | CanvasGradient | CanvasPattern
  var strokeStyle: java.lang.String | CanvasGradient | CanvasPattern
  def createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): CanvasGradient
  def createPattern(image: CanvasImageSource, repetition: java.lang.String): CanvasPattern | Null
  def createRadialGradient(x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): CanvasGradient
}

object CanvasFillStrokeStyles {
  @scala.inline
  def apply(
    createLinearGradient: (Double, Double, Double, Double) => CanvasGradient,
    createPattern: (CanvasImageSource, java.lang.String) => CanvasPattern | Null,
    createRadialGradient: (Double, Double, Double, Double, Double, Double) => CanvasGradient,
    fillStyle: java.lang.String | CanvasGradient | CanvasPattern,
    strokeStyle: java.lang.String | CanvasGradient | CanvasPattern
  ): CanvasFillStrokeStyles = {
    val __obj = js.Dynamic.literal(createLinearGradient = js.Any.fromFunction4(createLinearGradient), createPattern = js.Any.fromFunction2(createPattern), createRadialGradient = js.Any.fromFunction6(createRadialGradient), fillStyle = fillStyle.asInstanceOf[js.Any], strokeStyle = strokeStyle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CanvasFillStrokeStyles]
  }
}


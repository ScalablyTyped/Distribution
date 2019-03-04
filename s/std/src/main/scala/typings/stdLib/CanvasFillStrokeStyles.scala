package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasFillStrokeStyles extends js.Object {
  var fillStyle: java.lang.String | CanvasGradient | CanvasPattern
  var strokeStyle: java.lang.String | CanvasGradient | CanvasPattern
  def createLinearGradient(x0: scala.Double, y0: scala.Double, x1: scala.Double, y1: scala.Double): CanvasGradient
  def createPattern(image: CanvasImageSource, repetition: java.lang.String): CanvasPattern | scala.Null
  def createRadialGradient(
    x0: scala.Double,
    y0: scala.Double,
    r0: scala.Double,
    x1: scala.Double,
    y1: scala.Double,
    r1: scala.Double
  ): CanvasGradient
}

object CanvasFillStrokeStyles {
  @scala.inline
  def apply(
    createLinearGradient: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, CanvasGradient],
    createPattern: js.Function2[CanvasImageSource, java.lang.String, CanvasPattern | scala.Null],
    createRadialGradient: js.Function6[
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      CanvasGradient
    ],
    fillStyle: java.lang.String | CanvasGradient | CanvasPattern,
    strokeStyle: java.lang.String | CanvasGradient | CanvasPattern
  ): CanvasFillStrokeStyles = {
    val __obj = js.Dynamic.literal(createLinearGradient = createLinearGradient, createPattern = createPattern, createRadialGradient = createRadialGradient, fillStyle = fillStyle.asInstanceOf[js.Any], strokeStyle = strokeStyle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CanvasFillStrokeStyles]
  }
}


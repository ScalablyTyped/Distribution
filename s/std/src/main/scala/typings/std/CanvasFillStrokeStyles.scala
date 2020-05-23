package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasFillStrokeStyles extends js.Object {
  var fillStyle: java.lang.String | CanvasGradient | CanvasPattern = js.native
  var strokeStyle: java.lang.String | CanvasGradient | CanvasPattern = js.native
  def createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): CanvasGradient = js.native
  def createPattern(image: CanvasImageSource): CanvasPattern | Null = js.native
  def createPattern(image: CanvasImageSource, repetition: java.lang.String): CanvasPattern | Null = js.native
  def createRadialGradient(x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): CanvasGradient = js.native
}


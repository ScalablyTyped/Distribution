package typings
package atSindresorhusIsLib

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


package typings.signaturePad.mod.SignaturePad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var time: Double
  var x: Double
  var y: Double
  def distanceTo(start: Point): Double
  def velocityFrom(start: Point): Double
}

object Point {
  @scala.inline
  def apply(
    distanceTo: Point => Double,
    time: Double,
    velocityFrom: Point => Double,
    x: Double,
    y: Double,
    color: String = null
  ): Point = {
    val __obj = js.Dynamic.literal(distanceTo = js.Any.fromFunction1(distanceTo), time = time.asInstanceOf[js.Any], velocityFrom = js.Any.fromFunction1(velocityFrom), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}


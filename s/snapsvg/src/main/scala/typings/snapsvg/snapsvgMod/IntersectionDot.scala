package typings.snapsvg.snapsvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntersectionDot extends js.Object {
  var bez1: js.Array[Double]
  var bez2: js.Array[Double]
  var segment1: Double
  var segment2: Double
  var t1: Double
  var t2: Double
  var x: Double
  var y: Double
}

object IntersectionDot {
  @scala.inline
  def apply(
    bez1: js.Array[Double],
    bez2: js.Array[Double],
    segment1: Double,
    segment2: Double,
    t1: Double,
    t2: Double,
    x: Double,
    y: Double
  ): IntersectionDot = {
    val __obj = js.Dynamic.literal(bez1 = bez1, bez2 = bez2, segment1 = segment1, segment2 = segment2, t1 = t1, t2 = t2, x = x, y = y)
  
    __obj.asInstanceOf[IntersectionDot]
  }
}


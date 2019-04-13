package typings
package snapsvgLib.snapsvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntersectionDot extends js.Object {
  var bez1: js.Array[scala.Double]
  var bez2: js.Array[scala.Double]
  var segment1: scala.Double
  var segment2: scala.Double
  var t1: scala.Double
  var t2: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object IntersectionDot {
  @scala.inline
  def apply(
    bez1: js.Array[scala.Double],
    bez2: js.Array[scala.Double],
    segment1: scala.Double,
    segment2: scala.Double,
    t1: scala.Double,
    t2: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): IntersectionDot = {
    val __obj = js.Dynamic.literal(bez1 = bez1, bez2 = bez2, segment1 = segment1, segment2 = segment2, t1 = t1, t2 = t2, x = x, y = y)
  
    __obj.asInstanceOf[IntersectionDot]
  }
}


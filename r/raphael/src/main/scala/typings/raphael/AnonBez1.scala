package typings.raphael

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBez1 extends js.Object {
  var bez1: js.Array[_]
  var bez2: js.Array[_]
  var segment1: Double
  var segment2: Double
  var t1: Double
  var t2: Double
  var x: Double
  var y: Double
}

object AnonBez1 {
  @scala.inline
  def apply(
    bez1: js.Array[_],
    bez2: js.Array[_],
    segment1: Double,
    segment2: Double,
    t1: Double,
    t2: Double,
    x: Double,
    y: Double
  ): AnonBez1 = {
    val __obj = js.Dynamic.literal(bez1 = bez1.asInstanceOf[js.Any], bez2 = bez2.asInstanceOf[js.Any], segment1 = segment1.asInstanceOf[js.Any], segment2 = segment2.asInstanceOf[js.Any], t1 = t1.asInstanceOf[js.Any], t2 = t2.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBez1]
  }
}


package typings.recharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  var value: Double | js.Array[_]
  var x: Double
  var y: Double
}

object Point {
  @scala.inline
  def apply(value: Double | js.Array[_], x: Double, y: Double): Point = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}


package typings.sat.SAT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Circle extends js.Object {
  var pos: Vector
  var r: Double
}

object Circle {
  @scala.inline
  def apply(pos: Vector, r: Double): Circle = {
    val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[Circle]
  }
}


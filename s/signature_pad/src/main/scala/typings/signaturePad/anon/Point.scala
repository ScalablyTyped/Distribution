package typings.signaturePad.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  var color: String
  var point: typings.signaturePad.mod.Point
}

object Point {
  @scala.inline
  def apply(color: String, point: typings.signaturePad.mod.Point): Point = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}


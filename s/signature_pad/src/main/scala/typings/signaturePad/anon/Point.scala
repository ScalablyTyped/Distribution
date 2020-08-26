package typings.signaturePad.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Point extends js.Object {
  var color: String = js.native
  var point: typings.signaturePad.mod.Point = js.native
}

object Point {
  @scala.inline
  def apply(color: String, point: typings.signaturePad.mod.Point): Point = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
  @scala.inline
  implicit class PointOps[Self <: Point] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setPoint(value: typings.signaturePad.mod.Point): Self = this.set("point", value.asInstanceOf[js.Any])
  }
  
}


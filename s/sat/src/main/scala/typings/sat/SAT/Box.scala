package typings.sat.SAT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Box extends js.Object {
  var h: Double = js.native
  var pos: Vector = js.native
  var w: Double = js.native
  def toPolygon(): Polygon = js.native
}

object Box {
  @scala.inline
  def apply(h: Double, pos: Vector, toPolygon: () => Polygon, w: Double): Box = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], toPolygon = js.Any.fromFunction0(toPolygon), w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[Box]
  }
  @scala.inline
  implicit class BoxOps[Self <: Box] (val x: Self) extends AnyVal {
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
    def setH(value: Double): Self = this.set("h", value.asInstanceOf[js.Any])
    @scala.inline
    def setPos(value: Vector): Self = this.set("pos", value.asInstanceOf[js.Any])
    @scala.inline
    def setToPolygon(value: () => Polygon): Self = this.set("toPolygon", js.Any.fromFunction0(value))
    @scala.inline
    def setW(value: Double): Self = this.set("w", value.asInstanceOf[js.Any])
  }
  
}


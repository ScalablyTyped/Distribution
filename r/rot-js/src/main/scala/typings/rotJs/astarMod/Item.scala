package typings.rotJs.astarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Item extends js.Object {
  var g: Double = js.native
  var h: Double = js.native
  var prev: Item | Null = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object Item {
  @scala.inline
  def apply(g: Double, h: Double, x: Double, y: Double): Item = {
    val __obj = js.Dynamic.literal(g = g.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  @scala.inline
  implicit class ItemOps[Self <: Item] (val x: Self) extends AnyVal {
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
    def setG(value: Double): Self = this.set("g", value.asInstanceOf[js.Any])
    @scala.inline
    def setH(value: Double): Self = this.set("h", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrev(value: Item): Self = this.set("prev", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevNull: Self = this.set("prev", null)
  }
  
}


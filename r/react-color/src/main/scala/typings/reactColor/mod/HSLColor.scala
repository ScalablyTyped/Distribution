package typings.reactColor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HSLColor extends _Color {
  var a: js.UndefOr[Double] = js.native
  var h: Double = js.native
  var l: Double = js.native
  var s: Double = js.native
}

object HSLColor {
  @scala.inline
  def apply(h: Double, l: Double, s: Double): HSLColor = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[HSLColor]
  }
  @scala.inline
  implicit class HSLColorOps[Self <: HSLColor] (val x: Self) extends AnyVal {
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
    def setL(value: Double): Self = this.set("l", value.asInstanceOf[js.Any])
    @scala.inline
    def setS(value: Double): Self = this.set("s", value.asInstanceOf[js.Any])
    @scala.inline
    def setA(value: Double): Self = this.set("a", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteA: Self = this.set("a", js.undefined)
  }
  
}


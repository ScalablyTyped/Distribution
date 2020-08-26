package typings.snapsvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BBox extends js.Object {
  var cx: Double = js.native
  var cy: Double = js.native
  var h: Double = js.native
  var height: Double = js.native
  var path: Double = js.native
  var r0: Double = js.native
  var r1: Double = js.native
  var r2: Double = js.native
  var vb: String = js.native
  var w: Double = js.native
  var width: Double = js.native
  var x: Double = js.native
  var x2: Double = js.native
  var y: Double = js.native
  var y2: Double = js.native
}

object BBox {
  @scala.inline
  def apply(
    cx: Double,
    cy: Double,
    h: Double,
    height: Double,
    path: Double,
    r0: Double,
    r1: Double,
    r2: Double,
    vb: String,
    w: Double,
    width: Double,
    x: Double,
    x2: Double,
    y: Double,
    y2: Double
  ): BBox = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], r0 = r0.asInstanceOf[js.Any], r1 = r1.asInstanceOf[js.Any], r2 = r2.asInstanceOf[js.Any], vb = vb.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[BBox]
  }
  @scala.inline
  implicit class BBoxOps[Self <: BBox] (val x: Self) extends AnyVal {
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
    def setCx(value: Double): Self = this.set("cx", value.asInstanceOf[js.Any])
    @scala.inline
    def setCy(value: Double): Self = this.set("cy", value.asInstanceOf[js.Any])
    @scala.inline
    def setH(value: Double): Self = this.set("h", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: Double): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setR0(value: Double): Self = this.set("r0", value.asInstanceOf[js.Any])
    @scala.inline
    def setR1(value: Double): Self = this.set("r1", value.asInstanceOf[js.Any])
    @scala.inline
    def setR2(value: Double): Self = this.set("r2", value.asInstanceOf[js.Any])
    @scala.inline
    def setVb(value: String): Self = this.set("vb", value.asInstanceOf[js.Any])
    @scala.inline
    def setW(value: Double): Self = this.set("w", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setX2(value: Double): Self = this.set("x2", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setY2(value: Double): Self = this.set("y2", value.asInstanceOf[js.Any])
  }
  
}


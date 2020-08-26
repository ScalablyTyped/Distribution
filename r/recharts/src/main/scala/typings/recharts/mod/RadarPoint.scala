package typings.recharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadarPoint extends js.Object {
  var angle: Double = js.native
  var cx: Double = js.native
  var cy: Double = js.native
  var payload: js.Object = js.native
  var radius: Double = js.native
  var value: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object RadarPoint {
  @scala.inline
  def apply(
    angle: Double,
    cx: Double,
    cy: Double,
    payload: js.Object,
    radius: Double,
    value: Double,
    x: Double,
    y: Double
  ): RadarPoint = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadarPoint]
  }
  @scala.inline
  implicit class RadarPointOps[Self <: RadarPoint] (val x: Self) extends AnyVal {
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
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def setCx(value: Double): Self = this.set("cx", value.asInstanceOf[js.Any])
    @scala.inline
    def setCy(value: Double): Self = this.set("cy", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayload(value: js.Object): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}


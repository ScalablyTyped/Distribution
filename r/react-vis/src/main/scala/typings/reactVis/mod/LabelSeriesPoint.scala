package typings.reactVis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelSeriesPoint extends AbstractSeriesPoint {
  var label: String = js.native
  var rotation: js.UndefOr[Double] = js.native
  var x: Double = js.native
  var xOffset: js.UndefOr[Double] = js.native
  var y: Double = js.native
  var yOffset: js.UndefOr[Double] = js.native
}

object LabelSeriesPoint {
  @scala.inline
  def apply(label: String, x: Double, y: Double): LabelSeriesPoint = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelSeriesPoint]
  }
  @scala.inline
  implicit class LabelSeriesPointOps[Self <: LabelSeriesPoint] (val x: Self) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setXOffset(value: Double): Self = this.set("xOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXOffset: Self = this.set("xOffset", js.undefined)
    @scala.inline
    def setYOffset(value: Double): Self = this.set("yOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYOffset: Self = this.set("yOffset", js.undefined)
  }
  
}


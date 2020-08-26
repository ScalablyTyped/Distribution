package typings.recharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolarViewBox extends js.Object {
  var cx: js.UndefOr[Double] = js.native
  var cy: js.UndefOr[Double] = js.native
  var endAngle: js.UndefOr[Double] = js.native
  var innerRadius: js.UndefOr[Double] = js.native
  var outerRadius: js.UndefOr[Double] = js.native
  var startAngle: js.UndefOr[Double] = js.native
}

object PolarViewBox {
  @scala.inline
  def apply(): PolarViewBox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolarViewBox]
  }
  @scala.inline
  implicit class PolarViewBoxOps[Self <: PolarViewBox] (val x: Self) extends AnyVal {
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
    def deleteCx: Self = this.set("cx", js.undefined)
    @scala.inline
    def setCy(value: Double): Self = this.set("cy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCy: Self = this.set("cy", js.undefined)
    @scala.inline
    def setEndAngle(value: Double): Self = this.set("endAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndAngle: Self = this.set("endAngle", js.undefined)
    @scala.inline
    def setInnerRadius(value: Double): Self = this.set("innerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerRadius: Self = this.set("innerRadius", js.undefined)
    @scala.inline
    def setOuterRadius(value: Double): Self = this.set("outerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOuterRadius: Self = this.set("outerRadius", js.undefined)
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
  }
  
}


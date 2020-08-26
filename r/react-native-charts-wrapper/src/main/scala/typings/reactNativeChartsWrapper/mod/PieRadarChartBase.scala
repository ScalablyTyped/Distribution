package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PieRadarChartBase extends ChartBase {
  var minOffset: js.UndefOr[Double] = js.native
  var rotationAngle: js.UndefOr[Double] = js.native
  var rotationEnabled: js.UndefOr[Boolean] = js.native
}

object PieRadarChartBase {
  @scala.inline
  def apply(): PieRadarChartBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieRadarChartBase]
  }
  @scala.inline
  implicit class PieRadarChartBaseOps[Self <: PieRadarChartBase] (val x: Self) extends AnyVal {
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
    def setMinOffset(value: Double): Self = this.set("minOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinOffset: Self = this.set("minOffset", js.undefined)
    @scala.inline
    def setRotationAngle(value: Double): Self = this.set("rotationAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotationAngle: Self = this.set("rotationAngle", js.undefined)
    @scala.inline
    def setRotationEnabled(value: Boolean): Self = this.set("rotationEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotationEnabled: Self = this.set("rotationEnabled", js.undefined)
  }
  
}


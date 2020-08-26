package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadarData extends js.Object {
  var dataSets: js.UndefOr[js.Array[RadarDataset]] = js.native
  var labels: js.UndefOr[js.Array[String]] = js.native
}

object RadarData {
  @scala.inline
  def apply(): RadarData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadarData]
  }
  @scala.inline
  implicit class RadarDataOps[Self <: RadarData] (val x: Self) extends AnyVal {
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
    def setDataSetsVarargs(value: RadarDataset*): Self = this.set("dataSets", js.Array(value :_*))
    @scala.inline
    def setDataSets(value: js.Array[RadarDataset]): Self = this.set("dataSets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSets: Self = this.set("dataSets", js.undefined)
    @scala.inline
    def setLabelsVarargs(value: String*): Self = this.set("labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: js.Array[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
  }
  
}


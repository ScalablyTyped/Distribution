package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.anon.BarWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarData extends js.Object {
  var config: js.UndefOr[BarWidth] = js.native
  var dataSets: js.UndefOr[js.Array[BarDataset]] = js.native
}

object BarData {
  @scala.inline
  def apply(): BarData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarData]
  }
  @scala.inline
  implicit class BarDataOps[Self <: BarData] (val x: Self) extends AnyVal {
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
    def setConfig(value: BarWidth): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setDataSetsVarargs(value: BarDataset*): Self = this.set("dataSets", js.Array(value :_*))
    @scala.inline
    def setDataSets(value: js.Array[BarDataset]): Self = this.set("dataSets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSets: Self = this.set("dataSets", js.undefined)
  }
  
}


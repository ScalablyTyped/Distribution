package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarDataset extends Dataset {
  var config: js.UndefOr[BarDatasetConfig] = js.native
  var values: js.UndefOr[js.Array[BarValue | Double | js.Array[Double]]] = js.native
}

object BarDataset {
  @scala.inline
  def apply(): BarDataset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarDataset]
  }
  @scala.inline
  implicit class BarDatasetOps[Self <: BarDataset] (val x: Self) extends AnyVal {
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
    def setConfig(value: BarDatasetConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setValuesVarargs(value: (BarValue | Double | js.Array[Double])*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[BarValue | Double | js.Array[Double]]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}


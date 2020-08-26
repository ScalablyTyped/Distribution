package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadarDataset extends Dataset {
  var config: js.UndefOr[RadarDatasetConfig] = js.native
  @JSName("label")
  var label_RadarDataset: String = js.native
  var values: js.UndefOr[js.Array[Value | Double]] = js.native
}

object RadarDataset {
  @scala.inline
  def apply(label: String): RadarDataset = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadarDataset]
  }
  @scala.inline
  implicit class RadarDatasetOps[Self <: RadarDataset] (val x: Self) extends AnyVal {
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
    def setConfig(value: RadarDatasetConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setValuesVarargs(value: (Value | Double)*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[Value | Double]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}


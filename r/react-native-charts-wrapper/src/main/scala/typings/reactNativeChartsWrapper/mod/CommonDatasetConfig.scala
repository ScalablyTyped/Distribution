package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonDatasetConfig extends js.Object {
  var axisDependency: js.UndefOr[AxisDependency] = js.native
  var color: js.UndefOr[Color] = js.native
  var colors: js.UndefOr[js.Array[Color]] = js.native
  var drawValues: js.UndefOr[Boolean] = js.native
  var highlightEnabled: js.UndefOr[Boolean] = js.native
  var valueFormatter: js.UndefOr[ValueFormatter] = js.native
  var valueTextColor: js.UndefOr[Color] = js.native
  var valueTextSize: js.UndefOr[Double] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object CommonDatasetConfig {
  @scala.inline
  def apply(): CommonDatasetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonDatasetConfig]
  }
  @scala.inline
  implicit class CommonDatasetConfigOps[Self <: CommonDatasetConfig] (val x: Self) extends AnyVal {
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
    def setAxisDependency(value: AxisDependency): Self = this.set("axisDependency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisDependency: Self = this.set("axisDependency", js.undefined)
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setColorsVarargs(value: Color*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: js.Array[Color]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setDrawValues(value: Boolean): Self = this.set("drawValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawValues: Self = this.set("drawValues", js.undefined)
    @scala.inline
    def setHighlightEnabled(value: Boolean): Self = this.set("highlightEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightEnabled: Self = this.set("highlightEnabled", js.undefined)
    @scala.inline
    def setValueFormatterVarargs(value: String*): Self = this.set("valueFormatter", js.Array(value :_*))
    @scala.inline
    def setValueFormatter(value: ValueFormatter): Self = this.set("valueFormatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueFormatter: Self = this.set("valueFormatter", js.undefined)
    @scala.inline
    def setValueTextColor(value: Color): Self = this.set("valueTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueTextColor: Self = this.set("valueTextColor", js.undefined)
    @scala.inline
    def setValueTextSize(value: Double): Self = this.set("valueTextSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueTextSize: Self = this.set("valueTextSize", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}


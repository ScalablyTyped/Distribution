package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarDatasetConfig
  extends CommonDatasetConfig
     with BarLineScatterCandleBubbleConfig {
  var barShadowColor: js.UndefOr[Color] = js.native
  var highlightAlpha: js.UndefOr[Double] = js.native
  var stackLabels: js.UndefOr[js.Array[String]] = js.native
}

object BarDatasetConfig {
  @scala.inline
  def apply(): BarDatasetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarDatasetConfig]
  }
  @scala.inline
  implicit class BarDatasetConfigOps[Self <: BarDatasetConfig] (val x: Self) extends AnyVal {
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
    def setBarShadowColor(value: Color): Self = this.set("barShadowColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarShadowColor: Self = this.set("barShadowColor", js.undefined)
    @scala.inline
    def setHighlightAlpha(value: Double): Self = this.set("highlightAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightAlpha: Self = this.set("highlightAlpha", js.undefined)
    @scala.inline
    def setStackLabelsVarargs(value: String*): Self = this.set("stackLabels", js.Array(value :_*))
    @scala.inline
    def setStackLabels(value: js.Array[String]): Self = this.set("stackLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackLabels: Self = this.set("stackLabels", js.undefined)
  }
  
}


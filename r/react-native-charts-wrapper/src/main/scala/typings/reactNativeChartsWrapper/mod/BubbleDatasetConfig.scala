package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BubbleDatasetConfig
  extends CommonDatasetConfig
     with BarLineScatterCandleBubbleConfig {
  var highlightCircleWidth: js.UndefOr[Double] = js.native
}

object BubbleDatasetConfig {
  @scala.inline
  def apply(): BubbleDatasetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BubbleDatasetConfig]
  }
  @scala.inline
  implicit class BubbleDatasetConfigOps[Self <: BubbleDatasetConfig] (val x: Self) extends AnyVal {
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
    def setHighlightCircleWidth(value: Double): Self = this.set("highlightCircleWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightCircleWidth: Self = this.set("highlightCircleWidth", js.undefined)
  }
  
}


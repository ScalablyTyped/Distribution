package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BubbleData extends js.Object {
  var dataSets: js.UndefOr[js.Array[BubbleDataset]] = js.native
}

object BubbleData {
  @scala.inline
  def apply(): BubbleData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BubbleData]
  }
  @scala.inline
  implicit class BubbleDataOps[Self <: BubbleData] (val x: Self) extends AnyVal {
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
    def setDataSetsVarargs(value: BubbleDataset*): Self = this.set("dataSets", js.Array(value :_*))
    @scala.inline
    def setDataSets(value: js.Array[BubbleDataset]): Self = this.set("dataSets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSets: Self = this.set("dataSets", js.undefined)
  }
  
}


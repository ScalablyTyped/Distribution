package typings.reactNativeChartsWrapper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataIndex extends js.Object {
  var dataIndex: js.UndefOr[Double] = js.native
  var dataSetIndex: js.UndefOr[Double] = js.native
  var stackIndex: js.UndefOr[Double] = js.native
  var x: Double = js.native
  var y: js.UndefOr[Double] = js.native
}

object DataIndex {
  @scala.inline
  def apply(x: Double): DataIndex = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataIndex]
  }
  @scala.inline
  implicit class DataIndexOps[Self <: DataIndex] (val x: Self) extends AnyVal {
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
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataIndex(value: Double): Self = this.set("dataIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataIndex: Self = this.set("dataIndex", js.undefined)
    @scala.inline
    def setDataSetIndex(value: Double): Self = this.set("dataSetIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSetIndex: Self = this.set("dataSetIndex", js.undefined)
    @scala.inline
    def setStackIndex(value: Double): Self = this.set("stackIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackIndex: Self = this.set("stackIndex", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}


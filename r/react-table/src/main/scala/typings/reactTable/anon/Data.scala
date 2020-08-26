package typings.reactTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data[D /* <: js.Object */] extends js.Object {
  var data: js.Array[D] = js.native
  var depth: Double = js.native
  var subRows: js.Array[D] = js.native
}

object Data {
  @scala.inline
  def apply[/* <: js.Object */ D](data: js.Array[D], depth: Double, subRows: js.Array[D]): Data[D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], subRows = subRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[D]]
  }
  @scala.inline
  implicit class DataOps[Self <: Data[_], /* <: js.Object */ D] (val x: Self with Data[D]) extends AnyVal {
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
    def setDataVarargs(value: D*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[D]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubRowsVarargs(value: D*): Self = this.set("subRows", js.Array(value :_*))
    @scala.inline
    def setSubRows(value: js.Array[D]): Self = this.set("subRows", value.asInstanceOf[js.Any])
  }
  
}


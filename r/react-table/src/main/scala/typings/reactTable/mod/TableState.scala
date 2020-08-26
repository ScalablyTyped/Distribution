package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableState[D /* <: js.Object */] extends js.Object {
  var hiddenColumns: js.UndefOr[js.Array[IdType[D]]] = js.native
}

object TableState {
  @scala.inline
  def apply[/* <: js.Object */ D](): TableState[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableState[D]]
  }
  @scala.inline
  implicit class TableStateOps[Self <: TableState[_], /* <: js.Object */ D] (val x: Self with TableState[D]) extends AnyVal {
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
    def setHiddenColumnsVarargs(value: IdType[D]*): Self = this.set("hiddenColumns", js.Array(value :_*))
    @scala.inline
    def setHiddenColumns(value: js.Array[IdType[D]]): Self = this.set("hiddenColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHiddenColumns: Self = this.set("hiddenColumns", js.undefined)
  }
  
}


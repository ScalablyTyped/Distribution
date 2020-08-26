package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseSortByInstanceProps[D /* <: js.Object */] extends js.Object {
  var preSortedRows: js.Array[Row[D]] = js.native
  var rows: js.Array[Row[D]] = js.native
  def toggleSortBy(columnId: IdType[D], descending: Boolean, isMulti: Boolean): Unit = js.native
}

object UseSortByInstanceProps {
  @scala.inline
  def apply[/* <: js.Object */ D](
    preSortedRows: js.Array[Row[D]],
    rows: js.Array[Row[D]],
    toggleSortBy: (IdType[D], Boolean, Boolean) => Unit
  ): UseSortByInstanceProps[D] = {
    val __obj = js.Dynamic.literal(preSortedRows = preSortedRows.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], toggleSortBy = js.Any.fromFunction3(toggleSortBy))
    __obj.asInstanceOf[UseSortByInstanceProps[D]]
  }
  @scala.inline
  implicit class UseSortByInstancePropsOps[Self <: UseSortByInstanceProps[_], /* <: js.Object */ D] (val x: Self with UseSortByInstanceProps[D]) extends AnyVal {
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
    def setPreSortedRowsVarargs(value: Row[D]*): Self = this.set("preSortedRows", js.Array(value :_*))
    @scala.inline
    def setPreSortedRows(value: js.Array[Row[D]]): Self = this.set("preSortedRows", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowsVarargs(value: Row[D]*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[Row[D]]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def setToggleSortBy(value: (IdType[D], Boolean, Boolean) => Unit): Self = this.set("toggleSortBy", js.Any.fromFunction3(value))
  }
  
}


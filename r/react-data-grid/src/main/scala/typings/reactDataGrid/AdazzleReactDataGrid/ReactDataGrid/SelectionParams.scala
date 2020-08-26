package typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionParams[T] extends js.Object {
  var row: T = js.native
  var rowIdx: Double = js.native
}

object SelectionParams {
  @scala.inline
  def apply[T](row: T, rowIdx: Double): SelectionParams[T] = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionParams[T]]
  }
  @scala.inline
  implicit class SelectionParamsOps[Self <: SelectionParams[_], T] (val x: Self with SelectionParams[T]) extends AnyVal {
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
    def setRow(value: T): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowIdx(value: Double): Self = this.set("rowIdx", value.asInstanceOf[js.Any])
  }
  
}


package typings.reactTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Row[D /* <: js.Object */] extends js.Object {
  var row: typings.reactTable.mod.Row[D] = js.native
}

object Row {
  @scala.inline
  def apply[/* <: js.Object */ D](row: typings.reactTable.mod.Row[D]): Row[D] = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[Row[D]]
  }
  @scala.inline
  implicit class RowOps[Self <: Row[_], /* <: js.Object */ D] (val x: Self with Row[D]) extends AnyVal {
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
    def setRow(value: typings.reactTable.mod.Row[D]): Self = this.set("row", value.asInstanceOf[js.Any])
  }
  
}


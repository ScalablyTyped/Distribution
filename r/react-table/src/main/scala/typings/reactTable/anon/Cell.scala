package typings.reactTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cell[D /* <: js.Object */] extends js.Object {
  var cell: typings.reactTable.mod.Cell[D, _] = js.native
}

object Cell {
  @scala.inline
  def apply[/* <: js.Object */ D](cell: typings.reactTable.mod.Cell[D, _]): Cell[D] = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cell[D]]
  }
  @scala.inline
  implicit class CellOps[Self <: Cell[_], /* <: js.Object */ D] (val x: Self with Cell[D]) extends AnyVal {
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
    def setCell(value: typings.reactTable.mod.Cell[D, _]): Self = this.set("cell", value.asInstanceOf[js.Any])
  }
  
}


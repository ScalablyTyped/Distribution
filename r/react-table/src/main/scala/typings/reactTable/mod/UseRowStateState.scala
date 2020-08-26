package typings.reactTable.mod

import typings.reactTable.anon.CellState
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseRowStateState[D /* <: js.Object */] extends js.Object {
  var rowState: Record[String, CellState[D]] = js.native
}

object UseRowStateState {
  @scala.inline
  def apply[/* <: js.Object */ D](rowState: Record[String, CellState[D]]): UseRowStateState[D] = {
    val __obj = js.Dynamic.literal(rowState = rowState.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseRowStateState[D]]
  }
  @scala.inline
  implicit class UseRowStateStateOps[Self <: UseRowStateState[_], /* <: js.Object */ D] (val x: Self with UseRowStateState[D]) extends AnyVal {
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
    def setRowState(value: Record[String, CellState[D]]): Self = this.set("rowState", value.asInstanceOf[js.Any])
  }
  
}


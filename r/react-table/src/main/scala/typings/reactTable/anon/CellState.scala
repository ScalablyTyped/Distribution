package typings.reactTable.anon

import typings.reactTable.mod.UseRowStateLocalState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellState[D /* <: js.Object */] extends js.Object {
  var cellState: UseRowStateLocalState[D, _] = js.native
}

object CellState {
  @scala.inline
  def apply[/* <: js.Object */ D](cellState: UseRowStateLocalState[D, _]): CellState[D] = {
    val __obj = js.Dynamic.literal(cellState = cellState.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellState[D]]
  }
  @scala.inline
  implicit class CellStateOps[Self <: CellState[_], /* <: js.Object */ D] (val x: Self with CellState[D]) extends AnyVal {
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
    def setCellState(value: UseRowStateLocalState[D, _]): Self = this.set("cellState", value.asInstanceOf[js.Any])
  }
  
}


package typings.reactTable.anon

import typings.reactTable.mod.UseRowStateLocalState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellState[D /* <: js.Object */] extends js.Object {
  var cellState: UseRowStateLocalState[D, _]
}

object CellState {
  @scala.inline
  def apply[/* <: js.Object */ D](cellState: UseRowStateLocalState[D, _]): CellState[D] = {
    val __obj = js.Dynamic.literal(cellState = cellState.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellState[D]]
  }
}


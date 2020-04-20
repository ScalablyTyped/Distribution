package typings.reactTable

import typings.reactTable.mod.UseRowStateLocalState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCellState[D /* <: js.Object */] extends js.Object {
  var cellState: UseRowStateLocalState[D, _]
}

object AnonCellState {
  @scala.inline
  def apply[D /* <: js.Object */](cellState: UseRowStateLocalState[D, _]): AnonCellState[D] = {
    val __obj = js.Dynamic.literal(cellState = cellState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCellState[D]]
  }
}


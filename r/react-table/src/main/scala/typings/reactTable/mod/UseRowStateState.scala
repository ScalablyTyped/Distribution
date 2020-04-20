package typings.reactTable.mod

import typings.reactTable.AnonCellState
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseRowStateState[D /* <: js.Object */] extends js.Object {
  var rowState: Record[String, AnonCellState[D]]
}

object UseRowStateState {
  @scala.inline
  def apply[D /* <: js.Object */](rowState: Record[String, AnonCellState[D]]): UseRowStateState[D] = {
    val __obj = js.Dynamic.literal(rowState = rowState.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseRowStateState[D]]
  }
}


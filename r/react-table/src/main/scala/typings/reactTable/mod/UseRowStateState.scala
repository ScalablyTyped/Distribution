package typings.reactTable.mod

import typings.reactTable.anon.CellState
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseRowStateState[D /* <: js.Object */] extends js.Object {
  var rowState: Record[String, CellState[D]]
}

object UseRowStateState {
  @scala.inline
  def apply[D](rowState: Record[String, CellState[D]]): UseRowStateState[D] = {
    val __obj = js.Dynamic.literal(rowState = rowState.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseRowStateState[D]]
  }
}


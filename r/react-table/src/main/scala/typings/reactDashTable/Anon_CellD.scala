package typings.reactDashTable

import typings.reactDashTable.reactDashTableMod.Cell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CellD[D /* <: js.Object */] extends js.Object {
  var cell: Cell[D]
}

object Anon_CellD {
  @scala.inline
  def apply[D /* <: js.Object */](cell: Cell[D]): Anon_CellD[D] = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CellD[D]]
  }
}


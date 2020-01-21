package typings.reactTable

import typings.reactTable.mod.Cell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCellD[D /* <: js.Object */] extends js.Object {
  var cell: Cell[D]
}

object AnonCellD {
  @scala.inline
  def apply[D /* <: js.Object */](cell: Cell[D]): AnonCellD[D] = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCellD[D]]
  }
}


package typings.reactTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cell[D /* <: js.Object */] extends js.Object {
  var cell: typings.reactTable.mod.Cell[D, _]
}

object Cell {
  @scala.inline
  def apply[D](cell: typings.reactTable.mod.Cell[D, _]): Cell[D] = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cell[D]]
  }
}


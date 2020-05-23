package typings.reactTable.mod

import typings.reactTable.anon.ColumnWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseResizeColumnsState[D /* <: js.Object */] extends js.Object {
  var columnResizing: ColumnWidth
}

object UseResizeColumnsState {
  @scala.inline
  def apply[D](columnResizing: ColumnWidth): UseResizeColumnsState[D] = {
    val __obj = js.Dynamic.literal(columnResizing = columnResizing.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseResizeColumnsState[D]]
  }
}


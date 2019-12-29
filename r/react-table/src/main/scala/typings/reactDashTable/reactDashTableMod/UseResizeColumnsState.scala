package typings.reactDashTable.reactDashTableMod

import typings.reactDashTable.Anon_ColumnWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseResizeColumnsState[D /* <: js.Object */] extends js.Object {
  var columnResizing: Anon_ColumnWidth
}

object UseResizeColumnsState {
  @scala.inline
  def apply[D /* <: js.Object */](columnResizing: Anon_ColumnWidth): UseResizeColumnsState[D] = {
    val __obj = js.Dynamic.literal(columnResizing = columnResizing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UseResizeColumnsState[D]]
  }
}


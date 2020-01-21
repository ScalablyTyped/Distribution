package typings.reactTable.mod

import typings.reactTable.AnonColumnWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseResizeColumnsState[D /* <: js.Object */] extends js.Object {
  var columnResizing: AnonColumnWidth
}

object UseResizeColumnsState {
  @scala.inline
  def apply[D /* <: js.Object */](columnResizing: AnonColumnWidth): UseResizeColumnsState[D] = {
    val __obj = js.Dynamic.literal(columnResizing = columnResizing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UseResizeColumnsState[D]]
  }
}


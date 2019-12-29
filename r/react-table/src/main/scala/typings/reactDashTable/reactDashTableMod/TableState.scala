package typings.reactDashTable.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableState[D /* <: js.Object */] extends js.Object {
  var hiddenColumns: js.UndefOr[js.Array[IdType[D]]] = js.undefined
}

object TableState {
  @scala.inline
  def apply[D /* <: js.Object */](hiddenColumns: js.Array[IdType[D]] = null): TableState[D] = {
    val __obj = js.Dynamic.literal()
    if (hiddenColumns != null) __obj.updateDynamic("hiddenColumns")(hiddenColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableState[D]]
  }
}


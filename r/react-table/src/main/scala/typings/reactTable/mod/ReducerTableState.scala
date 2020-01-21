package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: any} */ trait ReducerTableState[D /* <: js.Object */] extends TableState[D]

object ReducerTableState {
  @scala.inline
  def apply[D /* <: js.Object */](hiddenColumns: js.Array[IdType[D]] = null): ReducerTableState[D] = {
    val __obj = js.Dynamic.literal()
    if (hiddenColumns != null) __obj.updateDynamic("hiddenColumns")(hiddenColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReducerTableState[D]]
  }
}


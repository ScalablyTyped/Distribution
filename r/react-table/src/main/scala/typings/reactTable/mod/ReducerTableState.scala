package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: any} */ @js.native
trait ReducerTableState[D /* <: js.Object */] extends TableState[D]

object ReducerTableState {
  @scala.inline
  def apply[/* <: js.Object */ D](): ReducerTableState[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReducerTableState[D]]
  }
}


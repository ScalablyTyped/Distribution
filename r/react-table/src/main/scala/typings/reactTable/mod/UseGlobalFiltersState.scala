package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseGlobalFiltersState[D /* <: js.Object */] extends js.Object {
  var globalFilter: js.Any
}

object UseGlobalFiltersState {
  @scala.inline
  def apply[D /* <: js.Object */](globalFilter: js.Any): UseGlobalFiltersState[D] = {
    val __obj = js.Dynamic.literal(globalFilter = globalFilter.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UseGlobalFiltersState[D]]
  }
}


package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseSortByState[D /* <: js.Object */] extends js.Object {
  var sortBy: js.Array[SortingRule[D]]
}

object UseSortByState {
  @scala.inline
  def apply[D /* <: js.Object */](sortBy: js.Array[SortingRule[D]]): UseSortByState[D] = {
    val __obj = js.Dynamic.literal(sortBy = sortBy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UseSortByState[D]]
  }
}


package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseSortByState[D /* <: js.Object */] extends js.Object {
  var sortBy: js.Array[SortingRule[D]] = js.native
}

object UseSortByState {
  @scala.inline
  def apply[/* <: js.Object */ D](sortBy: js.Array[SortingRule[D]]): UseSortByState[D] = {
    val __obj = js.Dynamic.literal(sortBy = sortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseSortByState[D]]
  }
  @scala.inline
  implicit class UseSortByStateOps[Self <: UseSortByState[_], /* <: js.Object */ D] (val x: Self with UseSortByState[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSortByVarargs(value: SortingRule[D]*): Self = this.set("sortBy", js.Array(value :_*))
    @scala.inline
    def setSortBy(value: js.Array[SortingRule[D]]): Self = this.set("sortBy", value.asInstanceOf[js.Any])
  }
  
}


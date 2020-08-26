package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsePaginationState[D /* <: js.Object */] extends js.Object {
  var pageIndex: Double = js.native
  var pageSize: Double = js.native
}

object UsePaginationState {
  @scala.inline
  def apply[/* <: js.Object */ D](pageIndex: Double, pageSize: Double): UsePaginationState[D] = {
    val __obj = js.Dynamic.literal(pageIndex = pageIndex.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsePaginationState[D]]
  }
  @scala.inline
  implicit class UsePaginationStateOps[Self <: UsePaginationState[_], /* <: js.Object */ D] (val x: Self with UsePaginationState[D]) extends AnyVal {
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
    def setPageIndex(value: Double): Self = this.set("pageIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
  }
  
}


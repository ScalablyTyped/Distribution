package typings.reactTable.mod

import typings.reactTable.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseFiltersState[D /* <: js.Object */] extends js.Object {
  var filters: Filters[D] = js.native
}

object UseFiltersState {
  @scala.inline
  def apply[/* <: js.Object */ D](filters: Filters[D]): UseFiltersState[D] = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseFiltersState[D]]
  }
  @scala.inline
  implicit class UseFiltersStateOps[Self <: UseFiltersState[_], /* <: js.Object */ D] (val x: Self with UseFiltersState[D]) extends AnyVal {
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
    def setFiltersVarargs(value: Value[D]*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: Filters[D]): Self = this.set("filters", value.asInstanceOf[js.Any])
  }
  
}


package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseGlobalFiltersState[D /* <: js.Object */] extends js.Object {
  var globalFilter: js.Any = js.native
}

object UseGlobalFiltersState {
  @scala.inline
  def apply[/* <: js.Object */ D](globalFilter: js.Any): UseGlobalFiltersState[D] = {
    val __obj = js.Dynamic.literal(globalFilter = globalFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseGlobalFiltersState[D]]
  }
  @scala.inline
  implicit class UseGlobalFiltersStateOps[Self <: UseGlobalFiltersState[_], /* <: js.Object */ D] (val x: Self with UseGlobalFiltersState[D]) extends AnyVal {
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
    def setGlobalFilter(value: js.Any): Self = this.set("globalFilter", value.asInstanceOf[js.Any])
  }
  
}


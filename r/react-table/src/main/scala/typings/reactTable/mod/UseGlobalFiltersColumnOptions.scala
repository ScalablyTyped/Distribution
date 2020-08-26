package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  disableGlobalFilter :boolean | undefined}> */
@js.native
trait UseGlobalFiltersColumnOptions[D /* <: js.Object */] extends js.Object {
  var disableGlobalFilter: js.UndefOr[Boolean] = js.native
}

object UseGlobalFiltersColumnOptions {
  @scala.inline
  def apply[/* <: js.Object */ D](): UseGlobalFiltersColumnOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseGlobalFiltersColumnOptions[D]]
  }
  @scala.inline
  implicit class UseGlobalFiltersColumnOptionsOps[Self <: UseGlobalFiltersColumnOptions[_], /* <: js.Object */ D] (val x: Self with UseGlobalFiltersColumnOptions[D]) extends AnyVal {
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
    def setDisableGlobalFilter(value: Boolean): Self = this.set("disableGlobalFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableGlobalFilter: Self = this.set("disableGlobalFilter", js.undefined)
  }
  
}


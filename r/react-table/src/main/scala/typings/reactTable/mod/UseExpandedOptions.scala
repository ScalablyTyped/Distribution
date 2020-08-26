package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  manualExpandedKey :react-table.react-table.IdType<D>,   paginateExpandedRows :boolean,   expandSubRows :boolean,   autoResetExpanded :boolean | undefined}> */
@js.native
trait UseExpandedOptions[D /* <: js.Object */] extends js.Object {
  var autoResetExpanded: js.UndefOr[Boolean] = js.native
  var expandSubRows: js.UndefOr[Boolean] = js.native
  var manualExpandedKey: js.UndefOr[IdType[D]] = js.native
  var paginateExpandedRows: js.UndefOr[Boolean] = js.native
}

object UseExpandedOptions {
  @scala.inline
  def apply[/* <: js.Object */ D](): UseExpandedOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseExpandedOptions[D]]
  }
  @scala.inline
  implicit class UseExpandedOptionsOps[Self <: UseExpandedOptions[_], /* <: js.Object */ D] (val x: Self with UseExpandedOptions[D]) extends AnyVal {
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
    def setAutoResetExpanded(value: Boolean): Self = this.set("autoResetExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoResetExpanded: Self = this.set("autoResetExpanded", js.undefined)
    @scala.inline
    def setExpandSubRows(value: Boolean): Self = this.set("expandSubRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandSubRows: Self = this.set("expandSubRows", js.undefined)
    @scala.inline
    def setManualExpandedKey(value: IdType[D]): Self = this.set("manualExpandedKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManualExpandedKey: Self = this.set("manualExpandedKey", js.undefined)
    @scala.inline
    def setPaginateExpandedRows(value: Boolean): Self = this.set("paginateExpandedRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaginateExpandedRows: Self = this.set("paginateExpandedRows", js.undefined)
  }
  
}


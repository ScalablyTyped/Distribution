package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  manualRowSelectedKey :react-table.react-table.IdType<D>,   autoResetSelectedRows :boolean,   selectSubRows :boolean}> */
@js.native
trait UseRowSelectOptions[D /* <: js.Object */] extends js.Object {
  var autoResetSelectedRows: js.UndefOr[Boolean] = js.native
  var manualRowSelectedKey: js.UndefOr[IdType[D]] = js.native
  var selectSubRows: js.UndefOr[Boolean] = js.native
}

object UseRowSelectOptions {
  @scala.inline
  def apply[/* <: js.Object */ D](): UseRowSelectOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseRowSelectOptions[D]]
  }
  @scala.inline
  implicit class UseRowSelectOptionsOps[Self <: UseRowSelectOptions[_], /* <: js.Object */ D] (val x: Self with UseRowSelectOptions[D]) extends AnyVal {
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
    def setAutoResetSelectedRows(value: Boolean): Self = this.set("autoResetSelectedRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoResetSelectedRows: Self = this.set("autoResetSelectedRows", js.undefined)
    @scala.inline
    def setManualRowSelectedKey(value: IdType[D]): Self = this.set("manualRowSelectedKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManualRowSelectedKey: Self = this.set("manualRowSelectedKey", js.undefined)
    @scala.inline
    def setSelectSubRows(value: Boolean): Self = this.set("selectSubRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectSubRows: Self = this.set("selectSubRows", js.undefined)
  }
  
}


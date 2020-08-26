package typings.reactDataGrid.anon

import typings.reactDataGrid.AdazzleReactDataGrid.SelectionParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableShiftSelect[T] extends js.Object {
  var enableShiftSelect: js.UndefOr[Boolean] = js.native
  var onRowsDeselected: js.UndefOr[js.Function1[/* rows */ js.Array[SelectionParams[T]], Unit]] = js.native
  var onRowsSelected: js.UndefOr[js.Function1[/* rows */ js.Array[SelectionParams[T]], Unit]] = js.native
  var selectBy: js.UndefOr[Indexes] = js.native
  var showCheckbox: js.UndefOr[Boolean] = js.native
}

object EnableShiftSelect {
  @scala.inline
  def apply[T](): EnableShiftSelect[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableShiftSelect[T]]
  }
  @scala.inline
  implicit class EnableShiftSelectOps[Self <: EnableShiftSelect[_], T] (val x: Self with EnableShiftSelect[T]) extends AnyVal {
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
    def setEnableShiftSelect(value: Boolean): Self = this.set("enableShiftSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableShiftSelect: Self = this.set("enableShiftSelect", js.undefined)
    @scala.inline
    def setOnRowsDeselected(value: /* rows */ js.Array[SelectionParams[T]] => Unit): Self = this.set("onRowsDeselected", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRowsDeselected: Self = this.set("onRowsDeselected", js.undefined)
    @scala.inline
    def setOnRowsSelected(value: /* rows */ js.Array[SelectionParams[T]] => Unit): Self = this.set("onRowsSelected", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRowsSelected: Self = this.set("onRowsSelected", js.undefined)
    @scala.inline
    def setSelectBy(value: Indexes): Self = this.set("selectBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectBy: Self = this.set("selectBy", js.undefined)
    @scala.inline
    def setShowCheckbox(value: Boolean): Self = this.set("showCheckbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCheckbox: Self = this.set("showCheckbox", js.undefined)
  }
  
}


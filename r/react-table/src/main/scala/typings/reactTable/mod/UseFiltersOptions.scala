package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  manualFilters :boolean,   disableFilters :boolean,   defaultCanFilter :boolean,   filterTypes :react-table.react-table.FilterTypes<D>,   autoResetFilters :boolean | undefined}> */
@js.native
trait UseFiltersOptions[D /* <: js.Object */] extends js.Object {
  var autoResetFilters: js.UndefOr[Boolean] = js.native
  var defaultCanFilter: js.UndefOr[Boolean] = js.native
  var disableFilters: js.UndefOr[Boolean] = js.native
  var filterTypes: js.UndefOr[FilterTypes[D]] = js.native
  var manualFilters: js.UndefOr[Boolean] = js.native
}

object UseFiltersOptions {
  @scala.inline
  def apply[/* <: js.Object */ D](): UseFiltersOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseFiltersOptions[D]]
  }
  @scala.inline
  implicit class UseFiltersOptionsOps[Self <: UseFiltersOptions[_], /* <: js.Object */ D] (val x: Self with UseFiltersOptions[D]) extends AnyVal {
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
    def setAutoResetFilters(value: Boolean): Self = this.set("autoResetFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoResetFilters: Self = this.set("autoResetFilters", js.undefined)
    @scala.inline
    def setDefaultCanFilter(value: Boolean): Self = this.set("defaultCanFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultCanFilter: Self = this.set("defaultCanFilter", js.undefined)
    @scala.inline
    def setDisableFilters(value: Boolean): Self = this.set("disableFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableFilters: Self = this.set("disableFilters", js.undefined)
    @scala.inline
    def setFilterTypes(value: FilterTypes[D]): Self = this.set("filterTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterTypes: Self = this.set("filterTypes", js.undefined)
    @scala.inline
    def setManualFilters(value: Boolean): Self = this.set("manualFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManualFilters: Self = this.set("manualFilters", js.undefined)
  }
  
}


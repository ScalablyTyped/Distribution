package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  Filter :react-table.react-table.Renderer<react-table.react-table.FilterProps<D>>,   disableFilters :boolean,   defaultCanFilter :boolean,   filter :react-table.react-table.FilterType<D> | react-table.react-table.DefaultFilterTypes | string}> */
@js.native
trait UseFiltersColumnOptions[D /* <: js.Object */] extends js.Object {
  var Filter: js.UndefOr[Renderer[FilterProps[D]]] = js.native
  var defaultCanFilter: js.UndefOr[Boolean] = js.native
  var disableFilters: js.UndefOr[Boolean] = js.native
  var filter: js.UndefOr[FilterType[D] | DefaultFilterTypes | String] = js.native
}

object UseFiltersColumnOptions {
  @scala.inline
  def apply[/* <: js.Object */ D](): UseFiltersColumnOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseFiltersColumnOptions[D]]
  }
  @scala.inline
  implicit class UseFiltersColumnOptionsOps[Self <: UseFiltersColumnOptions[_], /* <: js.Object */ D] (val x: Self with UseFiltersColumnOptions[D]) extends AnyVal {
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
    def setFilter(value: Renderer[FilterProps[D]]): Self = this.set("Filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("Filter", js.undefined)
    @scala.inline
    def setDefaultCanFilter(value: Boolean): Self = this.set("defaultCanFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultCanFilter: Self = this.set("defaultCanFilter", js.undefined)
    @scala.inline
    def setDisableFilters(value: Boolean): Self = this.set("disableFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableFilters: Self = this.set("disableFilters", js.undefined)
  }
  
}


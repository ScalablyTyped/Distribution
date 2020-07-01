package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  globalFilter  :(rows : std.Array<react-table.react-table.Row<D>>, columnIds : std.Array<react-table.react-table.IdType<D>>, filterValue : any): std.Array<react-table.react-table.Row<D>> | string,   manualGlobalFilter  :boolean,   filterTypes  :react-table.react-table.FilterTypes<D>,   autoResetGlobalFilter ? :boolean,   disableGlobalFilter ? :boolean}> */
trait UseGlobalFiltersOptions[D /* <: js.Object */] extends js.Object {
  var autoResetGlobalFilter: js.UndefOr[Boolean] = js.undefined
  var disableGlobalFilter: js.UndefOr[Boolean] = js.undefined
  var filterTypes: js.UndefOr[FilterTypes[D]] = js.undefined
  var globalFilter: js.UndefOr[
    (js.Function3[
      /* rows */ js.Array[Row[D]], 
      /* columnIds */ js.Array[IdType[D]], 
      /* filterValue */ js.Any, 
      js.Array[Row[D]]
    ]) | String
  ] = js.undefined
  var manualGlobalFilter: js.UndefOr[Boolean] = js.undefined
}

object UseGlobalFiltersOptions {
  @scala.inline
  def apply[/* <: js.Object */ D](
    autoResetGlobalFilter: js.UndefOr[Boolean] = js.undefined,
    disableGlobalFilter: js.UndefOr[Boolean] = js.undefined,
    filterTypes: FilterTypes[D] = null,
    globalFilter: (js.Function3[
      /* rows */ js.Array[Row[D]], 
      /* columnIds */ js.Array[IdType[D]], 
      /* filterValue */ js.Any, 
      js.Array[Row[D]]
    ]) | String = null,
    manualGlobalFilter: js.UndefOr[Boolean] = js.undefined
  ): UseGlobalFiltersOptions[D] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoResetGlobalFilter)) __obj.updateDynamic("autoResetGlobalFilter")(autoResetGlobalFilter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableGlobalFilter)) __obj.updateDynamic("disableGlobalFilter")(disableGlobalFilter.get.asInstanceOf[js.Any])
    if (filterTypes != null) __obj.updateDynamic("filterTypes")(filterTypes.asInstanceOf[js.Any])
    if (globalFilter != null) __obj.updateDynamic("globalFilter")(globalFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(manualGlobalFilter)) __obj.updateDynamic("manualGlobalFilter")(manualGlobalFilter.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseGlobalFiltersOptions[D]]
  }
}


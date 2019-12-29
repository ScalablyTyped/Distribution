package typings.reactDashTable

import typings.reactDashTable.reactDashTableMod.FilterTypes
import typings.reactDashTable.reactDashTableMod.IdType
import typings.reactDashTable.reactDashTableMod.Row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoResetGlobalFilter[D /* <: js.Object */] extends js.Object {
  var autoResetGlobalFilter: js.UndefOr[Boolean] = js.undefined
  var filterTypes: FilterTypes[D]
  var globalFilter: (js.Function3[
    /* rows */ js.Array[Row[D]], 
    /* columnIds */ js.Array[IdType[D]], 
    /* filterValue */ js.Any, 
    js.Array[Row[D]]
  ]) | String
  var manualGlobalFilter: Boolean
}

object Anon_AutoResetGlobalFilter {
  @scala.inline
  def apply[D /* <: js.Object */](
    filterTypes: FilterTypes[D],
    globalFilter: (js.Function3[
      /* rows */ js.Array[Row[D]], 
      /* columnIds */ js.Array[IdType[D]], 
      /* filterValue */ js.Any, 
      js.Array[Row[D]]
    ]) | String,
    manualGlobalFilter: Boolean,
    autoResetGlobalFilter: js.UndefOr[Boolean] = js.undefined
  ): Anon_AutoResetGlobalFilter[D] = {
    val __obj = js.Dynamic.literal(filterTypes = filterTypes.asInstanceOf[js.Any], globalFilter = globalFilter.asInstanceOf[js.Any], manualGlobalFilter = manualGlobalFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(autoResetGlobalFilter)) __obj.updateDynamic("autoResetGlobalFilter")(autoResetGlobalFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoResetGlobalFilter[D]]
  }
}


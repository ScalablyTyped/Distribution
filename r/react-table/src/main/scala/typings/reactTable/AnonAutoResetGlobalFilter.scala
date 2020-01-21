package typings.reactTable

import typings.reactTable.mod.FilterTypes
import typings.reactTable.mod.IdType
import typings.reactTable.mod.Row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoResetGlobalFilter[D /* <: js.Object */] extends js.Object {
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

object AnonAutoResetGlobalFilter {
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
  ): AnonAutoResetGlobalFilter[D] = {
    val __obj = js.Dynamic.literal(filterTypes = filterTypes.asInstanceOf[js.Any], globalFilter = globalFilter.asInstanceOf[js.Any], manualGlobalFilter = manualGlobalFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(autoResetGlobalFilter)) __obj.updateDynamic("autoResetGlobalFilter")(autoResetGlobalFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoResetGlobalFilter[D]]
  }
}


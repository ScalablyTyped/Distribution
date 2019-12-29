package typings.reactDashTable.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseGlobalFiltersInstanceProps[D /* <: js.Object */] extends js.Object {
  var preGlobalFilteredRows: js.Array[Row[D]]
  var rows: js.Array[Row[D]]
  def setGlobalFilter(filterValue: FilterValue): Unit
}

object UseGlobalFiltersInstanceProps {
  @scala.inline
  def apply[D /* <: js.Object */](
    preGlobalFilteredRows: js.Array[Row[D]],
    rows: js.Array[Row[D]],
    setGlobalFilter: FilterValue => Unit
  ): UseGlobalFiltersInstanceProps[D] = {
    val __obj = js.Dynamic.literal(preGlobalFilteredRows = preGlobalFilteredRows.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], setGlobalFilter = js.Any.fromFunction1(setGlobalFilter))
  
    __obj.asInstanceOf[UseGlobalFiltersInstanceProps[D]]
  }
}


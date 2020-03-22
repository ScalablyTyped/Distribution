package typings.reactTable.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseGlobalFiltersInstanceProps[D /* <: js.Object */] extends js.Object {
  var flatRows: js.Array[Row[D]]
  var globalFilteredFlatRows: js.Array[Row[D]]
  var globalFilteredRows: js.Array[Row[D]]
  var globalFilteredRowsById: Record[String, Row[D]]
  var preGlobalFilteredFlatRows: js.Array[Row[D]]
  var preGlobalFilteredRows: js.Array[Row[D]]
  var preGlobalFilteredRowsById: Record[String, Row[D]]
  var rows: js.Array[Row[D]]
  var rowsById: Record[String, Row[D]]
  def setGlobalFilter(filterValue: FilterValue): Unit
}

object UseGlobalFiltersInstanceProps {
  @scala.inline
  def apply[D /* <: js.Object */](
    flatRows: js.Array[Row[D]],
    globalFilteredFlatRows: js.Array[Row[D]],
    globalFilteredRows: js.Array[Row[D]],
    globalFilteredRowsById: Record[String, Row[D]],
    preGlobalFilteredFlatRows: js.Array[Row[D]],
    preGlobalFilteredRows: js.Array[Row[D]],
    preGlobalFilteredRowsById: Record[String, Row[D]],
    rows: js.Array[Row[D]],
    rowsById: Record[String, Row[D]],
    setGlobalFilter: FilterValue => Unit
  ): UseGlobalFiltersInstanceProps[D] = {
    val __obj = js.Dynamic.literal(flatRows = flatRows.asInstanceOf[js.Any], globalFilteredFlatRows = globalFilteredFlatRows.asInstanceOf[js.Any], globalFilteredRows = globalFilteredRows.asInstanceOf[js.Any], globalFilteredRowsById = globalFilteredRowsById.asInstanceOf[js.Any], preGlobalFilteredFlatRows = preGlobalFilteredFlatRows.asInstanceOf[js.Any], preGlobalFilteredRows = preGlobalFilteredRows.asInstanceOf[js.Any], preGlobalFilteredRowsById = preGlobalFilteredRowsById.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], rowsById = rowsById.asInstanceOf[js.Any], setGlobalFilter = js.Any.fromFunction1(setGlobalFilter))
  
    __obj.asInstanceOf[UseGlobalFiltersInstanceProps[D]]
  }
}


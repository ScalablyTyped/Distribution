package typings.reactTable.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseGlobalFiltersInstanceProps[D /* <: js.Object */] extends StObject {
  
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
  
  inline def apply[D /* <: js.Object */](
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
  
  extension [Self <: UseGlobalFiltersInstanceProps[?], D /* <: js.Object */](x: Self & UseGlobalFiltersInstanceProps[D]) {
    
    inline def setFlatRows(value: js.Array[Row[D]]): Self = StObject.set(x, "flatRows", value.asInstanceOf[js.Any])
    
    inline def setFlatRowsVarargs(value: Row[D]*): Self = StObject.set(x, "flatRows", js.Array(value*))
    
    inline def setGlobalFilteredFlatRows(value: js.Array[Row[D]]): Self = StObject.set(x, "globalFilteredFlatRows", value.asInstanceOf[js.Any])
    
    inline def setGlobalFilteredFlatRowsVarargs(value: Row[D]*): Self = StObject.set(x, "globalFilteredFlatRows", js.Array(value*))
    
    inline def setGlobalFilteredRows(value: js.Array[Row[D]]): Self = StObject.set(x, "globalFilteredRows", value.asInstanceOf[js.Any])
    
    inline def setGlobalFilteredRowsById(value: Record[String, Row[D]]): Self = StObject.set(x, "globalFilteredRowsById", value.asInstanceOf[js.Any])
    
    inline def setGlobalFilteredRowsVarargs(value: Row[D]*): Self = StObject.set(x, "globalFilteredRows", js.Array(value*))
    
    inline def setPreGlobalFilteredFlatRows(value: js.Array[Row[D]]): Self = StObject.set(x, "preGlobalFilteredFlatRows", value.asInstanceOf[js.Any])
    
    inline def setPreGlobalFilteredFlatRowsVarargs(value: Row[D]*): Self = StObject.set(x, "preGlobalFilteredFlatRows", js.Array(value*))
    
    inline def setPreGlobalFilteredRows(value: js.Array[Row[D]]): Self = StObject.set(x, "preGlobalFilteredRows", value.asInstanceOf[js.Any])
    
    inline def setPreGlobalFilteredRowsById(value: Record[String, Row[D]]): Self = StObject.set(x, "preGlobalFilteredRowsById", value.asInstanceOf[js.Any])
    
    inline def setPreGlobalFilteredRowsVarargs(value: Row[D]*): Self = StObject.set(x, "preGlobalFilteredRows", js.Array(value*))
    
    inline def setRows(value: js.Array[Row[D]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsById(value: Record[String, Row[D]]): Self = StObject.set(x, "rowsById", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: Row[D]*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setSetGlobalFilter(value: FilterValue => Unit): Self = StObject.set(x, "setGlobalFilter", js.Any.fromFunction1(value))
  }
}

package typings.reactTable.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseGlobalFiltersInstanceProps[D /* <: js.Object */] extends StObject {
  
  var flatRows: js.Array[Row[D]] = js.native
  
  var globalFilteredFlatRows: js.Array[Row[D]] = js.native
  
  var globalFilteredRows: js.Array[Row[D]] = js.native
  
  var globalFilteredRowsById: Record[String, Row[D]] = js.native
  
  var preGlobalFilteredFlatRows: js.Array[Row[D]] = js.native
  
  var preGlobalFilteredRows: js.Array[Row[D]] = js.native
  
  var preGlobalFilteredRowsById: Record[String, Row[D]] = js.native
  
  var rows: js.Array[Row[D]] = js.native
  
  var rowsById: Record[String, Row[D]] = js.native
  
  def setGlobalFilter(filterValue: FilterValue): Unit = js.native
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
  
  @scala.inline
  implicit class UseGlobalFiltersInstancePropsMutableBuilder[Self <: UseGlobalFiltersInstanceProps[_], D /* <: js.Object */] (val x: Self with UseGlobalFiltersInstanceProps[D]) extends AnyVal {
    
    @scala.inline
    def setFlatRows(value: js.Array[Row[D]]): Self = StObject.set(x, "flatRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlatRowsVarargs(value: Row[D]*): Self = StObject.set(x, "flatRows", js.Array(value :_*))
    
    @scala.inline
    def setGlobalFilteredFlatRows(value: js.Array[Row[D]]): Self = StObject.set(x, "globalFilteredFlatRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalFilteredFlatRowsVarargs(value: Row[D]*): Self = StObject.set(x, "globalFilteredFlatRows", js.Array(value :_*))
    
    @scala.inline
    def setGlobalFilteredRows(value: js.Array[Row[D]]): Self = StObject.set(x, "globalFilteredRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalFilteredRowsById(value: Record[String, Row[D]]): Self = StObject.set(x, "globalFilteredRowsById", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalFilteredRowsVarargs(value: Row[D]*): Self = StObject.set(x, "globalFilteredRows", js.Array(value :_*))
    
    @scala.inline
    def setPreGlobalFilteredFlatRows(value: js.Array[Row[D]]): Self = StObject.set(x, "preGlobalFilteredFlatRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreGlobalFilteredFlatRowsVarargs(value: Row[D]*): Self = StObject.set(x, "preGlobalFilteredFlatRows", js.Array(value :_*))
    
    @scala.inline
    def setPreGlobalFilteredRows(value: js.Array[Row[D]]): Self = StObject.set(x, "preGlobalFilteredRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreGlobalFilteredRowsById(value: Record[String, Row[D]]): Self = StObject.set(x, "preGlobalFilteredRowsById", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreGlobalFilteredRowsVarargs(value: Row[D]*): Self = StObject.set(x, "preGlobalFilteredRows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[Row[D]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsById(value: Record[String, Row[D]]): Self = StObject.set(x, "rowsById", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: Row[D]*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def setSetGlobalFilter(value: FilterValue => Unit): Self = StObject.set(x, "setGlobalFilter", js.Any.fromFunction1(value))
  }
}

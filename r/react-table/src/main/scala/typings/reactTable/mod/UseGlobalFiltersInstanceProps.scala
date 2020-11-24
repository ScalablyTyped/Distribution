package typings.reactTable.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseGlobalFiltersInstanceProps[D /* <: js.Object */] extends js.Object {
  
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
  implicit class UseGlobalFiltersInstancePropsOps[Self <: UseGlobalFiltersInstanceProps[_], D /* <: js.Object */] (val x: Self with UseGlobalFiltersInstanceProps[D]) extends AnyVal {
    
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
    def setFlatRowsVarargs(value: Row[D]*): Self = this.set("flatRows", js.Array(value :_*))
    
    @scala.inline
    def setFlatRows(value: js.Array[Row[D]]): Self = this.set("flatRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalFilteredFlatRowsVarargs(value: Row[D]*): Self = this.set("globalFilteredFlatRows", js.Array(value :_*))
    
    @scala.inline
    def setGlobalFilteredFlatRows(value: js.Array[Row[D]]): Self = this.set("globalFilteredFlatRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalFilteredRowsVarargs(value: Row[D]*): Self = this.set("globalFilteredRows", js.Array(value :_*))
    
    @scala.inline
    def setGlobalFilteredRows(value: js.Array[Row[D]]): Self = this.set("globalFilteredRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalFilteredRowsById(value: Record[String, Row[D]]): Self = this.set("globalFilteredRowsById", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreGlobalFilteredFlatRowsVarargs(value: Row[D]*): Self = this.set("preGlobalFilteredFlatRows", js.Array(value :_*))
    
    @scala.inline
    def setPreGlobalFilteredFlatRows(value: js.Array[Row[D]]): Self = this.set("preGlobalFilteredFlatRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreGlobalFilteredRowsVarargs(value: Row[D]*): Self = this.set("preGlobalFilteredRows", js.Array(value :_*))
    
    @scala.inline
    def setPreGlobalFilteredRows(value: js.Array[Row[D]]): Self = this.set("preGlobalFilteredRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreGlobalFilteredRowsById(value: Record[String, Row[D]]): Self = this.set("preGlobalFilteredRowsById", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: Row[D]*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[Row[D]]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsById(value: Record[String, Row[D]]): Self = this.set("rowsById", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetGlobalFilter(value: FilterValue => Unit): Self = this.set("setGlobalFilter", js.Any.fromFunction1(value))
  }
}

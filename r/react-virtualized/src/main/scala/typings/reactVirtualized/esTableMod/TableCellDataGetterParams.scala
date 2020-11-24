package typings.reactVirtualized.esTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableCellDataGetterParams extends js.Object {
  
  var columnData: js.UndefOr[js.Any] = js.native
  
  var dataKey: String = js.native
  
  var rowData: js.Any = js.native
}
object TableCellDataGetterParams {
  
  @scala.inline
  def apply(dataKey: String, rowData: js.Any): TableCellDataGetterParams = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCellDataGetterParams]
  }
  
  @scala.inline
  implicit class TableCellDataGetterParamsOps[Self <: TableCellDataGetterParams] (val x: Self) extends AnyVal {
    
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
    def setDataKey(value: String): Self = this.set("dataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowData(value: js.Any): Self = this.set("rowData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnData(value: js.Any): Self = this.set("columnData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnData: Self = this.set("columnData", js.undefined)
  }
}

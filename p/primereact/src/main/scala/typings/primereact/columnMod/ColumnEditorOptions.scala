package typings.primereact.columnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnEditorOptions extends StObject {
  
  var column: Column
  
  var editorCallback: js.UndefOr[js.Function1[/* val */ Any, Unit]] = js.undefined
  
  var field: String
  
  var frozenRow: js.UndefOr[Boolean] = js.undefined
  
  var node: js.UndefOr[Any] = js.undefined
  
  var props: Any
  
  var rowData: Any
  
  var rowIndex: Double
  
  var value: Any
}
object ColumnEditorOptions {
  
  inline def apply(column: Column, field: String, props: Any, rowData: Any, rowIndex: Double, value: Any): ColumnEditorOptions = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnEditorOptions]
  }
  
  extension [Self <: ColumnEditorOptions](x: Self) {
    
    inline def setColumn(value: Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setEditorCallback(value: /* val */ Any => Unit): Self = StObject.set(x, "editorCallback", js.Any.fromFunction1(value))
    
    inline def setEditorCallbackUndefined: Self = StObject.set(x, "editorCallback", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFrozenRow(value: Boolean): Self = StObject.set(x, "frozenRow", value.asInstanceOf[js.Any])
    
    inline def setFrozenRowUndefined: Self = StObject.set(x, "frozenRow", js.undefined)
    
    inline def setNode(value: Any): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setProps(value: Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setRowData(value: Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

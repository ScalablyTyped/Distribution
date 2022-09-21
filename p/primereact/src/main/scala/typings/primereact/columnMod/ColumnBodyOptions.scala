package typings.primereact.columnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnBodyOptions extends StObject {
  
  var column: Column
  
  var expander: js.UndefOr[ColumnBodyExpanderOptions] = js.undefined
  
  var field: String
  
  var frozenRow: js.UndefOr[Boolean] = js.undefined
  
  var props: js.UndefOr[Any] = js.undefined
  
  var rowEditor: js.UndefOr[ColumnBodyRowEditorOptions] = js.undefined
  
  var rowIndex: Double
}
object ColumnBodyOptions {
  
  inline def apply(column: Column, field: String, rowIndex: Double): ColumnBodyOptions = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnBodyOptions]
  }
  
  extension [Self <: ColumnBodyOptions](x: Self) {
    
    inline def setColumn(value: Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setExpander(value: ColumnBodyExpanderOptions): Self = StObject.set(x, "expander", value.asInstanceOf[js.Any])
    
    inline def setExpanderUndefined: Self = StObject.set(x, "expander", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFrozenRow(value: Boolean): Self = StObject.set(x, "frozenRow", value.asInstanceOf[js.Any])
    
    inline def setFrozenRowUndefined: Self = StObject.set(x, "frozenRow", js.undefined)
    
    inline def setProps(value: Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    
    inline def setRowEditor(value: ColumnBodyRowEditorOptions): Self = StObject.set(x, "rowEditor", value.asInstanceOf[js.Any])
    
    inline def setRowEditorUndefined: Self = StObject.set(x, "rowEditor", js.undefined)
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
  }
}

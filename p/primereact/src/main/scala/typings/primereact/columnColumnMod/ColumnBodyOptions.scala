package typings.primereact.columnColumnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnBodyOptions extends StObject {
  
  /**
    * Column of the options.
    */
  var column: Column
  
  /**
    * Options for the expander component.
    */
  var expander: js.UndefOr[ColumnBodyExpanderOptions] = js.undefined
  
  /**
    * Field name of the column.
    */
  var field: String
  
  /**
    * Whether the row is frozen or not.
    */
  var frozenRow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Additional properties passed to the body component.
    */
  var props: js.UndefOr[Any] = js.undefined
  
  /**
    * Options for the row editor component.
    */
  var rowEditor: js.UndefOr[ColumnBodyRowEditorOptions] = js.undefined
  
  /**
    * Index of the row.
    */
  var rowIndex: Double
}
object ColumnBodyOptions {
  
  inline def apply(column: Column, field: String, rowIndex: Double): ColumnBodyOptions = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnBodyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnBodyOptions] (val x: Self) extends AnyVal {
    
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

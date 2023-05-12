package typings.primereact.datatableDatatableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom cell className options.
  * @see {@link DataTableProps.cellClassName}
  */
trait DataTableCellClassNameOptions[TValue /* <: DataTableValueArray */] extends StObject {
  
  /**
    * Column element of the datatable.
    */
  var column: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Column */ Any
  
  /**
    * Column field.
    */
  var field: String
  
  /**
    * Whether the row is frozen or not.
    */
  var frozenRow: Boolean
  
  /**
    * The props of the datatable.
    */
  var props: DataTableProps[TValue]
  
  /**
    * Index of the row.
    */
  var rowIndex: Double
}
object DataTableCellClassNameOptions {
  
  inline def apply[TValue /* <: DataTableValueArray */](
    column: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Column */ Any,
    field: String,
    frozenRow: Boolean,
    props: DataTableProps[TValue],
    rowIndex: Double
  ): DataTableCellClassNameOptions[TValue] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], frozenRow = frozenRow.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableCellClassNameOptions[TValue]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableCellClassNameOptions[?], TValue /* <: DataTableValueArray */] (val x: Self & DataTableCellClassNameOptions[TValue]) extends AnyVal {
    
    inline def setColumn(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Column */ Any
    ): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFrozenRow(value: Boolean): Self = StObject.set(x, "frozenRow", value.asInstanceOf[js.Any])
    
    inline def setProps(value: DataTableProps[TValue]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
  }
}

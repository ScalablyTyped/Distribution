package typings.primereact.datatableDatatableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom show selection element options.
  * @see {@link DataTableProps.showSelectionElement}
  */
trait DataTableShowSelectionElementOptions[TValue /* <: DataTableValueArray */] extends StObject {
  
  /**
    * The props of the datatable.
    */
  var props: DataTableProps[TValue]
  
  /**
    * Index of the row.
    */
  var rowIndex: Double
}
object DataTableShowSelectionElementOptions {
  
  inline def apply[TValue /* <: DataTableValueArray */](props: DataTableProps[TValue], rowIndex: Double): DataTableShowSelectionElementOptions[TValue] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableShowSelectionElementOptions[TValue]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableShowSelectionElementOptions[?], TValue /* <: DataTableValueArray */] (val x: Self & DataTableShowSelectionElementOptions[TValue]) extends AnyVal {
    
    inline def setProps(value: DataTableProps[TValue]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
  }
}

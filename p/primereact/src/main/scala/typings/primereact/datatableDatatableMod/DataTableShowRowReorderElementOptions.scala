package typings.primereact.datatableDatatableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom show row reorder element options.
  * @see {@link DataTableProps.showRowReorderElement}
  */
trait DataTableShowRowReorderElementOptions[TValue /* <: DataTableValueArray */] extends StObject {
  
  /**
    * The props of the datatable.
    */
  var props: DataTableProps[TValue]
  
  /**
    * Index of the row element.
    */
  var rowIndex: Double
}
object DataTableShowRowReorderElementOptions {
  
  inline def apply[TValue /* <: DataTableValueArray */](props: DataTableProps[TValue], rowIndex: Double): DataTableShowRowReorderElementOptions[TValue] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableShowRowReorderElementOptions[TValue]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableShowRowReorderElementOptions[?], TValue /* <: DataTableValueArray */] (val x: Self & DataTableShowRowReorderElementOptions[TValue]) extends AnyVal {
    
    inline def setProps(value: DataTableProps[TValue]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
  }
}

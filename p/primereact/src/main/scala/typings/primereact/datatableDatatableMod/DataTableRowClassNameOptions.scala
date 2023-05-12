package typings.primereact.datatableDatatableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom row className options.
  * @see {@link DataTableProps.rowClassName}
  */
trait DataTableRowClassNameOptions[TValue /* <: DataTableValueArray */] extends StObject {
  
  /**
    * The props of the datatable.
    */
  var props: DataTableProps[TValue]
}
object DataTableRowClassNameOptions {
  
  inline def apply[TValue /* <: DataTableValueArray */](props: DataTableProps[TValue]): DataTableRowClassNameOptions[TValue] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableRowClassNameOptions[TValue]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableRowClassNameOptions[?], TValue /* <: DataTableValueArray */] (val x: Self & DataTableRowClassNameOptions[TValue]) extends AnyVal {
    
    inline def setProps(value: DataTableProps[TValue]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}

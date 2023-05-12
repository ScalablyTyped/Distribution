package typings.primereact.datatableDatatableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom row edit validator options.
  * @see {@link DataTableProps.rowEditValidator}
  */
trait DataTableRowEditValidatorOptions[TValue /* <: DataTableValueArray */] extends StObject {
  
  /**
    * The props of the datatable.
    */
  var props: DataTableProps[TValue]
}
object DataTableRowEditValidatorOptions {
  
  inline def apply[TValue /* <: DataTableValueArray */](props: DataTableProps[TValue]): DataTableRowEditValidatorOptions[TValue] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableRowEditValidatorOptions[TValue]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableRowEditValidatorOptions[?], TValue /* <: DataTableValueArray */] (val x: Self & DataTableRowEditValidatorOptions[TValue]) extends AnyVal {
    
    inline def setProps(value: DataTableProps[TValue]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}

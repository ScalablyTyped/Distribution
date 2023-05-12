package typings.primereact.datatableDatatableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom datatable header template options.
  */
trait DataTableHeaderTemplateOptions[TValue /* <: DataTableValueArray */] extends StObject {
  
  /**
    * The props of the datatable.
    */
  var props: DataTableProps[TValue]
}
object DataTableHeaderTemplateOptions {
  
  inline def apply[TValue /* <: DataTableValueArray */](props: DataTableProps[TValue]): DataTableHeaderTemplateOptions[TValue] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableHeaderTemplateOptions[TValue]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableHeaderTemplateOptions[?], TValue /* <: DataTableValueArray */] (val x: Self & DataTableHeaderTemplateOptions[TValue]) extends AnyVal {
    
    inline def setProps(value: DataTableProps[TValue]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}

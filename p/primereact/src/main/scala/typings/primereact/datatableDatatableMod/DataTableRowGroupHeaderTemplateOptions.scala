package typings.primereact.datatableDatatableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom datatable row group header template options.
  */
trait DataTableRowGroupHeaderTemplateOptions[TValue /* <: DataTableValueArray */] extends StObject {
  
  /**
    * Used to override the rendering of the content.
    */
  var customRendering: Boolean
  
  /**
    * index of the row group header template.
    */
  var index: Double
  
  /**
    * The props of the datatable.
    */
  var props: DataTableProps[TValue]
}
object DataTableRowGroupHeaderTemplateOptions {
  
  inline def apply[TValue /* <: DataTableValueArray */](customRendering: Boolean, index: Double, props: DataTableProps[TValue]): DataTableRowGroupHeaderTemplateOptions[TValue] = {
    val __obj = js.Dynamic.literal(customRendering = customRendering.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableRowGroupHeaderTemplateOptions[TValue]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableRowGroupHeaderTemplateOptions[?], TValue /* <: DataTableValueArray */] (val x: Self & DataTableRowGroupHeaderTemplateOptions[TValue]) extends AnyVal {
    
    inline def setCustomRendering(value: Boolean): Self = StObject.set(x, "customRendering", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setProps(value: DataTableProps[TValue]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}

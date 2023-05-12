package typings.primereact.datatableDatatableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom datatable row group footer template options.
  */
trait DataTableRowGroupFooterTemplateOptions[T /* <: DataTableValueArray */]
  extends StObject
     with DataTableRowGroupHeaderTemplateOptions[T] {
  
  /**
    * Number of columns to span for grouping.
    */
  var colSpan: Double
}
object DataTableRowGroupFooterTemplateOptions {
  
  inline def apply[T /* <: DataTableValueArray */](colSpan: Double, customRendering: Boolean, index: Double, props: DataTableProps[T]): DataTableRowGroupFooterTemplateOptions[T] = {
    val __obj = js.Dynamic.literal(colSpan = colSpan.asInstanceOf[js.Any], customRendering = customRendering.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableRowGroupFooterTemplateOptions[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableRowGroupFooterTemplateOptions[?], T /* <: DataTableValueArray */] (val x: Self & DataTableRowGroupFooterTemplateOptions[T]) extends AnyVal {
    
    inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
  }
}

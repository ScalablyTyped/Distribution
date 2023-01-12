package typings.primereact.datatableDatatableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableRowGroupFooterTemplateOptions
  extends StObject
     with DataTableRowGroupHeaderTemplateOptions {
  
  var colSpan: Double
}
object DataTableRowGroupFooterTemplateOptions {
  
  inline def apply(colSpan: Double, index: Double, props: DataTableProps): DataTableRowGroupFooterTemplateOptions = {
    val __obj = js.Dynamic.literal(colSpan = colSpan.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableRowGroupFooterTemplateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableRowGroupFooterTemplateOptions] (val x: Self) extends AnyVal {
    
    inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
  }
}

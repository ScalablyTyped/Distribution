package typings.primereact.datatableDatatableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableRowGroupHeaderTemplateOptions extends StObject {
  
  var index: Double
  
  var props: DataTableProps
}
object DataTableRowGroupHeaderTemplateOptions {
  
  inline def apply(index: Double, props: DataTableProps): DataTableRowGroupHeaderTemplateOptions = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableRowGroupHeaderTemplateOptions]
  }
  
  extension [Self <: DataTableRowGroupHeaderTemplateOptions](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setProps(value: DataTableProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}

package typings.primereact.datatableDatatableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableHeaderTemplateOptions extends StObject {
  
  var props: DataTableProps
}
object DataTableHeaderTemplateOptions {
  
  inline def apply(props: DataTableProps): DataTableHeaderTemplateOptions = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableHeaderTemplateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableHeaderTemplateOptions] (val x: Self) extends AnyVal {
    
    inline def setProps(value: DataTableProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}

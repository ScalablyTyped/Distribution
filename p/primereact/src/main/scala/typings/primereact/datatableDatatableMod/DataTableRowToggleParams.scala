package typings.primereact.datatableDatatableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableRowToggleParams extends StObject {
  
  var data: js.Array[Any] | DataTableExpandedRows
}
object DataTableRowToggleParams {
  
  inline def apply(data: js.Array[Any] | DataTableExpandedRows): DataTableRowToggleParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableRowToggleParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableRowToggleParams] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Array[Any] | DataTableExpandedRows): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
  }
}

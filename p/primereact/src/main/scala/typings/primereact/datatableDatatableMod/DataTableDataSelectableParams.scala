package typings.primereact.datatableDatatableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableDataSelectableParams extends StObject {
  
  var data: Any
  
  var index: Double
}
object DataTableDataSelectableParams {
  
  inline def apply(data: Any, index: Double): DataTableDataSelectableParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableDataSelectableParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTableDataSelectableParams] (val x: Self) extends AnyVal {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}

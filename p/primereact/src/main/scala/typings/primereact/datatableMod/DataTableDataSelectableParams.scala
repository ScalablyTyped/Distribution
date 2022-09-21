package typings.primereact.datatableMod

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
  
  extension [Self <: DataTableDataSelectableParams](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}

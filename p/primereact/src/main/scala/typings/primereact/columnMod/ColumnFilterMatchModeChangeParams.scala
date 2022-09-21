package typings.primereact.columnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnFilterMatchModeChangeParams extends StObject {
  
  var field: String
  
  var matchMode: ColumnFilterMatchModeType
}
object ColumnFilterMatchModeChangeParams {
  
  inline def apply(field: String, matchMode: ColumnFilterMatchModeType): ColumnFilterMatchModeChangeParams = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], matchMode = matchMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnFilterMatchModeChangeParams]
  }
  
  extension [Self <: ColumnFilterMatchModeChangeParams](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setMatchMode(value: ColumnFilterMatchModeType): Self = StObject.set(x, "matchMode", value.asInstanceOf[js.Any])
  }
}

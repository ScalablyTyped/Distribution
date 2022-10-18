package typings.primereact.datatableDatatableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableFilterMetaData extends StObject {
  
  var matchMode: DataTableFilterMatchModeType
  
  var value: Any
}
object DataTableFilterMetaData {
  
  inline def apply(matchMode: DataTableFilterMatchModeType, value: Any): DataTableFilterMetaData = {
    val __obj = js.Dynamic.literal(matchMode = matchMode.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableFilterMetaData]
  }
  
  extension [Self <: DataTableFilterMetaData](x: Self) {
    
    inline def setMatchMode(value: DataTableFilterMatchModeType): Self = StObject.set(x, "matchMode", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

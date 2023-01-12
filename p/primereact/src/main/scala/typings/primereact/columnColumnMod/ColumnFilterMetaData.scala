package typings.primereact.columnColumnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnFilterMetaData
  extends StObject
     with ColumnFilterModelType {
  
  var matchMode: ColumnFilterMatchModeType
  
  var value: Any
}
object ColumnFilterMetaData {
  
  inline def apply(matchMode: ColumnFilterMatchModeType, value: Any): ColumnFilterMetaData = {
    val __obj = js.Dynamic.literal(matchMode = matchMode.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnFilterMetaData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnFilterMetaData] (val x: Self) extends AnyVal {
    
    inline def setMatchMode(value: ColumnFilterMatchModeType): Self = StObject.set(x, "matchMode", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

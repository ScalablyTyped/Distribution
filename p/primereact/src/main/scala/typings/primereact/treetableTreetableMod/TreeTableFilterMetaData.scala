package typings.primereact.treetableTreetableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeTableFilterMetaData extends StObject {
  
  var matchMode: TreeTableFilterMatchModeType
  
  var value: Any
}
object TreeTableFilterMetaData {
  
  inline def apply(matchMode: TreeTableFilterMatchModeType, value: Any): TreeTableFilterMetaData = {
    val __obj = js.Dynamic.literal(matchMode = matchMode.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeTableFilterMetaData]
  }
  
  extension [Self <: TreeTableFilterMetaData](x: Self) {
    
    inline def setMatchMode(value: TreeTableFilterMatchModeType): Self = StObject.set(x, "matchMode", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

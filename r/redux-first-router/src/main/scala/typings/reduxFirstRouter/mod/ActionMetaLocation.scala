package typings.reduxFirstRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionMetaLocation extends StObject {
  
  var current: Location
  
  var history: Nullable[HistoryData]
  
  var kind: Nullable[String]
  
  var prev: Location
}
object ActionMetaLocation {
  
  inline def apply(current: Location, prev: Location): ActionMetaLocation = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionMetaLocation]
  }
  
  extension [Self <: ActionMetaLocation](x: Self) {
    
    inline def setCurrent(value: Location): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setHistory(value: Nullable[HistoryData]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryNull: Self = StObject.set(x, "history", null)
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setKind(value: Nullable[String]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPrev(value: Location): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
  }
}

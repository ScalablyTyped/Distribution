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
  
  @scala.inline
  def apply(current: Location, prev: Location): ActionMetaLocation = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionMetaLocation]
  }
  
  @scala.inline
  implicit class ActionMetaLocationMutableBuilder[Self <: ActionMetaLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrent(value: Location): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistory(value: Nullable[HistoryData]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryNull: Self = StObject.set(x, "history", null)
    
    @scala.inline
    def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    @scala.inline
    def setKind(value: Nullable[String]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindNull: Self = StObject.set(x, "kind", null)
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPrev(value: Location): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
  }
}

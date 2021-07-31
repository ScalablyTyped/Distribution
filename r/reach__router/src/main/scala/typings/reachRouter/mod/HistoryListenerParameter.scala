package typings.reachRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryListenerParameter extends StObject {
  
  var action: HistoryActionType
  
  var location: HistoryLocation
}
object HistoryListenerParameter {
  
  @scala.inline
  def apply(action: HistoryActionType, location: HistoryLocation): HistoryListenerParameter = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryListenerParameter]
  }
  
  @scala.inline
  implicit class HistoryListenerParameterMutableBuilder[Self <: HistoryListenerParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: HistoryActionType): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: HistoryLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
  }
}

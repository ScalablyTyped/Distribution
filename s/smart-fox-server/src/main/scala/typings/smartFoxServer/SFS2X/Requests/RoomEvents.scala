package typings.smartFoxServer.SFS2X.Requests

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoomEvents extends StObject {
  
  /** Sets whether or not the userCountChange event should be dispatched whenever the users (or players+spectators) count changes in the Room. */
  var allowUserCountChance: Boolean
  
  /** Sets whether the userEnterRoom event should be dispatched whenever a user joins the Room or not. */
  var allowUserEnter: Boolean
  
  /** Sets whether the userExitRoom event should be dispatched whenever a user leaves the Room or not. */
  var allowUserExit: Boolean
  
  /** Sets whether or not the userVariablesUpdate event should be dispatched whenever a user in the Room updates their User Variables */
  var allowUserVariablesUpdate: Boolean
}
object RoomEvents {
  
  inline def apply(
    allowUserCountChance: Boolean,
    allowUserEnter: Boolean,
    allowUserExit: Boolean,
    allowUserVariablesUpdate: Boolean
  ): RoomEvents = {
    val __obj = js.Dynamic.literal(allowUserCountChance = allowUserCountChance.asInstanceOf[js.Any], allowUserEnter = allowUserEnter.asInstanceOf[js.Any], allowUserExit = allowUserExit.asInstanceOf[js.Any], allowUserVariablesUpdate = allowUserVariablesUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RoomEvents] (val x: Self) extends AnyVal {
    
    inline def setAllowUserCountChance(value: Boolean): Self = StObject.set(x, "allowUserCountChance", value.asInstanceOf[js.Any])
    
    inline def setAllowUserEnter(value: Boolean): Self = StObject.set(x, "allowUserEnter", value.asInstanceOf[js.Any])
    
    inline def setAllowUserExit(value: Boolean): Self = StObject.set(x, "allowUserExit", value.asInstanceOf[js.Any])
    
    inline def setAllowUserVariablesUpdate(value: Boolean): Self = StObject.set(x, "allowUserVariablesUpdate", value.asInstanceOf[js.Any])
  }
}

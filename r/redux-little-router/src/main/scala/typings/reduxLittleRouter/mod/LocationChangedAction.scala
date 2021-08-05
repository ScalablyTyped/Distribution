package typings.reduxLittleRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationChangedAction
  extends StObject
     with RouterActions {
  
  var payload: Location
  
  var `type`: /* "ROUTER_LOCATION_CHANGED" */ String
}
object LocationChangedAction {
  
  inline def apply(payload: Location, `type`: /* "ROUTER_LOCATION_CHANGED" */ String): LocationChangedAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationChangedAction]
  }
  
  extension [Self <: LocationChangedAction](x: Self) {
    
    inline def setPayload(value: Location): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "ROUTER_LOCATION_CHANGED" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

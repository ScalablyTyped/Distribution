package typings.reduxLittleRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceAction
  extends StObject
     with RouterActions {
  
  var payload: Location
  
  var `type`: /* "ROUTER_REPLACE" */ String
}
object ReplaceAction {
  
  inline def apply(payload: Location, `type`: /* "ROUTER_REPLACE" */ String): ReplaceAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceAction]
  }
  
  extension [Self <: ReplaceAction](x: Self) {
    
    inline def setPayload(value: Location): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "ROUTER_REPLACE" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.reduxLittleRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoAction
  extends StObject
     with RouterActions {
  
  var payload: Double
  
  var `type`: /* "ROUTER_GO" */ String
}
object GoAction {
  
  inline def apply(payload: Double, `type`: /* "ROUTER_GO" */ String): GoAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoAction]
  }
  
  extension [Self <: GoAction](x: Self) {
    
    inline def setPayload(value: Double): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "ROUTER_GO" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

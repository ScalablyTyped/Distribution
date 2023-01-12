package typings.reduxLittleRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnblockAction
  extends StObject
     with RouterActions {
  
  var `type`: /* "ROUTER_UNBLOCK" */ String
}
object UnblockAction {
  
  inline def apply(`type`: /* "ROUTER_UNBLOCK" */ String): UnblockAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnblockAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnblockAction] (val x: Self) extends AnyVal {
    
    inline def setType(value: /* "ROUTER_UNBLOCK" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

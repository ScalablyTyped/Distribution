package typings.reduxLittleRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoForwardAction
  extends StObject
     with RouterActions {
  
  var `type`: /* "ROUTER_GO_FORWARD" */ String
}
object GoForwardAction {
  
  inline def apply(`type`: /* "ROUTER_GO_FORWARD" */ String): GoForwardAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoForwardAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoForwardAction] (val x: Self) extends AnyVal {
    
    inline def setType(value: /* "ROUTER_GO_FORWARD" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

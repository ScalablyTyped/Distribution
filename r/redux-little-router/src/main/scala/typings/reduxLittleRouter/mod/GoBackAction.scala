package typings.reduxLittleRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoBackAction
  extends StObject
     with RouterActions {
  
  var `type`: /* "ROUTER_GO_BACK" */ String
}
object GoBackAction {
  
  @scala.inline
  def apply(`type`: /* "ROUTER_GO_BACK" */ String): GoBackAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoBackAction]
  }
  
  @scala.inline
  implicit class GoBackActionMutableBuilder[Self <: GoBackAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: /* "ROUTER_GO_BACK" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

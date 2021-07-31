package typings.reduxLittleRouter.mod

import typings.reduxLittleRouter.anon.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceRoutesAction
  extends StObject
     with RouterActions {
  
  var payload: Options
  
  var `type`: /* "ROUTER_REPLACE_ROUTES" */ String
}
object ReplaceRoutesAction {
  
  @scala.inline
  def apply(payload: Options, `type`: /* "ROUTER_REPLACE_ROUTES" */ String): ReplaceRoutesAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceRoutesAction]
  }
  
  @scala.inline
  implicit class ReplaceRoutesActionMutableBuilder[Self <: ReplaceRoutesAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: Options): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: /* "ROUTER_REPLACE_ROUTES" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

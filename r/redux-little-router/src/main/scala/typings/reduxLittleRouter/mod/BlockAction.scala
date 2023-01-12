package typings.reduxLittleRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockAction
  extends StObject
     with RouterActions {
  
  var payload: BlockCallback
  
  var `type`: /* "ROUTER_BLOCK" */ String
}
object BlockAction {
  
  inline def apply(
    payload: (/* location */ Location, /* action */ js.UndefOr[HistoryAction]) => String,
    `type`: /* "ROUTER_BLOCK" */ String
  ): BlockAction = {
    val __obj = js.Dynamic.literal(payload = js.Any.fromFunction2(payload))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockAction] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: (/* location */ Location, /* action */ js.UndefOr[HistoryAction]) => String): Self = StObject.set(x, "payload", js.Any.fromFunction2(value))
    
    inline def setType(value: /* "ROUTER_BLOCK" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

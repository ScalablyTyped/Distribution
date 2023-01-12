package typings.reduxFirstRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReceivedAction extends StObject {
  
  var meta: js.UndefOr[js.Object] = js.undefined
  
  var navKey: js.UndefOr[Nullable[String]] = js.undefined
  
  var payload: Payload
  
  var query: js.UndefOr[Query] = js.undefined
  
  var search: js.UndefOr[String] = js.undefined
  
  var `type`: String
}
object ReceivedAction {
  
  inline def apply(payload: Payload, `type`: String): ReceivedAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceivedAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReceivedAction] (val x: Self) extends AnyVal {
    
    inline def setMeta(value: js.Object): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setNavKey(value: Nullable[String]): Self = StObject.set(x, "navKey", value.asInstanceOf[js.Any])
    
    inline def setNavKeyNull: Self = StObject.set(x, "navKey", null)
    
    inline def setNavKeyUndefined: Self = StObject.set(x, "navKey", js.undefined)
    
    inline def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

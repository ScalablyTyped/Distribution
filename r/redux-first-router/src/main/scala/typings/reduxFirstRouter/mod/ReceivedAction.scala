package typings.reduxFirstRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReceivedAction extends StObject {
  
  var meta: js.UndefOr[js.Object] = js.native
  
  var navKey: js.UndefOr[Nullable[String]] = js.native
  
  var payload: Payload = js.native
  
  var query: js.UndefOr[Query] = js.native
  
  var search: js.UndefOr[String] = js.native
  
  var `type`: String = js.native
}
object ReceivedAction {
  
  @scala.inline
  def apply(payload: Payload, `type`: String): ReceivedAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceivedAction]
  }
  
  @scala.inline
  implicit class ReceivedActionMutableBuilder[Self <: ReceivedAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeta(value: js.Object): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    @scala.inline
    def setNavKey(value: Nullable[String]): Self = StObject.set(x, "navKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavKeyNull: Self = StObject.set(x, "navKey", null)
    
    @scala.inline
    def setNavKeyUndefined: Self = StObject.set(x, "navKey", js.undefined)
    
    @scala.inline
    def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

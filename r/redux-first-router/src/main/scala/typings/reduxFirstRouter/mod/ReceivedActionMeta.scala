package typings.reduxFirstRouter.mod

import typings.reduxFirstRouter.anon.NotFoundPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReceivedActionMeta extends StObject {
  
  var meta: NotFoundPath
  
  var navKey: js.UndefOr[Nullable[String]] = js.undefined
  
  var payload: Payload
  
  var query: js.UndefOr[Query] = js.undefined
  
  var `type`: String
}
object ReceivedActionMeta {
  
  @scala.inline
  def apply(meta: NotFoundPath, payload: Payload, `type`: String): ReceivedActionMeta = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceivedActionMeta]
  }
  
  @scala.inline
  implicit class ReceivedActionMetaMutableBuilder[Self <: ReceivedActionMeta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeta(value: NotFoundPath): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
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
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

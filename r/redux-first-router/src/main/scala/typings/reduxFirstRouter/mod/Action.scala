package typings.reduxFirstRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  var meta: js.UndefOr[Meta] = js.undefined
  
  var navKey: js.UndefOr[Nullable[String]] = js.undefined
  
  var payload: js.UndefOr[Payload] = js.undefined
  
  var query: js.UndefOr[Query] = js.undefined
  
  var `type`: String
}
object Action {
  
  @scala.inline
  def apply(`type`: String): Action = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
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
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

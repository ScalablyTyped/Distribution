package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait v2ObjectData[Custom /* <: ObjectCustom */] extends StObject {
  
  var custom: js.UndefOr[Custom | Null] = js.undefined
  
  var eTag: String
  
  var id: String
  
  var updated: String
}
object v2ObjectData {
  
  @scala.inline
  def apply[Custom /* <: ObjectCustom */](eTag: String, id: String, updated: String): v2ObjectData[Custom] = {
    val __obj = js.Dynamic.literal(eTag = eTag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[v2ObjectData[Custom]]
  }
  
  @scala.inline
  implicit class v2ObjectDataMutableBuilder[Self <: v2ObjectData[?], Custom /* <: ObjectCustom */] (val x: Self & v2ObjectData[Custom]) extends AnyVal {
    
    @scala.inline
    def setCustom(value: Custom): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomNull: Self = StObject.set(x, "custom", null)
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}

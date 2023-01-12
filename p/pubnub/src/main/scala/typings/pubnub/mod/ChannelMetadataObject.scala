package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent pubnub.pubnub.v2ObjectData<Custom> */
/* Inlined parent pubnub.pubnub.Nullable<pubnub.pubnub.ChannelMetadataFields> */
trait ChannelMetadataObject[Custom /* <: ObjectCustom */] extends StObject {
  
  var custom: js.UndefOr[Custom | Null] = js.undefined
  
  var description: js.UndefOr[String | Null] = js.undefined
  
  var eTag: String
  
  var id: String
  
  var name: js.UndefOr[String | Null] = js.undefined
  
  var updated: String
}
object ChannelMetadataObject {
  
  inline def apply[Custom /* <: ObjectCustom */](eTag: String, id: String, updated: String): ChannelMetadataObject[Custom] = {
    val __obj = js.Dynamic.literal(eTag = eTag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelMetadataObject[Custom]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelMetadataObject[?], Custom /* <: ObjectCustom */] (val x: Self & ChannelMetadataObject[Custom]) extends AnyVal {
    
    inline def setCustom(value: Custom): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomNull: Self = StObject.set(x, "custom", null)
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setETag(value: String): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}

package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent pubnub.pubnub.v2ObjectData<Custom> */
/* Inlined parent pubnub.pubnub.Nullable<pubnub.pubnub.UUIDMetadataFields> */
trait UUIDMetadataObject[Custom /* <: ObjectCustom */] extends StObject {
  
  var custom: js.UndefOr[Custom | Null] = js.undefined
  
  var eTag: String
  
  var email: js.UndefOr[String | Null] = js.undefined
  
  var externalId: js.UndefOr[String | Null] = js.undefined
  
  var id: String
  
  var name: js.UndefOr[String | Null] = js.undefined
  
  var profileUrl: js.UndefOr[String | Null] = js.undefined
  
  var updated: String
}
object UUIDMetadataObject {
  
  inline def apply[Custom /* <: ObjectCustom */](eTag: String, id: String, updated: String): UUIDMetadataObject[Custom] = {
    val __obj = js.Dynamic.literal(eTag = eTag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[UUIDMetadataObject[Custom]]
  }
  
  extension [Self <: UUIDMetadataObject[?], Custom /* <: ObjectCustom */](x: Self & UUIDMetadataObject[Custom]) {
    
    inline def setCustom(value: Custom): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomNull: Self = StObject.set(x, "custom", null)
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setETag(value: String): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdNull: Self = StObject.set(x, "externalId", null)
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProfileUrl(value: String): Self = StObject.set(x, "profileUrl", value.asInstanceOf[js.Any])
    
    inline def setProfileUrlNull: Self = StObject.set(x, "profileUrl", null)
    
    inline def setProfileUrlUndefined: Self = StObject.set(x, "profileUrl", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}

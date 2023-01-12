package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent pubnub.pubnub.v2ObjectParam<Custom> */
/* Inlined parent std.Partial<pubnub.pubnub.UUIDMetadataFields> */
trait UUIDMetadata[Custom /* <: ObjectCustom */] extends StObject {
  
  var custom: js.UndefOr[Custom] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var externalId: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var profileUrl: js.UndefOr[String] = js.undefined
}
object UUIDMetadata {
  
  inline def apply[Custom /* <: ObjectCustom */](): UUIDMetadata[Custom] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UUIDMetadata[Custom]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UUIDMetadata[?], Custom /* <: ObjectCustom */] (val x: Self & UUIDMetadata[Custom]) extends AnyVal {
    
    inline def setCustom(value: Custom): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProfileUrl(value: String): Self = StObject.set(x, "profileUrl", value.asInstanceOf[js.Any])
    
    inline def setProfileUrlUndefined: Self = StObject.set(x, "profileUrl", js.undefined)
  }
}

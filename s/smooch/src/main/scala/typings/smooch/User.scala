package typings.smooch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  var avatarUrl: String
  
  var email: String
  
  var externalId: String
  
  var givenName: String
  
  var hasPaymendInfo: Boolean
  
  var id: String
  
  var metadata: Metadata
  
  var properties: Any
  
  var signedUpAt: String
  
  var surname: String
}
object User {
  
  inline def apply(
    avatarUrl: String,
    email: String,
    externalId: String,
    givenName: String,
    hasPaymendInfo: Boolean,
    id: String,
    metadata: Metadata,
    properties: Any,
    signedUpAt: String,
    surname: String
  ): User = {
    val __obj = js.Dynamic.literal(avatarUrl = avatarUrl.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], externalId = externalId.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any], hasPaymendInfo = hasPaymendInfo.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], signedUpAt = signedUpAt.asInstanceOf[js.Any], surname = surname.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  extension [Self <: User](x: Self) {
    
    inline def setAvatarUrl(value: String): Self = StObject.set(x, "avatarUrl", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
    
    inline def setHasPaymendInfo(value: Boolean): Self = StObject.set(x, "hasPaymendInfo", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setSignedUpAt(value: String): Self = StObject.set(x, "signedUpAt", value.asInstanceOf[js.Any])
    
    inline def setSurname(value: String): Self = StObject.set(x, "surname", value.asInstanceOf[js.Any])
  }
}

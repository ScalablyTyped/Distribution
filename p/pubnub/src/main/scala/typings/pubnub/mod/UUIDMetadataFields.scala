package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// UUID metadata
trait UUIDMetadataFields extends StObject {
  
  var email: String
  
  var externalId: String
  
  var name: String
  
  var profileUrl: String
}
object UUIDMetadataFields {
  
  @scala.inline
  def apply(email: String, externalId: String, name: String, profileUrl: String): UUIDMetadataFields = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], externalId = externalId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profileUrl = profileUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[UUIDMetadataFields]
  }
  
  @scala.inline
  implicit class UUIDMetadataFieldsMutableBuilder[Self <: UUIDMetadataFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileUrl(value: String): Self = StObject.set(x, "profileUrl", value.asInstanceOf[js.Any])
  }
}

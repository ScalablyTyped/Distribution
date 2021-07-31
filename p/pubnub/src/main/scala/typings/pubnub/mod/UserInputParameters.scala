package typings.pubnub.mod

import typings.pubnub.anon.CustomFields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserInputParameters extends StObject {
  
  var custom: js.UndefOr[js.Object | Null] = js.undefined
  
  var email: js.UndefOr[String | Null] = js.undefined
  
  var externalId: js.UndefOr[String | Null] = js.undefined
  
  var id: String
  
  var include: js.UndefOr[CustomFields] = js.undefined
  
  var name: String
  
  var profileUrl: js.UndefOr[String | Null] = js.undefined
}
object UserInputParameters {
  
  @scala.inline
  def apply(id: String, name: String): UserInputParameters = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserInputParameters]
  }
  
  @scala.inline
  implicit class UserInputParametersMutableBuilder[Self <: UserInputParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustom(value: js.Object): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomNull: Self = StObject.set(x, "custom", null)
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailNull: Self = StObject.set(x, "email", null)
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalIdNull: Self = StObject.set(x, "externalId", null)
    
    @scala.inline
    def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude(value: CustomFields): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileUrl(value: String): Self = StObject.set(x, "profileUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileUrlNull: Self = StObject.set(x, "profileUrl", null)
    
    @scala.inline
    def setProfileUrlUndefined: Self = StObject.set(x, "profileUrl", js.undefined)
  }
}

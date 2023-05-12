package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExchangeNativeSocialParams extends StObject {
  
  var audience: js.UndefOr[String] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
  
  var subjectToken: String
  
  var subjectTokenType: String
  
  var userProfile: js.UndefOr[Any] = js.undefined
}
object ExchangeNativeSocialParams {
  
  inline def apply(subjectToken: String, subjectTokenType: String): ExchangeNativeSocialParams = {
    val __obj = js.Dynamic.literal(subjectToken = subjectToken.asInstanceOf[js.Any], subjectTokenType = subjectTokenType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExchangeNativeSocialParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExchangeNativeSocialParams] (val x: Self) extends AnyVal {
    
    inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSubjectToken(value: String): Self = StObject.set(x, "subjectToken", value.asInstanceOf[js.Any])
    
    inline def setSubjectTokenType(value: String): Self = StObject.set(x, "subjectTokenType", value.asInstanceOf[js.Any])
    
    inline def setUserProfile(value: Any): Self = StObject.set(x, "userProfile", value.asInstanceOf[js.Any])
    
    inline def setUserProfileUndefined: Self = StObject.set(x, "userProfile", js.undefined)
  }
}

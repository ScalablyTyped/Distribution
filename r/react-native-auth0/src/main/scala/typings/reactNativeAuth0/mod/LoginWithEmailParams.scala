package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginWithEmailParams extends StObject {
  
  var audience: js.UndefOr[String] = js.undefined
  
  var code: String
  
  var email: String
  
  var scope: js.UndefOr[String] = js.undefined
}
object LoginWithEmailParams {
  
  @scala.inline
  def apply(code: String, email: String): LoginWithEmailParams = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginWithEmailParams]
  }
  
  @scala.inline
  implicit class LoginWithEmailParamsMutableBuilder[Self <: LoginWithEmailParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}

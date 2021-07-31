package typings.restify.mod

import typings.restify.anon.Password
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestAuthorization extends StObject {
  
  var basic: js.UndefOr[Password] = js.undefined
  
  var credentials: String
  
  var scheme: String
}
object RequestAuthorization {
  
  @scala.inline
  def apply(credentials: String, scheme: String): RequestAuthorization = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestAuthorization]
  }
  
  @scala.inline
  implicit class RequestAuthorizationMutableBuilder[Self <: RequestAuthorization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasic(value: Password): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicUndefined: Self = StObject.set(x, "basic", js.undefined)
    
    @scala.inline
    def setCredentials(value: String): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
  }
}

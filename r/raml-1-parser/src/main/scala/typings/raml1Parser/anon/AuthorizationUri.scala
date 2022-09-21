package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizationUri extends StObject {
  
  var authorizationUri: Domain
  
  var requestTokenUri: Domain
  
  var tokenCredentialsUri: Domain
}
object AuthorizationUri {
  
  inline def apply(authorizationUri: Domain, requestTokenUri: Domain, tokenCredentialsUri: Domain): AuthorizationUri = {
    val __obj = js.Dynamic.literal(authorizationUri = authorizationUri.asInstanceOf[js.Any], requestTokenUri = requestTokenUri.asInstanceOf[js.Any], tokenCredentialsUri = tokenCredentialsUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationUri]
  }
  
  extension [Self <: AuthorizationUri](x: Self) {
    
    inline def setAuthorizationUri(value: Domain): Self = StObject.set(x, "authorizationUri", value.asInstanceOf[js.Any])
    
    inline def setRequestTokenUri(value: Domain): Self = StObject.set(x, "requestTokenUri", value.asInstanceOf[js.Any])
    
    inline def setTokenCredentialsUri(value: Domain): Self = StObject.set(x, "tokenCredentialsUri", value.asInstanceOf[js.Any])
  }
}

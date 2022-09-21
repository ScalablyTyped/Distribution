package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessTokenUri extends StObject {
  
  var accessTokenUri: Domain
  
  var authorizationGrants: Domain
  
  var authorizationUri: Domain
  
  var scopes: Domain
}
object AccessTokenUri {
  
  inline def apply(accessTokenUri: Domain, authorizationGrants: Domain, authorizationUri: Domain, scopes: Domain): AccessTokenUri = {
    val __obj = js.Dynamic.literal(accessTokenUri = accessTokenUri.asInstanceOf[js.Any], authorizationGrants = authorizationGrants.asInstanceOf[js.Any], authorizationUri = authorizationUri.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessTokenUri]
  }
  
  extension [Self <: AccessTokenUri](x: Self) {
    
    inline def setAccessTokenUri(value: Domain): Self = StObject.set(x, "accessTokenUri", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationGrants(value: Domain): Self = StObject.set(x, "authorizationGrants", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationUri(value: Domain): Self = StObject.set(x, "authorizationUri", value.asInstanceOf[js.Any])
    
    inline def setScopes(value: Domain): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
  }
}

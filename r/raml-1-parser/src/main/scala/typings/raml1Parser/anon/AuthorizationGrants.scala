package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizationGrants extends StObject {
  
  var accessTokenUri: NameString
  
  var annotations: NameString
  
  var authorizationGrants: NameString
  
  var authorizationUri: NameString
  
  var scopes: NameString
}
object AuthorizationGrants {
  
  inline def apply(
    accessTokenUri: NameString,
    annotations: NameString,
    authorizationGrants: NameString,
    authorizationUri: NameString,
    scopes: NameString
  ): AuthorizationGrants = {
    val __obj = js.Dynamic.literal(accessTokenUri = accessTokenUri.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], authorizationGrants = authorizationGrants.asInstanceOf[js.Any], authorizationUri = authorizationUri.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationGrants]
  }
  
  extension [Self <: AuthorizationGrants](x: Self) {
    
    inline def setAccessTokenUri(value: NameString): Self = StObject.set(x, "accessTokenUri", value.asInstanceOf[js.Any])
    
    inline def setAnnotations(value: NameString): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationGrants(value: NameString): Self = StObject.set(x, "authorizationGrants", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationUri(value: NameString): Self = StObject.set(x, "authorizationUri", value.asInstanceOf[js.Any])
    
    inline def setScopes(value: NameString): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
  }
}

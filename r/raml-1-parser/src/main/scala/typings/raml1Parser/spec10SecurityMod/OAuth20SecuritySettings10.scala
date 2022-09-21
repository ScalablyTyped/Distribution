package typings.raml1Parser.spec10SecurityMod

import typings.raml1Parser.spec10CommonMod.Annotable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuth20SecuritySettings10
  extends StObject
     with Annotable {
  
  /**
    * The URI of the Token Endpoint as defined in RFC6749 Section 3.2.
    * Not required forby implicit grant type.
    */
  var accessTokenUri: js.UndefOr[String] = js.undefined
  
  /**
    * A list of the Authorization grants supported by the API as defined in
    * RFC6749 Sections 4.1, 4.2, 4.3 and 4.4, can be any of: authorization_code,
    * password, client_credentials, implicit, or any absolute url.
    */
  var authorizationGrants: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The URI of the Authorization Endpoint as defined in RFC6749 Section 3.1.
    * Required forby authorization_code and implicit grant types.
    */
  var authorizationUri: js.UndefOr[String] = js.undefined
  
  /**
    * A list of scopes supported by the security scheme as defined in RFC6749 Section 3.3
    */
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
}
object OAuth20SecuritySettings10 {
  
  inline def apply(): OAuth20SecuritySettings10 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuth20SecuritySettings10]
  }
  
  extension [Self <: OAuth20SecuritySettings10](x: Self) {
    
    inline def setAccessTokenUri(value: String): Self = StObject.set(x, "accessTokenUri", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUriUndefined: Self = StObject.set(x, "accessTokenUri", js.undefined)
    
    inline def setAuthorizationGrants(value: js.Array[String]): Self = StObject.set(x, "authorizationGrants", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationGrantsUndefined: Self = StObject.set(x, "authorizationGrants", js.undefined)
    
    inline def setAuthorizationGrantsVarargs(value: String*): Self = StObject.set(x, "authorizationGrants", js.Array(value*))
    
    inline def setAuthorizationUri(value: String): Self = StObject.set(x, "authorizationUri", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationUriUndefined: Self = StObject.set(x, "authorizationUri", js.undefined)
    
    inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
    
    inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
  }
}

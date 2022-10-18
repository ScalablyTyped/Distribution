package typings.raml1Parser.distTypingsSpec1Dot0SecurityMod

import org.scalablytyped.runtime.StringDictionary
import typings.raml1Parser.distTypingsSpec1Dot0CommonMod.Annotable
import typings.raml1Parser.distTypingsSpec1Dot0CommonMod.AnnotationInstance
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
  var accessTokenUri: String
  
  /**
    * A list of the Authorization grants supported by the API as defined in
    * RFC6749 Sections 4.1, 4.2, 4.3 and 4.4, can be any of: authorization_code,
    * password, client_credentials, implicit, or any absolute url.
    */
  var authorizationGrants: js.Array[String]
  
  /**
    * The URI of the Authorization Endpoint as defined in RFC6749 Section 3.1.
    * Required forby authorization_code and implicit grant types.
    */
  var authorizationUri: String
  
  /**
    * A list of scopes supported by the security scheme as defined in RFC6749 Section 3.3
    */
  var scopes: js.Array[String]
}
object OAuth20SecuritySettings10 {
  
  inline def apply(
    __METADATA__ : Any,
    accessTokenUri: String,
    annotations: StringDictionary[AnnotationInstance | js.Array[AnnotationInstance]],
    authorizationGrants: js.Array[String],
    authorizationUri: String,
    scalarsAnnotations: StringDictionary[js.Array[AnnotationInstance | js.Array[AnnotationInstance]]],
    scopes: js.Array[String]
  ): OAuth20SecuritySettings10 = {
    val __obj = js.Dynamic.literal(__METADATA__ = __METADATA__.asInstanceOf[js.Any], accessTokenUri = accessTokenUri.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], authorizationGrants = authorizationGrants.asInstanceOf[js.Any], authorizationUri = authorizationUri.asInstanceOf[js.Any], scalarsAnnotations = scalarsAnnotations.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth20SecuritySettings10]
  }
  
  extension [Self <: OAuth20SecuritySettings10](x: Self) {
    
    inline def setAccessTokenUri(value: String): Self = StObject.set(x, "accessTokenUri", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationGrants(value: js.Array[String]): Self = StObject.set(x, "authorizationGrants", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationGrantsVarargs(value: String*): Self = StObject.set(x, "authorizationGrants", js.Array(value*))
    
    inline def setAuthorizationUri(value: String): Self = StObject.set(x, "authorizationUri", value.asInstanceOf[js.Any])
    
    inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
  }
}

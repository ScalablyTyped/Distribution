package typings.raml1Parser.distParserArtifactsRaml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuth2SecuritySchemeSettingsScalarsAnnotations extends StObject {
  
  /**
    * OAuth2SecuritySchemeSettings.accessTokenUri annotations
    **/
  def accessTokenUri(): js.Array[AnnotationRef]
  
  /**
    * OAuth2SecuritySchemeSettings.authorizationGrants annotations
    **/
  def authorizationGrants(): js.Array[js.Array[AnnotationRef]]
  
  /**
    * OAuth2SecuritySchemeSettings.authorizationUri annotations
    **/
  def authorizationUri(): js.Array[AnnotationRef]
  
  /**
    * OAuth2SecuritySchemeSettings.scopes annotations
    **/
  def scopes(): js.Array[js.Array[AnnotationRef]]
}
object OAuth2SecuritySchemeSettingsScalarsAnnotations {
  
  inline def apply(
    accessTokenUri: () => js.Array[AnnotationRef],
    authorizationGrants: () => js.Array[js.Array[AnnotationRef]],
    authorizationUri: () => js.Array[AnnotationRef],
    scopes: () => js.Array[js.Array[AnnotationRef]]
  ): OAuth2SecuritySchemeSettingsScalarsAnnotations = {
    val __obj = js.Dynamic.literal(accessTokenUri = js.Any.fromFunction0(accessTokenUri), authorizationGrants = js.Any.fromFunction0(authorizationGrants), authorizationUri = js.Any.fromFunction0(authorizationUri), scopes = js.Any.fromFunction0(scopes))
    __obj.asInstanceOf[OAuth2SecuritySchemeSettingsScalarsAnnotations]
  }
  
  extension [Self <: OAuth2SecuritySchemeSettingsScalarsAnnotations](x: Self) {
    
    inline def setAccessTokenUri(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "accessTokenUri", js.Any.fromFunction0(value))
    
    inline def setAuthorizationGrants(value: () => js.Array[js.Array[AnnotationRef]]): Self = StObject.set(x, "authorizationGrants", js.Any.fromFunction0(value))
    
    inline def setAuthorizationUri(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "authorizationUri", js.Any.fromFunction0(value))
    
    inline def setScopes(value: () => js.Array[js.Array[AnnotationRef]]): Self = StObject.set(x, "scopes", js.Any.fromFunction0(value))
  }
}

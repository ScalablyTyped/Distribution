package typings.raml1Parser.distParserArtifactsRaml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuth1SecuritySchemeSettingsScalarsAnnotations extends StObject {
  
  /**
    * OAuth1SecuritySchemeSettings.authorizationUri annotations
    **/
  def authorizationUri(): js.Array[AnnotationRef]
  
  /**
    * OAuth1SecuritySchemeSettings.requestTokenUri annotations
    **/
  def requestTokenUri(): js.Array[AnnotationRef]
  
  /**
    * OAuth1SecuritySchemeSettings.signatures annotations
    **/
  def signatures(): js.Array[js.Array[AnnotationRef]]
  
  /**
    * OAuth1SecuritySchemeSettings.tokenCredentialsUri annotations
    **/
  def tokenCredentialsUri(): js.Array[AnnotationRef]
}
object OAuth1SecuritySchemeSettingsScalarsAnnotations {
  
  inline def apply(
    authorizationUri: () => js.Array[AnnotationRef],
    requestTokenUri: () => js.Array[AnnotationRef],
    signatures: () => js.Array[js.Array[AnnotationRef]],
    tokenCredentialsUri: () => js.Array[AnnotationRef]
  ): OAuth1SecuritySchemeSettingsScalarsAnnotations = {
    val __obj = js.Dynamic.literal(authorizationUri = js.Any.fromFunction0(authorizationUri), requestTokenUri = js.Any.fromFunction0(requestTokenUri), signatures = js.Any.fromFunction0(signatures), tokenCredentialsUri = js.Any.fromFunction0(tokenCredentialsUri))
    __obj.asInstanceOf[OAuth1SecuritySchemeSettingsScalarsAnnotations]
  }
  
  extension [Self <: OAuth1SecuritySchemeSettingsScalarsAnnotations](x: Self) {
    
    inline def setAuthorizationUri(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "authorizationUri", js.Any.fromFunction0(value))
    
    inline def setRequestTokenUri(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "requestTokenUri", js.Any.fromFunction0(value))
    
    inline def setSignatures(value: () => js.Array[js.Array[AnnotationRef]]): Self = StObject.set(x, "signatures", js.Any.fromFunction0(value))
    
    inline def setTokenCredentialsUri(value: () => js.Array[AnnotationRef]): Self = StObject.set(x, "tokenCredentialsUri", js.Any.fromFunction0(value))
  }
}

package typings.raml1Parser.distParserArtifactsRaml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuth2SecuritySchemeSettings
  extends StObject
     with Annotable {
  
  /**
    * The URI of the Token Endpoint as defined in RFC6749 Section 3.2. Not required forby implicit grant type.
    **/
  def accessTokenUri(): FixedUriString = js.native
  
  /**
    * A list of the Authorization grants supported by the API as defined in RFC6749 Sections 4.1, 4.2, 4.3 and 4.4, can be any of: authorization_code, password, client_credentials, implicit, or any absolute url.
    **/
  def authorizationGrants(): js.Array[String] = js.native
  
  /**
    * The URI of the Authorization Endpoint as defined in RFC6749 Section 3.1. Required forby authorization_code and implicit grant types.
    **/
  def authorizationUri(): FixedUriString = js.native
  
  /**
    * Scalar properties annotations accessor
    **/
  def scalarsAnnotations(): OAuth2SecuritySchemeSettingsScalarsAnnotations = js.native
  
  /**
    * A list of scopes supported by the security scheme as defined in RFC6749 Section 3.3
    **/
  def scopes(): js.Array[String] = js.native
}

package typings.raml1Parser.raml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuth1SecuritySchemeSettings
  extends StObject
     with Annotable {
  
  /**
    * The URI of the Resource Owner Authorization endpoint as defined in RFC5849 Section 2.2
    **/
  def authorizationUri(): FixedUriString = js.native
  
  /**
    * The URI of the Temporary Credential Request endpoint as defined in RFC5849 Section 2.1
    **/
  def requestTokenUri(): FixedUriString = js.native
  
  /**
    * Scalar properties annotations accessor
    **/
  def scalarsAnnotations(): OAuth1SecuritySchemeSettingsScalarsAnnotations = js.native
  
  /**
    * List of the signature methods used by the server. Available methods: HMAC-SHA1, RSA-SHA1, PLAINTEXT
    **/
  def signatures(): js.Array[String] = js.native
  
  /**
    * The URI of the Token Request endpoint as defined in RFC5849 Section 2.3
    **/
  def tokenCredentialsUri(): FixedUriString = js.native
}

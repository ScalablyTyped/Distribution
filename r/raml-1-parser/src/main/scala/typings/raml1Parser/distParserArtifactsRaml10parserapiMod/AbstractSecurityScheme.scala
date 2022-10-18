package typings.raml1Parser.distParserArtifactsRaml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractSecurityScheme
  extends StObject
     with Annotable {
  
  /**
    * A description of the request components related to Security that are determined by the scheme: the headers, query parameters or responses. As a best practice, even for standard security schemes, API designers SHOULD describe these properties of security schemes. Including the security scheme description completes an API documentation.
    **/
  def describedBy(): SecuritySchemePart = js.native
  
  /**
    * The description MAY be used to describe a securityScheme.
    **/
  def description(): MarkdownString = js.native
  
  /**
    * The displayName attribute specifies the security scheme display name. It is a friendly name used only for  display or documentation purposes. If displayName is not specified, it defaults to the element's key (the name of the property itself).
    **/
  def displayName(): String = js.native
  
  /**
    * Name of the security scheme
    **/
  def name(): String = js.native
  
  /**
    * Scalar properties annotations accessor
    **/
  def scalarsAnnotations(): AbstractSecuritySchemeScalarsAnnotations = js.native
  
  /**
    * The settings attribute MAY be used to provide security scheme-specific information. The required attributes vary depending on the type of security scheme is being declared. It describes the minimum set of properties which any processing application MUST provide and validate if it chooses to implement the security scheme. Processing applications MAY choose to recognize other properties for things such as token lifetime, preferred cryptographic algorithms, and more.
    **/
  def settings(): SecuritySchemeSettings = js.native
  
  /**
    * The securitySchemes property MUST be used to specify an API's security mechanisms, including the required settings and the authentication methods that the API supports. one authentication method is allowed if the API supports them.
    **/
  def `type`(): String = js.native
}

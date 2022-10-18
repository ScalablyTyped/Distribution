package typings.raml1Parser.distParserArtifactsRaml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Api
  extends StObject
     with LibraryBase {
  
  /**
    * Retrieve an ordered list of all base uri parameters regardless of whether they are described in `baseUriParameters` or not
    * Consider a fragment of RAML specification:
    * ```yaml
    * version: v1
    * baseUri: https://{organization}.example.com/{version}/{service}
    * baseUriParameters:
    * service:
    * ```
    * Here `version` and `organization` are base uri parameters which are not described in the `baseUriParameters` node,
    * but they are among `Api.allBaseUriParameters()`.
    * @deprecated
    **/
  def allBaseUriParameters(): js.Array[TypeDeclaration] = js.native
  
  /**
    * Protocols used by the API. Returns the `protocols` property value if it is specified.
    * Otherwise, returns protocol, specified in the base URI.
    * @deprecated
    **/
  def allProtocols(): js.Array[String] = js.native
  
  /**
    * Retrieve all resources of the Api
    **/
  def allResources(): js.Array[Resource] = js.native
  
  /**
    * A URI that's to be used as the base of all the resources' URIs. Often used as the base of the URL of each resource, containing the location of the API. Can be a template URI.
    **/
  def baseUri(): FullUriTemplateString = js.native
  
  /**
    * Retrieve an ordered list of all base uri parameters regardless of whether they are described in `baseUriParameters` or not
    * Consider a fragment of RAML specification:
    * ```yaml
    * version: v1
    * baseUri: https://{organization}.example.com/{version}/{service}
    * baseUriParameters:
    * service:
    * ```
    * Here `version` and `organization` are base uri parameters which are not described in the `baseUriParameters` node,
    * but they are among `Api.baseUriParameters()`.
    **/
  def baseUriParameters(): js.Array[TypeDeclaration] = js.native
  
  /**
    * Get child resource by its relative path
    **/
  def childResource(relPath: String): Resource = js.native
  
  /**
    * A longer, human-friendly description of the API
    **/
  def description(): MarkdownString = js.native
  
  /**
    * Additional overall documentation for the API
    **/
  def documentation(): js.Array[DocumentationItem] = js.native
  
  /**
    * Equivalent API with traits and resource types expanded
    * @expLib whether to apply library expansion or not
    **/
  def expand(): Api = js.native
  def expand(expLib: Boolean): Api = js.native
  
  /**
    * The default media type to use for request and response bodies (payloads), e.g. "application/json"
    **/
  def mediaType(): js.Array[MimeType] = js.native
  
  /**
    * The protocols supported by the API
    **/
  def protocols(): js.Array[String] = js.native
  
  /**
    * The resources of the API, identified as relative URIs that begin with a slash (/). Every property whose key begins with a slash (/), and is either at the root of the API definition or is the child property of a resource property, is a resource property, e.g.: /users, /{groupId}, etc
    **/
  def resources(): js.Array[Resource] = js.native
  
  /**
    * Scalar properties annotations accessor
    **/
  def scalarsAnnotations(): ApiScalarsAnnotations = js.native
  
  /**
    * The security schemes that apply to every resource and method in the API
    **/
  def securedBy(): js.Array[SecuritySchemeRef] = js.native
  
  /**
    * Short plain-text label for the API
    **/
  def title(): String = js.native
  
  /**
    * The version of the API, e.g. 'v1'
    **/
  def version(): String = js.native
}

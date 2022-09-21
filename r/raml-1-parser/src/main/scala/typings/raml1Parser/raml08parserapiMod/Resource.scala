package typings.raml1Parser.raml08parserapiMod

import typings.raml1Parser.highLevelASTMod.BasicNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resource
  extends StObject
     with BasicNode {
  
  /**
    * baseUri of owning Api concatenated with completeRelativeUri
    **/
  def absoluteUri(): String = js.native
  
  /**
    * Retrieve an ordered list of all absolute uri parameters. Returns a union of `Api.allBaseUriParameters()`
    * for `Api` owning the `Resource` and `Resource.allUriParameters()`.
    **/
  def absoluteUriParameters(): js.Array[Parameter] = js.native
  
  /**
    * Returns security schemes, resource or method is secured with. If no security schemes are set at resource or method level,
    * returns schemes defined with `securedBy` at API level.
    * @deprecated
    **/
  def allSecuredBy(): js.Array[SecuritySchemeRef] = js.native
  
  /**
    * Retrieve an ordered list of all uri parameters including those which are not described in the `uriParameters` node.
    * Consider a fragment of RAML specification:
    * ```yaml
    * /resource/{objectId}/{propertyId}:
    * uriParameters:
    * objectId:
    * ```
    * Here `propertyId` uri parameter is not described in the `uriParameters` node,
    * Thus, it is not among Resource.uriParameters(), but it is among Resource.allUriParameters().
    * @deprecated
    **/
  def allUriParameters(): js.Array[Parameter] = js.native
  
  /**
    * A resource or a method can override a base URI template's values. This is useful to restrict or change the default or parameter selection in the base URI. The baseUriParameters property MAY be used to override any or all parameters defined at the root level baseUriParameters property, as well as base URI parameters not specified at the root level.
    **/
  def baseUriParameters(): js.Array[Parameter] = js.native
  
  /**
    * Get child method by its name
    **/
  def childMethod(method: String): js.Array[Method] = js.native
  
  /**
    * Get child resource by its relative path
    **/
  def childResource(relPath: String): Resource = js.native
  
  /**
    * Path relative to API root
    **/
  def completeRelativeUri(): String = js.native
  
  /**
    * The description attribute describes the intended use or meaning of the $self. This value MAY be formatted using Markdown.
    **/
  def description(): MarkdownString = js.native
  
  /**
    * An alternate, human-friendly name for the resource
    **/
  def displayName(): String = js.native
  
  /**
    * Instantiation of applyed traits
    **/
  def is(): js.Array[TraitRef] = js.native
  
  /**
    * Methods that can be called on this resource
    **/
  def methods(): js.Array[Method] = js.native
  
  /**
    * Api owning the resource as a sibling
    **/
  def ownerApi(): Api = js.native
  
  /**
    * Parent resource for non top level resources
    **/
  def parentResource(): Resource = js.native
  
  /**
    * Relative URL of this resource from the parent resource
    **/
  def relativeUri(): RelativeUriString = js.native
  
  /**
    * Children resources
    **/
  def resources(): js.Array[Resource] = js.native
  
  /**
    * securityScheme may also be applied to a resource by using the securedBy key, which is equivalent to applying the securityScheme to all methods that may be declared, explicitly or implicitly, by defining the resourceTypes or traits property for that resource. To indicate that the method may be called without applying any securityScheme, the method may be annotated with the null securityScheme.
    **/
  def securedBy(): js.Array[SecuritySchemeRef] = js.native
  
  /**
    * Instantiation of applyed resource type
    **/
  def `type`(): ResourceTypeRef = js.native
  
  /**
    * Retrieve an ordered list of all uri parameters including those which are not described in the `uriParameters` node.
    * Consider a fragment of RAML specification:
    * ```yaml
    * /resource/{objectId}/{propertyId}:
    * uriParameters:
    * objectId:
    * ```
    * Here `propertyId` uri parameter is not described in the `uriParameters` node,
    * but it is among Resource.uriParameters().
    **/
  def uriParameters(): js.Array[Parameter] = js.native
}

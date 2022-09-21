package typings.raml1Parser.raml08parserapiMod

import typings.raml1Parser.highLevelASTMod.BasicNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MethodBase
  extends StObject
     with BasicNode {
  
  /**
    * A resource or a method can override a base URI template's values. This is useful to restrict or change the default or parameter selection in the base URI. The baseUriParameters property MAY be used to override any or all parameters defined at the root level baseUriParameters property, as well as base URI parameters not specified at the root level.
    **/
  def baseUriParameters(): js.Array[Parameter] = js.native
  
  /**
    * Some method verbs expect the resource to be sent as a request body. For example, to create a resource, the request must include the details of the resource to create. Resources CAN have alternate representations. For example, an API might support both JSON and XML representations. A method's body is defined in the body property as a hashmap, in which the key MUST be a valid media type.
    **/
  def body(): js.Array[BodyLike] = js.native
  
  def description(): MarkdownString = js.native
  
  /**
    * Headers that allowed at this position
    **/
  def headers(): js.Array[Parameter] = js.native
  
  /**
    * A method can override an API's protocols value for that single method by setting a different value for the fields.
    **/
  def protocols(): js.Array[String] = js.native
  
  /**
    * An APIs resources MAY be filtered (to return a subset of results) or altered (such as transforming a response body from JSON to XML format) by the use of query strings. If the resource or its method supports a query string, the query string MUST be defined by the queryParameters property
    **/
  def queryParameters(): js.Array[Parameter] = js.native
  
  /**
    * Resource methods MAY have one or more responses. Responses MAY be described using the description property, and MAY include example attributes or schema properties.
    **/
  def responses(): js.Array[Response] = js.native
  
  /**
    * A list of the security schemas to apply, these must be defined in the securitySchemes declaration. To indicate that the method may be called without applying any securityScheme, the method may be annotated with the null securityScheme. Security schemas may also be applied to a resource with securedBy, which is equivalent to applying the security schemas to all methods that may be declared, explicitly or implicitly, by defining the resourceTypes or traits property for that resource.
    **/
  def securedBy(): js.Array[SecuritySchemeRef] = js.native
}

package typings.raml1Parser.distParserArtifactsRaml08parserapiMod

import typings.raml1Parser.distParserHighLevelASTMod.BasicNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Response
  extends StObject
     with BasicNode {
  
  /**
    * Each response MAY contain a body property, which conforms to the same structure as request body properties (see Body). Responses that can return more than one response code MAY therefore have multiple bodies defined. For APIs without a priori knowledge of the response types for their responses, `* / *` MAY be used to indicate that responses that do not matching other defined data types MUST be accepted. Processing applications MUST match the most descriptive media type first if `* / *` is used.
    **/
  def body(): js.Array[BodyLike] = js.native
  
  /**
    * Responses MUST be a map of one or more HTTP status codes, where each status code itself is a map that describes that status code.
    **/
  def code(): StatusCodeString = js.native
  
  /**
    * The description attribute describes the intended use or meaning of the $self. This value MAY be formatted using Markdown.
    **/
  def description(): MarkdownString = js.native
  
  /**
    * An API's methods may support custom header values in responses. The custom, non-standard HTTP headers MUST be specified by the headers property. API's may include the the placeholder token {?} in a header name to indicate that any number of headers that conform to the specified format can be sent in responses. This is particularly useful for APIs that allow HTTP headers that conform to some naming convention to send arbitrary, custom data.
    **/
  def headers(): js.Array[Parameter] = js.native
  
  /**
    * true for codes < 400 and false otherwise
    **/
  def isOkRange(): Boolean = js.native
  
  /**
    * For responses defined inside traits and resource types returns object representation of parametrized properties
    **/
  def parametrizedProperties(): TypeInstance = js.native
}

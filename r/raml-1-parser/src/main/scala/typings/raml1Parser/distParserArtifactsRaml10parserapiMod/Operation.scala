package typings.raml1Parser.distParserArtifactsRaml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Operation
  extends StObject
     with Annotable {
  
  /**
    * Headers that allowed at this position
    **/
  def headers(): js.Array[TypeDeclaration] = js.native
  
  /**
    * An APIs resources MAY be filtered (to return a subset of results) or altered (such as transforming  a response body from JSON to XML format) by the use of query strings. If the resource or its method supports a query string, the query string MUST be defined by the queryParameters property
    **/
  def queryParameters(): js.Array[TypeDeclaration] = js.native
  
  /**
    * Specifies the query string needed by this method. Mutually exclusive with queryParameters.
    **/
  def queryString(): TypeDeclaration = js.native
  
  /**
    * Information about the expected responses to a request
    **/
  def responses(): js.Array[Response] = js.native
}

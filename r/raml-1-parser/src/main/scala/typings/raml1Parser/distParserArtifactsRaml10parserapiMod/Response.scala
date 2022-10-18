package typings.raml1Parser.distParserArtifactsRaml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Response
  extends StObject
     with Annotable {
  
  /**
    * The body of the response: a body declaration
    **/
  def body(): js.Array[TypeDeclaration] = js.native
  
  /**
    * Responses MUST be a map of one or more HTTP status codes, where each status code itself is a map that describes that status code.
    **/
  def code(): StatusCodeString = js.native
  
  /**
    * A longer, human-friendly description of the response
    **/
  def description(): MarkdownString = js.native
  
  /**
    * Detailed information about any response headers returned by this method
    **/
  def headers(): js.Array[TypeDeclaration] = js.native
  
  /**
    * true for codes < 400 and false otherwise
    **/
  def isOkRange(): Boolean = js.native
  
  /**
    * For responses defined in traits or resource types returns object representation of parametrized properties
    **/
  def parametrizedProperties(): TypeInstance = js.native
  
  /**
    * Scalar properties annotations accessor
    **/
  def scalarsAnnotations(): ResponseScalarsAnnotations = js.native
}

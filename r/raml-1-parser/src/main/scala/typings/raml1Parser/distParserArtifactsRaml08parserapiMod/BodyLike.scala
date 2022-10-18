package typings.raml1Parser.distParserArtifactsRaml08parserapiMod

import typings.raml1Parser.distParserHighLevelASTMod.BasicNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyLike
  extends StObject
     with BasicNode {
  
  /**
    * Human readable description of the body
    **/
  def description(): MarkdownString = js.native
  
  /**
    * Documentation generators MUST use body properties' example attributes to generate example invocations.
    **/
  def example(): ExampleString = js.native
  
  /**
    * Web forms REQUIRE special encoding and custom declaration. If the API's media type is either application/x-www-form-urlencoded or multipart/form-data, the formParameters property MUST specify the name-value pairs that the API is expecting. The formParameters property is a map in which the key is the name of the web form parameter, and the value is itself a map the specifies the web form parameter's attributes.
    **/
  def formParameters(): js.Array[Parameter] = js.native
  
  /**
    * Mime type of the request or response body
    **/
  def name(): String = js.native
  
  /**
    * For bodies defined inside traits and resource types returns object representation of parametrized properties
    **/
  def parametrizedProperties(): TypeInstance = js.native
  
  /**
    * The structure of a request or response body MAY be further specified by the schema property under the appropriate media type. The schema key CANNOT be specified if a body's media type is application/x-www-form-urlencoded or multipart/form-data. All parsers of RAML MUST be able to interpret JSON Schema and XML Schema. Schema MAY be declared inline or in an external file. However, if the schema is sufficiently large so as to make it difficult for a person to read the API definition, or the schema is reused across multiple APIs or across multiple miles in the same API, the !include user-defined data type SHOULD be used instead of including the content inline. Alternatively, the value of the schema field MAY be the name of a schema specified in the root-level schemas property, or it MAY be declared in an external file and included by using the by using the RAML !include user-defined data type.
    **/
  def schema(): SchemaString = js.native
  
  /**
    * Returns schema content for the cases when schema is inlined, when schema is included, and when schema is a reference.
    **/
  def schemaContent(): String = js.native
}

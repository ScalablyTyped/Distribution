package typings.raml1Parser.distParserArtifactsRaml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MethodBase
  extends StObject
     with Operation {
  
  /**
    * Some method verbs expect the resource to be sent as a request body. For example, to create a resource, the request must include the details of the resource to create. Resources CAN have alternate representations. For example, an API might support both JSON and XML representations. A method's body is defined in the body property as a hashmap, in which the key MUST be a valid media type.
    **/
  def body(): js.Array[TypeDeclaration] = js.native
  
  def description(): MarkdownString = js.native
  
  def displayName(): String = js.native
  
  /**
    * Instantiation of applyed traits
    **/
  def is(): js.Array[TraitRef] = js.native
  
  /**
    * A method can override the protocols specified in the resource or at the API root, by employing this property.
    **/
  def protocols(): js.Array[String] = js.native
  
  /**
    * Scalar properties annotations accessor
    **/
  def scalarsAnnotations(): MethodBaseScalarsAnnotations = js.native
  
  /**
    * securityScheme may also be applied to a resource by using the securedBy key, which is equivalent to applying the securityScheme to all methods that may be declared, explicitly or implicitly, by defining the resourceTypes or traits property for that resource. To indicate that the method may be called without applying any securityScheme, the method may be annotated with the null securityScheme.
    **/
  def securedBy(): js.Array[SecuritySchemeRef] = js.native
}

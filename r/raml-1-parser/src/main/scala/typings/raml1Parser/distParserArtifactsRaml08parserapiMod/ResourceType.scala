package typings.raml1Parser.distParserArtifactsRaml08parserapiMod

import typings.raml1Parser.distParserHighLevelASTMod.BasicNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceType
  extends StObject
     with BasicNode {
  
  /**
    * A resource or a method can override a base URI template's values. This is useful to restrict or change the default or parameter selection in the base URI. The baseUriParameters property MAY be used to override any or all parameters defined at the root level baseUriParameters property, as well as base URI parameters not specified at the root level.
    **/
  def baseUriParameters(): js.Array[Parameter] = js.native
  
  /**
    * The description attribute describes the intended use or meaning of the $self. This value MAY be formatted using Markdown.
    **/
  def description(): MarkdownString = js.native
  
  /**
    * An alternate, human-friendly name for the resource type
    **/
  def displayName(): String = js.native
  
  /**
    * Instantiation of applyed traits
    **/
  def is(): js.Array[TraitRef] = js.native
  
  /**
    * Methods that are part of this resource type definition
    **/
  def methods(): js.Array[Method] = js.native
  
  /**
    * Name of the resource type
    **/
  def name(): String = js.native
  
  /**
    * Returns object representation of parametrized properties of the resource type
    **/
  def parametrizedProperties(): TypeInstance = js.native
  
  /**
    * securityScheme may also be applied to a resource by using the securedBy key, which is equivalent to applying the securityScheme to all methods that may be declared, explicitly or implicitly, by defining the resourceTypes or traits property for that resource. To indicate that the method may be called without applying any securityScheme, the method may be annotated with the null securityScheme.
    **/
  def securedBy(): js.Array[SecuritySchemeRef] = js.native
  
  /**
    * Instantiation of applyed resource type
    **/
  def `type`(): ResourceTypeRef = js.native
  
  /**
    * Uri parameters of this resource
    **/
  def uriParameters(): js.Array[Parameter] = js.native
  
  /**
    * Instructions on how and when the resource type should be used.
    **/
  def usage(): String = js.native
}

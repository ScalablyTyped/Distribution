package typings.raml1Parser.distParserHighLevelASTMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicNode
  extends StObject
     with AbstractWrapperNode {
  
  /**
    * @return object representing class of the node
    **/
  def definition(): ITypeDefinition = js.native
  
  /**
    * @return Array of errors
    **/
  def errors(): js.Array[RamlParserError] = js.native
  
  /**
    * @hidden
    * @return Underlying node of the High Level model
    **/
  def highLevel(): IHighLevelNode = js.native
  
  def meta(): NodeMetadata = js.native
  
  /**
    * @return Whether the element is an optional sibling of trait or resource type
    **/
  def optional(): Boolean = js.native
  
  /**
    * @return For siblings of traits or resource types returns an array of optional properties names.
    **/
  def optionalProperties(): js.Array[String] = js.native
  
  /**
    * @return Direct ancestor in RAML hierarchy
    **/
  def parent(): BasicNode = js.native
  
  /**
    * @return for user class instances returns object representing actual user class
    **/
  def runtimeDefinition(): ITypeDefinition = js.native
  
  /**
    * Turns model node into an object.
    * @param node Model node
    * @return Stringifyable object representation of the node.
    **/
  def toJSON(): Any = js.native
  def toJSON(serializeOptions: SerializeOptions): Any = js.native
}

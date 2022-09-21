package typings.raml1Parser.highLevelASTMod

import typings.raml1Parser.anon.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAttribute
  extends StObject
     with IParseResult {
  
  /**
    * Append value to the underlying YAML node
    */
  def addValue(value: String): Any = js.native
  def addValue(value: IStructuredValue): Any = js.native
  
  /**
    * A list of annotations if any
    */
  def annotations(): js.Array[IAttribute] = js.native
  
  /**
    * Value type representation
    */
  def definition(): IValueTypeDefinition = js.native
  
  /**
    * For references returns nAST node defining the referenced RAML element
    */
  def findReferencedValue(): IHighLevelNode = js.native
  
  /**
    * Whether the attribute represents an annotated scalar value
    */
  def isAnnotatedScalar(): Boolean = js.native
  
  def isEmpty(): Boolean = js.native
  
  def owningWrapper(): Property = js.native
  
  /**
    * Plain attribute value. Unlike the 'value', for parametrized template
    * references and annotation instances this method returns plain objects
    * or arrays instead of StructuredValue instances. For inline type instances
    * (i.e. those types which are defined as 'type' or 'items' values) the method
    * return IHighLevelNode instances describing the types.
    */
  def plainValue(): Any = js.native
  
  /**
    * Remove trhe attribute from AST
    */
  def remove(): Any = js.native
  
  /**
    * Set key to the underlying YAML node
    */
  def setKey(k: String): Any = js.native
  
  /**
    * Set value to the underlying YAML node
    */
  def setValue(newValue: String): Any = js.native
  def setValue(newValue: IStructuredValue): Any = js.native
  
  /**
    * Set values to the underlying YAML node
    */
  def setValues(values: js.Array[String]): Any = js.native
  
  /**
    * Attribute value
    */
  def value(): Any = js.native
}

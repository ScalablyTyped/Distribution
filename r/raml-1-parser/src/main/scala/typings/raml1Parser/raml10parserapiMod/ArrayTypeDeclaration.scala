package typings.raml1Parser.raml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayTypeDeclaration
  extends StObject
     with TypeDeclaration {
  
  /**
    * Returns anonymous type defined by "items" keyword, or a component type if declaration can be found.
    * Does not resolve type expressions. Only returns component type declaration if it is actually defined
    * somewhere in AST.
    **/
  def findComponentTypeDeclaration(): TypeDeclaration = js.native
  
  /**
    * Anonymous type declaration defined by "items" keyword.
    * If no "items" is defined explicitly, this one is null.
    **/
  def items(): js.Array[String] = js.native
  
  /**
    * Maximum amount of items in array
    **/
  def maxItems(): Double = js.native
  
  /**
    * Minimum amount of items in array
    **/
  def minItems(): Double = js.native
  
  /**
    * Inlined component type definition
    **/
  def structuredItems(): TypeInstance = js.native
  
  /**
    * Should items in array be unique
    **/
  def uniqueItems(): Boolean = js.native
}

package typings.raml1Parser.raml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringTypeDeclaration
  extends StObject
     with TypeDeclaration {
  
  /**
    * (Optional, applicable only for parameters of type string) The enum attribute provides an enumeration of the parameter's valid values. This MUST be an array. If the enum attribute is defined, API clients and servers MUST verify that a parameter's value matches a value in the enum array. If there is no matching value, the clients and servers MUST treat this as an error.
    **/
  def `enum`(): js.Array[String] = js.native
  
  /**
    * Maximum length of the string
    **/
  def maxLength(): Double = js.native
  
  /**
    * Minimum length of the string
    **/
  def minLength(): Double = js.native
  
  /**
    * Regular expression that this string should path
    **/
  def pattern(): String = js.native
}

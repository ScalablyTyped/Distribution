package typings.raml1Parser.raml08parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringTypeDeclaration
  extends StObject
     with Parameter {
  
  /**
    * (Optional, applicable only for parameters of type string) The enum attribute provides an enumeration of the parameter's valid values. This MUST be an array. If the enum attribute is defined, API clients and servers MUST verify that a parameter's value matches a value in the enum array. If there is no matching value, the clients and servers MUST treat this as an error.
    **/
  def `enum`(): js.Array[String] = js.native
  
  /**
    * (Optional, applicable only for parameters of type string) The maxLength attribute specifies the parameter value's maximum number of characters.
    **/
  def maxLength(): Double = js.native
  
  /**
    * (Optional, applicable only for parameters of type string) The minLength attribute specifies the parameter value's minimum number of characters.
    **/
  def minLength(): Double = js.native
  
  /**
    * (Optional, applicable only for parameters of type string) The pattern attribute is a regular expression that a parameter of type string MUST match. Regular expressions MUST follow the regular expression specification from ECMA 262/Perl 5. The pattern MAY be enclosed in double quotes for readability and clarity.
    **/
  def pattern(): String = js.native
}

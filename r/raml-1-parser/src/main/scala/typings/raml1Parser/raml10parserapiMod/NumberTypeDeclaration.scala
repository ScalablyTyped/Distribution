package typings.raml1Parser.raml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberTypeDeclaration
  extends StObject
     with TypeDeclaration {
  
  /**
    * (Optional, applicable only for parameters of type string) The enum attribute provides an enumeration of the parameter's valid values. This MUST be an array. If the enum attribute is defined, API clients and servers MUST verify that a parameter's value matches a value in the enum array. If there is no matching value, the clients and servers MUST treat this as an error.
    **/
  def `enum`(): js.Array[Double] = js.native
  
  /**
    * Value format
    **/
  def format(): String = js.native
  
  /**
    * (Optional, applicable only for parameters of type number or integer) The maximum attribute specifies the parameter's maximum value.
    **/
  def maximum(): Double = js.native
  
  /**
    * (Optional, applicable only for parameters of type number or integer) The minimum attribute specifies the parameter's minimum value.
    **/
  def minimum(): Double = js.native
  
  /**
    * A numeric instance is valid against "multipleOf" if the result of the division of the instance by this keyword's value is an integer.
    **/
  def multipleOf(): Double = js.native
}

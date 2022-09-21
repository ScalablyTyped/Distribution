package typings.raml1Parser.raml08parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberTypeDeclaration
  extends StObject
     with Parameter {
  
  /**
    * (Optional, applicable only for parameters of type number or integer) The maximum attribute specifies the parameter's maximum value.
    **/
  def maximum(): Double = js.native
  
  /**
    * (Optional, applicable only for parameters of type number or integer) The minimum attribute specifies the parameter's minimum value.
    **/
  def minimum(): Double = js.native
}

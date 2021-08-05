package typings.qlikVisualizationextensions.BackendAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INxSimpleValue extends StObject {
  
  /**
    * Numeric value of the attribute expression.
    * This property is set to NaN (Not a Number) if the attribute expression value is not a numeric.
    * Numerical values are not returned as text.
    * Double precision floating point
    */
  var qNum: Double
  
  /**
    * Text related to the attribute expression value.
    * This property is optional. No text is returned if the attribute expression value is a numeric.
    * String
    */
  var qText: String
}
object INxSimpleValue {
  
  inline def apply(qNum: Double, qText: String): INxSimpleValue = {
    val __obj = js.Dynamic.literal(qNum = qNum.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxSimpleValue]
  }
  
  extension [Self <: INxSimpleValue](x: Self) {
    
    inline def setQNum(value: Double): Self = StObject.set(x, "qNum", value.asInstanceOf[js.Any])
    
    inline def setQText(value: String): Self = StObject.set(x, "qText", value.asInstanceOf[js.Any])
  }
}

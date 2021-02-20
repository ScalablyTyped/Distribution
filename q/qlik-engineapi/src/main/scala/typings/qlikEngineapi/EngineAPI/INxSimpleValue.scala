package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxSimpleValue
  */
@js.native
trait INxSimpleValue extends StObject {
  
  /**
    * Numeric value of the attribute expression.
    * This property is set to NaN (Not a Number) if the attribute expression value is not a numeric.
    * Numerical values are not returned as text.
    */
  var qNum: Double = js.native
  
  /**
    * Text related to the attribute expression value.
    * This property is optional. No text is returned if the attribute expression value is a numeric.
    */
  var qText: js.UndefOr[String] = js.native
}
object INxSimpleValue {
  
  @scala.inline
  def apply(qNum: Double): INxSimpleValue = {
    val __obj = js.Dynamic.literal(qNum = qNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxSimpleValue]
  }
  
  @scala.inline
  implicit class INxSimpleValueMutableBuilder[Self <: INxSimpleValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQNum(value: Double): Self = StObject.set(x, "qNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQText(value: String): Self = StObject.set(x, "qText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTextUndefined: Self = StObject.set(x, "qText", js.undefined)
  }
}

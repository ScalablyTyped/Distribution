package typings.qlikVisualizationextensions.BackendAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INxSimpleDimValue extends StObject {
  
  /**
    * Element number.
    * Integer
    */
  var qElemNo: Double = js.native
  
  /**
    * Text related to the attribute expression value.
    * This property is optional. No text is returned if the attribute expression value is a numeric.
    * String
    */
  var qText: String = js.native
}
object INxSimpleDimValue {
  
  @scala.inline
  def apply(qElemNo: Double, qText: String): INxSimpleDimValue = {
    val __obj = js.Dynamic.literal(qElemNo = qElemNo.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxSimpleDimValue]
  }
  
  @scala.inline
  implicit class INxSimpleDimValueMutableBuilder[Self <: INxSimpleDimValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQElemNo(value: Double): Self = StObject.set(x, "qElemNo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQText(value: String): Self = StObject.set(x, "qText", value.asInstanceOf[js.Any])
  }
}

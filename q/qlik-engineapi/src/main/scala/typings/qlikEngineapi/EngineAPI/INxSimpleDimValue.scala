package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxSimpleDimValue..
  */
@js.native
trait INxSimpleDimValue extends StObject {
  
  /**
    * Element number.
    */
  var qElemNo: Double = js.native
  
  /**
    * Text related to the attribute expression value.
    * This property is optional. No text is returned if the attribute expression value is a numeric.
    */
  var qText: js.UndefOr[String] = js.native
}
object INxSimpleDimValue {
  
  @scala.inline
  def apply(qElemNo: Double): INxSimpleDimValue = {
    val __obj = js.Dynamic.literal(qElemNo = qElemNo.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxSimpleDimValue]
  }
  
  @scala.inline
  implicit class INxSimpleDimValueMutableBuilder[Self <: INxSimpleDimValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQElemNo(value: Double): Self = StObject.set(x, "qElemNo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQText(value: String): Self = StObject.set(x, "qText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTextUndefined: Self = StObject.set(x, "qText", js.undefined)
  }
}

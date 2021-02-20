package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxGroupTail
  */
@js.native
trait INxGroupTail extends StObject {
  
  /**
    * Number of elements that are part of the next tail.
    * This number depends on the paging, more particularly it depends on the values defined in qTop and qHeight
    * This parameter is optional. Is not shown if the value is 0.
    */
  var qDown: js.UndefOr[Double] = js.native
  
  /**
    * Number of elements that are part of the previous tail.
    * This number depends on the paging, more particularly it depends on the values defined in qTop and qHeight
    * This parameter is optional. Is not shown if the value is 0.
    */
  var qUp: js.UndefOr[Double] = js.native
}
object INxGroupTail {
  
  @scala.inline
  def apply(): INxGroupTail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INxGroupTail]
  }
  
  @scala.inline
  implicit class INxGroupTailMutableBuilder[Self <: INxGroupTail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQDown(value: Double): Self = StObject.set(x, "qDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDownUndefined: Self = StObject.set(x, "qDown", js.undefined)
    
    @scala.inline
    def setQUp(value: Double): Self = StObject.set(x, "qUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUpUndefined: Self = StObject.set(x, "qUp", js.undefined)
  }
}

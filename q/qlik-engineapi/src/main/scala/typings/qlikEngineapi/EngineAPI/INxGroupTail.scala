package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxGroupTail
  */
trait INxGroupTail extends StObject {
  
  /**
    * Number of elements that are part of the next tail.
    * This number depends on the paging, more particularly it depends on the values defined in qTop and qHeight
    * This parameter is optional. Is not shown if the value is 0.
    */
  var qDown: js.UndefOr[Double] = js.undefined
  
  /**
    * Number of elements that are part of the previous tail.
    * This number depends on the paging, more particularly it depends on the values defined in qTop and qHeight
    * This parameter is optional. Is not shown if the value is 0.
    */
  var qUp: js.UndefOr[Double] = js.undefined
}
object INxGroupTail {
  
  inline def apply(): INxGroupTail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INxGroupTail]
  }
  
  extension [Self <: INxGroupTail](x: Self) {
    
    inline def setQDown(value: Double): Self = StObject.set(x, "qDown", value.asInstanceOf[js.Any])
    
    inline def setQDownUndefined: Self = StObject.set(x, "qDown", js.undefined)
    
    inline def setQUp(value: Double): Self = StObject.set(x, "qUp", value.asInstanceOf[js.Any])
    
    inline def setQUpUndefined: Self = StObject.set(x, "qUp", js.undefined)
  }
}

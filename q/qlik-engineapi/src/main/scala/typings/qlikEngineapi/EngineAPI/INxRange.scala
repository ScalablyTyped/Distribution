package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxRange...
  */
trait INxRange extends StObject {
  
  /**
    * Position in the expression of the first character of the field name.
    */
  var qCount: Double
  
  /**
    * Number of characters in the field name.
    */
  var qFrom: Double
}
object INxRange {
  
  inline def apply(qCount: Double, qFrom: Double): INxRange = {
    val __obj = js.Dynamic.literal(qCount = qCount.asInstanceOf[js.Any], qFrom = qFrom.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: INxRange] (val x: Self) extends AnyVal {
    
    inline def setQCount(value: Double): Self = StObject.set(x, "qCount", value.asInstanceOf[js.Any])
    
    inline def setQFrom(value: Double): Self = StObject.set(x, "qFrom", value.asInstanceOf[js.Any])
  }
}

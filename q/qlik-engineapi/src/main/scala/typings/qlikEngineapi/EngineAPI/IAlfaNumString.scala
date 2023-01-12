package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AlfaNumString...
  */
trait IAlfaNumString extends StObject {
  
  /**
    * Is set to true if the value is a numeric.
    */
  var qIsNum: Boolean
  
  /**
    * Calculated value.
    */
  var qString: String
}
object IAlfaNumString {
  
  inline def apply(qIsNum: Boolean, qString: String): IAlfaNumString = {
    val __obj = js.Dynamic.literal(qIsNum = qIsNum.asInstanceOf[js.Any], qString = qString.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAlfaNumString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAlfaNumString] (val x: Self) extends AnyVal {
    
    inline def setQIsNum(value: Boolean): Self = StObject.set(x, "qIsNum", value.asInstanceOf[js.Any])
    
    inline def setQString(value: String): Self = StObject.set(x, "qString", value.asInstanceOf[js.Any])
  }
}

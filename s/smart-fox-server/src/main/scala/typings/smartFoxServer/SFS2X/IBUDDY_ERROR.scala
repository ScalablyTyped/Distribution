package typings.smartFoxServer.SFS2X

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBUDDY_ERROR extends StObject {
  
  var errorCode: Double
  
  var errorMessage: String
}
object IBUDDY_ERROR {
  
  inline def apply(errorCode: Double, errorMessage: String): IBUDDY_ERROR = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBUDDY_ERROR]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBUDDY_ERROR] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
  }
}

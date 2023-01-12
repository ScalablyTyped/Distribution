package typings.smartFoxServer.SFS2X

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IINVITATION_REPLY_ERROR extends StObject {
  
  var errorCode: Double
  
  var errorMessage: String
}
object IINVITATION_REPLY_ERROR {
  
  inline def apply(errorCode: Double, errorMessage: String): IINVITATION_REPLY_ERROR = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[IINVITATION_REPLY_ERROR]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IINVITATION_REPLY_ERROR] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
  }
}

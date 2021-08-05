package typings.smartFoxServer.SFS2X

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISOCKET_ERROR extends StObject {
  
  var errorMessage: String
}
object ISOCKET_ERROR {
  
  inline def apply(errorMessage: String): ISOCKET_ERROR = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISOCKET_ERROR]
  }
  
  extension [Self <: ISOCKET_ERROR](x: Self) {
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
  }
}

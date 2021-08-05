package typings.smartFoxServer.SFS2X

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICONNECTION_LOST extends StObject {
  
  var reason: String
}
object ICONNECTION_LOST {
  
  inline def apply(reason: String): ICONNECTION_LOST = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICONNECTION_LOST]
  }
  
  extension [Self <: ICONNECTION_LOST](x: Self) {
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}

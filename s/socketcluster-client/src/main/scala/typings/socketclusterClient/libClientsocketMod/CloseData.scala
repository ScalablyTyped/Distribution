package typings.socketclusterClient.libClientsocketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseData extends StObject {
  
  var code: Double
  
  var reason: String
}
object CloseData {
  
  inline def apply(code: Double, reason: String): CloseData = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseData]
  }
  
  extension [Self <: CloseData](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}

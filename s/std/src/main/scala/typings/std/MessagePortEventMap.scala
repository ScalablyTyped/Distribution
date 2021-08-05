package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagePortEventMap extends StObject {
  
  var message: MessageEvent[js.Any]
  
  var messageerror: MessageEvent[js.Any]
}
object MessagePortEventMap {
  
  inline def apply(message: MessageEvent[js.Any], messageerror: MessageEvent[js.Any]): MessagePortEventMap = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePortEventMap]
  }
  
  extension [Self <: MessagePortEventMap](x: Self) {
    
    inline def setMessage(value: MessageEvent[js.Any]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageerror(value: MessageEvent[js.Any]): Self = StObject.set(x, "messageerror", value.asInstanceOf[js.Any])
  }
}

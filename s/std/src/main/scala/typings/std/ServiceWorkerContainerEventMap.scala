package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceWorkerContainerEventMap extends StObject {
  
  var controllerchange: Event
  
  var message: MessageEvent[js.Any]
  
  var messageerror: MessageEvent[js.Any]
}
object ServiceWorkerContainerEventMap {
  
  inline def apply(controllerchange: Event, message: MessageEvent[js.Any], messageerror: MessageEvent[js.Any]): ServiceWorkerContainerEventMap = {
    val __obj = js.Dynamic.literal(controllerchange = controllerchange.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerContainerEventMap]
  }
  
  extension [Self <: ServiceWorkerContainerEventMap](x: Self) {
    
    inline def setControllerchange(value: Event): Self = StObject.set(x, "controllerchange", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: MessageEvent[js.Any]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageerror(value: MessageEvent[js.Any]): Self = StObject.set(x, "messageerror", value.asInstanceOf[js.Any])
  }
}

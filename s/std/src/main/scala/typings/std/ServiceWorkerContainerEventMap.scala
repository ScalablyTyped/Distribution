package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceWorkerContainerEventMap extends StObject {
  
  /* standard dom */
  var controllerchange: Event
  
  /* standard dom */
  var message: MessageEvent[Any]
  
  /* standard dom */
  var messageerror: MessageEvent[Any]
}
object ServiceWorkerContainerEventMap {
  
  inline def apply(controllerchange: Event, message: MessageEvent[Any], messageerror: MessageEvent[Any]): ServiceWorkerContainerEventMap = {
    val __obj = js.Dynamic.literal(controllerchange = controllerchange.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerContainerEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceWorkerContainerEventMap] (val x: Self) extends AnyVal {
    
    inline def setControllerchange(value: Event): Self = StObject.set(x, "controllerchange", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: MessageEvent[Any]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageerror(value: MessageEvent[Any]): Self = StObject.set(x, "messageerror", value.asInstanceOf[js.Any])
  }
}

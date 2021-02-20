package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceWorkerContainerEventMap extends StObject {
  
  var controllerchange: Event = js.native
  
  var message: MessageEvent[_] = js.native
  
  var messageerror: MessageEvent[_] = js.native
}
object ServiceWorkerContainerEventMap {
  
  @scala.inline
  def apply(controllerchange: Event, message: MessageEvent[_], messageerror: MessageEvent[_]): ServiceWorkerContainerEventMap = {
    val __obj = js.Dynamic.literal(controllerchange = controllerchange.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerContainerEventMap]
  }
  
  @scala.inline
  implicit class ServiceWorkerContainerEventMapMutableBuilder[Self <: ServiceWorkerContainerEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControllerchange(value: Event): Self = StObject.set(x, "controllerchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: MessageEvent[_]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageerror(value: MessageEvent[_]): Self = StObject.set(x, "messageerror", value.asInstanceOf[js.Any])
  }
}

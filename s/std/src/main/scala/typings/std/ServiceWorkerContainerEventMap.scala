package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceWorkerContainerEventMap extends js.Object {
  var controllerchange: Event
  var message: MessageEvent
  var messageerror: MessageEvent
}

object ServiceWorkerContainerEventMap {
  @scala.inline
  def apply(controllerchange: Event, message: MessageEvent, messageerror: MessageEvent): ServiceWorkerContainerEventMap = {
    val __obj = js.Dynamic.literal(controllerchange = controllerchange, message = message, messageerror = messageerror)
  
    __obj.asInstanceOf[ServiceWorkerContainerEventMap]
  }
}


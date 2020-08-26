package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceWorkerContainerEventMap extends js.Object {
  var controllerchange: Event = js.native
  var message: MessageEvent = js.native
  var messageerror: MessageEvent = js.native
}

object ServiceWorkerContainerEventMap {
  @scala.inline
  def apply(controllerchange: Event, message: MessageEvent, messageerror: MessageEvent): ServiceWorkerContainerEventMap = {
    val __obj = js.Dynamic.literal(controllerchange = controllerchange.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerContainerEventMap]
  }
  @scala.inline
  implicit class ServiceWorkerContainerEventMapOps[Self <: ServiceWorkerContainerEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setControllerchange(value: Event): Self = this.set("controllerchange", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: MessageEvent): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageerror(value: MessageEvent): Self = this.set("messageerror", value.asInstanceOf[js.Any])
  }
  
}


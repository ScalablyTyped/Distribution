package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceWorkerRegistrationEventMap extends js.Object {
  var updatefound: Event = js.native
}

object ServiceWorkerRegistrationEventMap {
  @scala.inline
  def apply(updatefound: Event): ServiceWorkerRegistrationEventMap = {
    val __obj = js.Dynamic.literal(updatefound = updatefound.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerRegistrationEventMap]
  }
  @scala.inline
  implicit class ServiceWorkerRegistrationEventMapOps[Self <: ServiceWorkerRegistrationEventMap] (val x: Self) extends AnyVal {
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
    def setUpdatefound(value: Event): Self = this.set("updatefound", value.asInstanceOf[js.Any])
  }
  
}


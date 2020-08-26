package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceWorkerEventMap extends AbstractWorkerEventMap {
  var statechange: Event = js.native
}

object ServiceWorkerEventMap {
  @scala.inline
  def apply(error: ErrorEvent, statechange: Event): ServiceWorkerEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerEventMap]
  }
  @scala.inline
  implicit class ServiceWorkerEventMapOps[Self <: ServiceWorkerEventMap] (val x: Self) extends AnyVal {
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
    def setStatechange(value: Event): Self = this.set("statechange", value.asInstanceOf[js.Any])
  }
  
}


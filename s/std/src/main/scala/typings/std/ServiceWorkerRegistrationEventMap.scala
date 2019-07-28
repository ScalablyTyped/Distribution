package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceWorkerRegistrationEventMap extends js.Object {
  var updatefound: Event
}

object ServiceWorkerRegistrationEventMap {
  @scala.inline
  def apply(updatefound: Event): ServiceWorkerRegistrationEventMap = {
    val __obj = js.Dynamic.literal(updatefound = updatefound)
  
    __obj.asInstanceOf[ServiceWorkerRegistrationEventMap]
  }
}


package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceWorkerEventMap extends AbstractWorkerEventMap {
  var statechange: Event
}

object ServiceWorkerEventMap {
  @scala.inline
  def apply(error: ErrorEvent, statechange: Event): ServiceWorkerEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("statechange")(statechange)
    __obj.asInstanceOf[ServiceWorkerEventMap]
  }
}


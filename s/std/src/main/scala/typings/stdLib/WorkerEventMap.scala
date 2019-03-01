package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerEventMap extends AbstractWorkerEventMap {
  var message: MessageEvent
}

object WorkerEventMap {
  @scala.inline
  def apply(error: ErrorEvent, message: MessageEvent): WorkerEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[WorkerEventMap]
  }
}


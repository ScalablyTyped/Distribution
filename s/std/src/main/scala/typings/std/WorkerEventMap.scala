package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerEventMap extends AbstractWorkerEventMap {
  var message: MessageEvent
  var messageerror: MessageEvent
}

object WorkerEventMap {
  @scala.inline
  def apply(error: ErrorEvent, message: MessageEvent, messageerror: MessageEvent): WorkerEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerEventMap]
  }
}


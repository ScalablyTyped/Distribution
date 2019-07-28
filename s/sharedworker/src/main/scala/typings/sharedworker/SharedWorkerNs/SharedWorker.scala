package typings.sharedworker.SharedWorkerNs

import typings.std.MessagePort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedWorker extends AbstractWorker {
  /**
    * the value it was assigned by the object's constructor.
    * It represents the MessagePort for communicating with the shared worker.
    * @type {MessagePort}
    */
  var port: MessagePort = js.native
}


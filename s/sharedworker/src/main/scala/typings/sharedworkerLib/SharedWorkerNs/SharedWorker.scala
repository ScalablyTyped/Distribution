package typings
package sharedworkerLib.SharedWorkerNs

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
  var port: stdLib.MessagePort = js.native
}


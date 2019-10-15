package typings.queue.queueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueWorker extends js.Object {
  /**
    * Override queue timeout.
    */
  var timeout: js.UndefOr[Double] = js.native
  def apply(): Unit = js.native
  def apply(callback: QueueWorkerCallback): Unit = js.native
}


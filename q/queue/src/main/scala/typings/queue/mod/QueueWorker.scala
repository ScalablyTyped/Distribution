package typings.queue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueWorker extends js.Object {
  
  def apply(): Unit = js.native
  def apply(callback: QueueWorkerCallback): Unit = js.native
  
  /**
    * Override queue timeout.
    */
  var timeout: js.UndefOr[Double] = js.native
}

package typings
package promiseDashQueueLib.promiseDashQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueOptions extends js.Object {
  /**
    * Callback that is called when the queue is empty and all pending promises have resolved
    */
  def onEmpty(): scala.Unit
}

object QueueOptions {
  @scala.inline
  def apply(onEmpty: () => scala.Unit): QueueOptions = {
    val __obj = js.Dynamic.literal(onEmpty = js.Any.fromFunction0(onEmpty))
  
    __obj.asInstanceOf[QueueOptions]
  }
}


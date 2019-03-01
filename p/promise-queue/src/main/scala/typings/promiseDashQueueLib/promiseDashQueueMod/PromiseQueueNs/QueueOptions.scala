package typings
package promiseDashQueueLib.promiseDashQueueMod.PromiseQueueNs

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
  def apply(onEmpty: js.Function0[scala.Unit]): QueueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onEmpty")(onEmpty)
    __obj.asInstanceOf[QueueOptions]
  }
}


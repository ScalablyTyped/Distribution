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


package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerHandle extends js.Object {
  /**
  	 * Removes the listener from the event.j
  	 */
  def cancel(): Unit
}

object ListenerHandle {
  @scala.inline
  def apply(cancel: () => Unit): ListenerHandle = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
    __obj.asInstanceOf[ListenerHandle]
  }
}


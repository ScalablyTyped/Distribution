package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerHandle extends js.Object {
  /**
  	 * Removes the listener from the event.j
  	 */
  def cancel(): Unit = js.native
}

object ListenerHandle {
  @scala.inline
  def apply(cancel: () => Unit): ListenerHandle = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
    __obj.asInstanceOf[ListenerHandle]
  }
  @scala.inline
  implicit class ListenerHandleOps[Self <: ListenerHandle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
  }
  
}


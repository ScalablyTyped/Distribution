package typings.reactMdUtils.delegateEventMod

import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DelegatedEventHandler extends js.Object {
  /**
    * Adds the provided callback to the throttled event listener.
    */
  def add(callback: EventListener): Unit = js.native
  /**
    * Attempts to remove the provided callback from the throttled event listener.
    */
  def remove(callback: EventListener): Unit = js.native
}

object DelegatedEventHandler {
  @scala.inline
  def apply(add: EventListener => Unit, remove: EventListener => Unit): DelegatedEventHandler = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[DelegatedEventHandler]
  }
  @scala.inline
  implicit class DelegatedEventHandlerOps[Self <: DelegatedEventHandler] (val x: Self) extends AnyVal {
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
    def setAdd(value: EventListener => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: EventListener => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
  }
  
}


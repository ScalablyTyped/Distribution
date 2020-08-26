package typings.storybookApi.anon

import typings.storybookApi.shortcutsMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddEventListener extends js.Object {
  var tagName: String = js.native
  def addEventListener(): Unit = js.native
  def dispatchEvent(event: Event): Boolean = js.native
  def getAttribute(attr: String): String | Null = js.native
  def removeEventListener(): Boolean = js.native
}

object AddEventListener {
  @scala.inline
  def apply(
    addEventListener: () => Unit,
    dispatchEvent: Event => Boolean,
    getAttribute: String => String | Null,
    removeEventListener: () => Boolean,
    tagName: String
  ): AddEventListener = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction0(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), getAttribute = js.Any.fromFunction1(getAttribute), removeEventListener = js.Any.fromFunction0(removeEventListener), tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddEventListener]
  }
  @scala.inline
  implicit class AddEventListenerOps[Self <: AddEventListener] (val x: Self) extends AnyVal {
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
    def setAddEventListener(value: () => Unit): Self = this.set("addEventListener", js.Any.fromFunction0(value))
    @scala.inline
    def setDispatchEvent(value: Event => Boolean): Self = this.set("dispatchEvent", js.Any.fromFunction1(value))
    @scala.inline
    def setGetAttribute(value: String => String | Null): Self = this.set("getAttribute", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveEventListener(value: () => Boolean): Self = this.set("removeEventListener", js.Any.fromFunction0(value))
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
  }
  
}


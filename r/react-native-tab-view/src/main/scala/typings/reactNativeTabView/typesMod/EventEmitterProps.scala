package typings.reactNativeTabView.typesMod

import typings.reactNativeTabView.reactNativeTabViewStrings.enter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventEmitterProps extends js.Object {
  @JSName("addListener")
  def addListener_enter(`type`: enter, listener: Listener): Unit = js.native
  @JSName("removeListener")
  def removeListener_enter(`type`: enter, listener: Listener): Unit = js.native
}

object EventEmitterProps {
  @scala.inline
  def apply(addListener: (enter, Listener) => Unit, removeListener: (enter, Listener) => Unit): EventEmitterProps = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), removeListener = js.Any.fromFunction2(removeListener))
    __obj.asInstanceOf[EventEmitterProps]
  }
  @scala.inline
  implicit class EventEmitterPropsOps[Self <: EventEmitterProps] (val x: Self) extends AnyVal {
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
    def setAddListener(value: (enter, Listener) => Unit): Self = this.set("addListener", js.Any.fromFunction2(value))
    @scala.inline
    def setRemoveListener(value: (enter, Listener) => Unit): Self = this.set("removeListener", js.Any.fromFunction2(value))
  }
  
}


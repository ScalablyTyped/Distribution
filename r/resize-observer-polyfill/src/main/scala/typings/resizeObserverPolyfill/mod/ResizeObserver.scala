package typings.resizeObserverPolyfill.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizeObserver extends js.Object {
  def disconnect(): Unit = js.native
  def observe(target: Element): Unit = js.native
  def unobserve(target: Element): Unit = js.native
}

object ResizeObserver {
  @scala.inline
  def apply(disconnect: () => Unit, observe: Element => Unit, unobserve: Element => Unit): ResizeObserver = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), observe = js.Any.fromFunction1(observe), unobserve = js.Any.fromFunction1(unobserve))
    __obj.asInstanceOf[ResizeObserver]
  }
  @scala.inline
  implicit class ResizeObserverOps[Self <: ResizeObserver] (val x: Self) extends AnyVal {
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
    def setDisconnect(value: () => Unit): Self = this.set("disconnect", js.Any.fromFunction0(value))
    @scala.inline
    def setObserve(value: Element => Unit): Self = this.set("observe", js.Any.fromFunction1(value))
    @scala.inline
    def setUnobserve(value: Element => Unit): Self = this.set("unobserve", js.Any.fromFunction1(value))
  }
  
}


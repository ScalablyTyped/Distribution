package typings.reactWait.mod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaitingContext extends js.Object {
  var Wait: ComponentType[WaitingContextWaitProps] = js.native
  def endWaiting(): Unit = js.native
  def isWaiting(): Boolean = js.native
  def startWaiting(): Unit = js.native
}

object WaitingContext {
  @scala.inline
  def apply(
    Wait: ComponentType[WaitingContextWaitProps],
    endWaiting: () => Unit,
    isWaiting: () => Boolean,
    startWaiting: () => Unit
  ): WaitingContext = {
    val __obj = js.Dynamic.literal(Wait = Wait.asInstanceOf[js.Any], endWaiting = js.Any.fromFunction0(endWaiting), isWaiting = js.Any.fromFunction0(isWaiting), startWaiting = js.Any.fromFunction0(startWaiting))
    __obj.asInstanceOf[WaitingContext]
  }
  @scala.inline
  implicit class WaitingContextOps[Self <: WaitingContext] (val x: Self) extends AnyVal {
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
    def setWait(value: ComponentType[WaitingContextWaitProps]): Self = this.set("Wait", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndWaiting(value: () => Unit): Self = this.set("endWaiting", js.Any.fromFunction0(value))
    @scala.inline
    def setIsWaiting(value: () => Boolean): Self = this.set("isWaiting", js.Any.fromFunction0(value))
    @scala.inline
    def setStartWaiting(value: () => Unit): Self = this.set("startWaiting", js.Any.fromFunction0(value))
  }
  
}


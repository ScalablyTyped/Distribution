package typings.reactMdAlert.messageQueueContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageQueueActions[M /* <: Message */] extends js.Object {
  var hideMessage: HideMessage = js.native
  var popMessage: PopMessage = js.native
  var resetQueue: ResetQueue[M] = js.native
  var restartTimer: RestartVisibilityTimer = js.native
  var startTimer: StartVisibilityTimer = js.native
  var stopTimer: StopVisibilityTimer = js.native
}

object MessageQueueActions {
  @scala.inline
  def apply[/* <: typings.reactMdAlert.messageQueueContextMod.Message */ M](
    hideMessage: () => Unit,
    popMessage: () => Unit,
    resetQueue: () => js.Array[M],
    restartTimer: () => Unit,
    startTimer: () => Unit,
    stopTimer: () => Unit
  ): MessageQueueActions[M] = {
    val __obj = js.Dynamic.literal(hideMessage = js.Any.fromFunction0(hideMessage), popMessage = js.Any.fromFunction0(popMessage), resetQueue = js.Any.fromFunction0(resetQueue), restartTimer = js.Any.fromFunction0(restartTimer), startTimer = js.Any.fromFunction0(startTimer), stopTimer = js.Any.fromFunction0(stopTimer))
    __obj.asInstanceOf[MessageQueueActions[M]]
  }
  @scala.inline
  implicit class MessageQueueActionsOps[Self <: MessageQueueActions[_], /* <: typings.reactMdAlert.messageQueueContextMod.Message */ M] (val x: Self with MessageQueueActions[M]) extends AnyVal {
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
    def setHideMessage(value: () => Unit): Self = this.set("hideMessage", js.Any.fromFunction0(value))
    @scala.inline
    def setPopMessage(value: () => Unit): Self = this.set("popMessage", js.Any.fromFunction0(value))
    @scala.inline
    def setResetQueue(value: () => js.Array[M]): Self = this.set("resetQueue", js.Any.fromFunction0(value))
    @scala.inline
    def setRestartTimer(value: () => Unit): Self = this.set("restartTimer", js.Any.fromFunction0(value))
    @scala.inline
    def setStartTimer(value: () => Unit): Self = this.set("startTimer", js.Any.fromFunction0(value))
    @scala.inline
    def setStopTimer(value: () => Unit): Self = this.set("stopTimer", js.Any.fromFunction0(value))
  }
  
}


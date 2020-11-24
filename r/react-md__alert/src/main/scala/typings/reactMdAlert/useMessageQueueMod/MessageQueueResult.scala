package typings.reactMdAlert.useMessageQueueMod

import typings.reactMdAlert.messageQueueContextMod.AddMessage
import typings.reactMdAlert.messageQueueContextMod.Message
import typings.reactMdAlert.messageQueueContextMod.MessageQueueActions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageQueueResult[M /* <: Message */] extends MessageQueueActions[M] {
  
  var addMessage: AddMessage[M] = js.native
  
  var queue: js.Array[M] = js.native
  
  var visible: Boolean = js.native
}
object MessageQueueResult {
  
  @scala.inline
  def apply[M /* <: Message */](
    addMessage: M => Unit,
    hideMessage: () => Unit,
    popMessage: () => Unit,
    queue: js.Array[M],
    resetQueue: () => js.Array[M],
    restartTimer: () => Unit,
    startTimer: () => Unit,
    stopTimer: () => Unit,
    visible: Boolean
  ): MessageQueueResult[M] = {
    val __obj = js.Dynamic.literal(addMessage = js.Any.fromFunction1(addMessage), hideMessage = js.Any.fromFunction0(hideMessage), popMessage = js.Any.fromFunction0(popMessage), queue = queue.asInstanceOf[js.Any], resetQueue = js.Any.fromFunction0(resetQueue), restartTimer = js.Any.fromFunction0(restartTimer), startTimer = js.Any.fromFunction0(startTimer), stopTimer = js.Any.fromFunction0(stopTimer), visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageQueueResult[M]]
  }
  
  @scala.inline
  implicit class MessageQueueResultOps[Self <: MessageQueueResult[_], M /* <: Message */] (val x: Self with MessageQueueResult[M]) extends AnyVal {
    
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
    def setAddMessage(value: M => Unit): Self = this.set("addMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQueueVarargs(value: M*): Self = this.set("queue", js.Array(value :_*))
    
    @scala.inline
    def setQueue(value: js.Array[M]): Self = this.set("queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
}

package typings.rsmq.mod

import typings.rsmq.rsmqNumbers.`0`
import typings.rsmq.rsmqNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*~ Write your module's methods and properties in this class */
@js.native
trait RedisSMQ extends js.Object {
  
  def changeMessageVisibility(opts: ChangeMessageVisibilityOptions, cb: Callback[`0` | `1`]): Unit = js.native
  
  def changeMessageVisibilityAsync(opts: ChangeMessageVisibilityOptions): js.Promise[`0` | `1`] = js.native
  
  def createQueueAsync(opts: CreateQueueOptions): js.Promise[`1`] = js.native
  
  @JSName("createQueue")
  def createQueue_1(opts: CreateQueueOptions, cb: Callback[`1`]): Unit = js.native
  
  def deleteMessage(opts: DeleteMessageOptions, cb: Callback[`0` | `1`]): Unit = js.native
  
  def deleteMessageAsync(opts: DeleteMessageOptions): js.Promise[`0` | `1`] = js.native
  
  def deleteQueueAsync(opts: DeleteQueueOptions): js.Promise[`1`] = js.native
  
  @JSName("deleteQueue")
  def deleteQueue_1(opts: DeleteQueueOptions, cb: Callback[`1`]): Unit = js.native
  
  def getQueueAttributes(opts: GetQueueAttributesOptions, cb: Callback[QueueAttributes]): Unit = js.native
  
  def getQueueAttributesAsync(opts: GetQueueAttributesOptions): js.Promise[QueueAttributes] = js.native
  
  def listQueues(cb: Callback[js.Array[String]]): Unit = js.native
  
  def listQueuesAsync(): js.Promise[js.Array[String]] = js.native
  
  def popMessage(opts: PopMessageOptions, cb: Callback[QueueMessage | js.Object]): Unit = js.native
  
  def popMessageAsync(opts: PopMessageOptions): js.Promise[QueueMessage | js.Object] = js.native
  
  def quit(): Unit = js.native
  
  def receiveMessage(opts: ReceiveMessageOptions, cb: Callback[QueueMessage | js.Object]): Unit = js.native
  
  def receiveMessageAsync(opts: ReceiveMessageOptions): js.Promise[QueueMessage | js.Object] = js.native
  
  def sendMessage(opts: SendMessageOptions, cb: Callback[String]): Unit = js.native
  
  def sendMessageAsync(opts: SendMessageOptions): js.Promise[String] = js.native
  
  def setQueueAttributes(opts: SetQueueAttributesOptions, cb: Callback[QueueAttributes]): Unit = js.native
  
  def setQueueAttributesAsync(opts: SetQueueAttributesOptions): js.Promise[QueueAttributes] = js.native
}
object RedisSMQ {
  
  @scala.inline
  def apply(
    changeMessageVisibility: (ChangeMessageVisibilityOptions, Callback[`0` | `1`]) => Unit,
    changeMessageVisibilityAsync: ChangeMessageVisibilityOptions => js.Promise[`0` | `1`],
    createQueue: (CreateQueueOptions, Callback[`1`]) => Unit,
    createQueueAsync: CreateQueueOptions => js.Promise[`1`],
    deleteMessage: (DeleteMessageOptions, Callback[`0` | `1`]) => Unit,
    deleteMessageAsync: DeleteMessageOptions => js.Promise[`0` | `1`],
    deleteQueue: (DeleteQueueOptions, Callback[`1`]) => Unit,
    deleteQueueAsync: DeleteQueueOptions => js.Promise[`1`],
    getQueueAttributes: (GetQueueAttributesOptions, Callback[QueueAttributes]) => Unit,
    getQueueAttributesAsync: GetQueueAttributesOptions => js.Promise[QueueAttributes],
    listQueues: Callback[js.Array[String]] => Unit,
    listQueuesAsync: () => js.Promise[js.Array[String]],
    popMessage: (PopMessageOptions, Callback[QueueMessage | js.Object]) => Unit,
    popMessageAsync: PopMessageOptions => js.Promise[QueueMessage | js.Object],
    quit: () => Unit,
    receiveMessage: (ReceiveMessageOptions, Callback[QueueMessage | js.Object]) => Unit,
    receiveMessageAsync: ReceiveMessageOptions => js.Promise[QueueMessage | js.Object],
    sendMessage: (SendMessageOptions, Callback[String]) => Unit,
    sendMessageAsync: SendMessageOptions => js.Promise[String],
    setQueueAttributes: (SetQueueAttributesOptions, Callback[QueueAttributes]) => Unit,
    setQueueAttributesAsync: SetQueueAttributesOptions => js.Promise[QueueAttributes]
  ): RedisSMQ = {
    val __obj = js.Dynamic.literal(changeMessageVisibility = js.Any.fromFunction2(changeMessageVisibility), changeMessageVisibilityAsync = js.Any.fromFunction1(changeMessageVisibilityAsync), createQueue = js.Any.fromFunction2(createQueue), createQueueAsync = js.Any.fromFunction1(createQueueAsync), deleteMessage = js.Any.fromFunction2(deleteMessage), deleteMessageAsync = js.Any.fromFunction1(deleteMessageAsync), deleteQueue = js.Any.fromFunction2(deleteQueue), deleteQueueAsync = js.Any.fromFunction1(deleteQueueAsync), getQueueAttributes = js.Any.fromFunction2(getQueueAttributes), getQueueAttributesAsync = js.Any.fromFunction1(getQueueAttributesAsync), listQueues = js.Any.fromFunction1(listQueues), listQueuesAsync = js.Any.fromFunction0(listQueuesAsync), popMessage = js.Any.fromFunction2(popMessage), popMessageAsync = js.Any.fromFunction1(popMessageAsync), quit = js.Any.fromFunction0(quit), receiveMessage = js.Any.fromFunction2(receiveMessage), receiveMessageAsync = js.Any.fromFunction1(receiveMessageAsync), sendMessage = js.Any.fromFunction2(sendMessage), sendMessageAsync = js.Any.fromFunction1(sendMessageAsync), setQueueAttributes = js.Any.fromFunction2(setQueueAttributes), setQueueAttributesAsync = js.Any.fromFunction1(setQueueAttributesAsync))
    __obj.asInstanceOf[RedisSMQ]
  }
  
  @scala.inline
  implicit class RedisSMQOps[Self <: RedisSMQ] (val x: Self) extends AnyVal {
    
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
    def setChangeMessageVisibility(value: (ChangeMessageVisibilityOptions, Callback[`0` | `1`]) => Unit): Self = this.set("changeMessageVisibility", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChangeMessageVisibilityAsync(value: ChangeMessageVisibilityOptions => js.Promise[`0` | `1`]): Self = this.set("changeMessageVisibilityAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateQueue(value: (CreateQueueOptions, Callback[`1`]) => Unit): Self = this.set("createQueue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateQueueAsync(value: CreateQueueOptions => js.Promise[`1`]): Self = this.set("createQueueAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteMessage(value: (DeleteMessageOptions, Callback[`0` | `1`]) => Unit): Self = this.set("deleteMessage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeleteMessageAsync(value: DeleteMessageOptions => js.Promise[`0` | `1`]): Self = this.set("deleteMessageAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteQueue(value: (DeleteQueueOptions, Callback[`1`]) => Unit): Self = this.set("deleteQueue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeleteQueueAsync(value: DeleteQueueOptions => js.Promise[`1`]): Self = this.set("deleteQueueAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetQueueAttributes(value: (GetQueueAttributesOptions, Callback[QueueAttributes]) => Unit): Self = this.set("getQueueAttributes", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetQueueAttributesAsync(value: GetQueueAttributesOptions => js.Promise[QueueAttributes]): Self = this.set("getQueueAttributesAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setListQueues(value: Callback[js.Array[String]] => Unit): Self = this.set("listQueues", js.Any.fromFunction1(value))
    
    @scala.inline
    def setListQueuesAsync(value: () => js.Promise[js.Array[String]]): Self = this.set("listQueuesAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPopMessage(value: (PopMessageOptions, Callback[QueueMessage | js.Object]) => Unit): Self = this.set("popMessage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPopMessageAsync(value: PopMessageOptions => js.Promise[QueueMessage | js.Object]): Self = this.set("popMessageAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQuit(value: () => Unit): Self = this.set("quit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReceiveMessage(value: (ReceiveMessageOptions, Callback[QueueMessage | js.Object]) => Unit): Self = this.set("receiveMessage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReceiveMessageAsync(value: ReceiveMessageOptions => js.Promise[QueueMessage | js.Object]): Self = this.set("receiveMessageAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSendMessage(value: (SendMessageOptions, Callback[String]) => Unit): Self = this.set("sendMessage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSendMessageAsync(value: SendMessageOptions => js.Promise[String]): Self = this.set("sendMessageAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetQueueAttributes(value: (SetQueueAttributesOptions, Callback[QueueAttributes]) => Unit): Self = this.set("setQueueAttributes", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetQueueAttributesAsync(value: SetQueueAttributesOptions => js.Promise[QueueAttributes]): Self = this.set("setQueueAttributesAsync", js.Any.fromFunction1(value))
  }
}

package typings.rsmq.rsmqMod

import typings.rsmq.rsmqNumbers.`0`
import typings.rsmq.rsmqNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*~ Write your module's methods and properties in this class */
trait RedisSMQ extends js.Object {
  def changeMessageVisibility(opts: ChangeMessageVisibilityOptions, cb: Callback[`0` | `1`]): Unit
  def changeMessageVisibilityAsync(opts: ChangeMessageVisibilityOptions): js.Promise[`0` | `1`]
  def createQueueAsync(opts: CreateQueueOptions): js.Promise[`1`]
  @JSName("createQueue")
  def createQueue_1(opts: CreateQueueOptions, cb: Callback[`1`]): Unit
  def deleteMessage(opts: DeleteMessageOptions, cb: Callback[`0` | `1`]): Unit
  def deleteMessageAsync(opts: DeleteMessageOptions): js.Promise[`0` | `1`]
  def deleteQueueAsync(opts: DeleteQueueOptions): js.Promise[`1`]
  @JSName("deleteQueue")
  def deleteQueue_1(opts: DeleteQueueOptions, cb: Callback[`1`]): Unit
  def getQueueAttributes(opts: GetQueueAttributesOptions, cb: Callback[QueueAttributes]): Unit
  def getQueueAttributesAsync(opts: GetQueueAttributesOptions): js.Promise[QueueAttributes]
  def listQueues(cb: Callback[js.Array[String]]): Unit
  def listQueuesAsync(): js.Promise[js.Array[String]]
  def popMessage(opts: PopMessageOptions, cb: Callback[QueueMessage | js.Object]): Unit
  def popMessageAsync(opts: PopMessageOptions): js.Promise[QueueMessage | js.Object]
  def quit(): Unit
  def receiveMessage(opts: ReceiveMessageOptions, cb: Callback[QueueMessage | js.Object]): Unit
  def receiveMessageAsync(opts: ReceiveMessageOptions): js.Promise[QueueMessage | js.Object]
  def sendMessage(opts: SendMessageOptions, cb: Callback[Double]): Unit
  def sendMessageAsync(opts: SendMessageOptions): js.Promise[Double]
  def setQueueAttributes(opts: SetQueueAttributesOptions, cb: Callback[QueueAttributes]): Unit
  def setQueueAttributesAsync(opts: SetQueueAttributesOptions): js.Promise[QueueAttributes]
}

object RedisSMQ {
  @scala.inline
  def apply(
    changeMessageVisibility: (ChangeMessageVisibilityOptions, Callback[`0` | `1`]) => Unit,
    changeMessageVisibilityAsync: ChangeMessageVisibilityOptions => js.Promise[`0` | `1`],
    createQueueAsync: CreateQueueOptions => js.Promise[`1`],
    createQueue_1: (CreateQueueOptions, Callback[`1`]) => Unit,
    deleteMessage: (DeleteMessageOptions, Callback[`0` | `1`]) => Unit,
    deleteMessageAsync: DeleteMessageOptions => js.Promise[`0` | `1`],
    deleteQueueAsync: DeleteQueueOptions => js.Promise[`1`],
    deleteQueue_1: (DeleteQueueOptions, Callback[`1`]) => Unit,
    getQueueAttributes: (GetQueueAttributesOptions, Callback[QueueAttributes]) => Unit,
    getQueueAttributesAsync: GetQueueAttributesOptions => js.Promise[QueueAttributes],
    listQueues: Callback[js.Array[String]] => Unit,
    listQueuesAsync: () => js.Promise[js.Array[String]],
    popMessage: (PopMessageOptions, Callback[QueueMessage | js.Object]) => Unit,
    popMessageAsync: PopMessageOptions => js.Promise[QueueMessage | js.Object],
    quit: () => Unit,
    receiveMessage: (ReceiveMessageOptions, Callback[QueueMessage | js.Object]) => Unit,
    receiveMessageAsync: ReceiveMessageOptions => js.Promise[QueueMessage | js.Object],
    sendMessage: (SendMessageOptions, Callback[Double]) => Unit,
    sendMessageAsync: SendMessageOptions => js.Promise[Double],
    setQueueAttributes: (SetQueueAttributesOptions, Callback[QueueAttributes]) => Unit,
    setQueueAttributesAsync: SetQueueAttributesOptions => js.Promise[QueueAttributes]
  ): RedisSMQ = {
    val __obj = js.Dynamic.literal(changeMessageVisibility = js.Any.fromFunction2(changeMessageVisibility), changeMessageVisibilityAsync = js.Any.fromFunction1(changeMessageVisibilityAsync), createQueueAsync = js.Any.fromFunction1(createQueueAsync), deleteMessage = js.Any.fromFunction2(deleteMessage), deleteMessageAsync = js.Any.fromFunction1(deleteMessageAsync), deleteQueueAsync = js.Any.fromFunction1(deleteQueueAsync), getQueueAttributes = js.Any.fromFunction2(getQueueAttributes), getQueueAttributesAsync = js.Any.fromFunction1(getQueueAttributesAsync), listQueues = js.Any.fromFunction1(listQueues), listQueuesAsync = js.Any.fromFunction0(listQueuesAsync), popMessage = js.Any.fromFunction2(popMessage), popMessageAsync = js.Any.fromFunction1(popMessageAsync), quit = js.Any.fromFunction0(quit), receiveMessage = js.Any.fromFunction2(receiveMessage), receiveMessageAsync = js.Any.fromFunction1(receiveMessageAsync), sendMessage = js.Any.fromFunction2(sendMessage), sendMessageAsync = js.Any.fromFunction1(sendMessageAsync), setQueueAttributes = js.Any.fromFunction2(setQueueAttributes), setQueueAttributesAsync = js.Any.fromFunction1(setQueueAttributesAsync))
    __obj.updateDynamic("createQueue")(js.Any.fromFunction2(createQueue_1))
    __obj.updateDynamic("deleteQueue")(js.Any.fromFunction2(deleteQueue_1))
    __obj.asInstanceOf[RedisSMQ]
  }
}


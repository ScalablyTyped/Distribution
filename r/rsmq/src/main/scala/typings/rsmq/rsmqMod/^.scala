package typings.rsmq.rsmqMod

import typings.rsmq.rsmqNumbers.`0`
import typings.rsmq.rsmqNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*~ Write your module's methods and properties in this class */
@JSImport("rsmq", JSImport.Namespace)
@js.native
class ^ protected () extends RedisSMQ {
  def this(options: ConstructorOptions) = this()
  /* CompleteClass */
  override def changeMessageVisibility(opts: ChangeMessageVisibilityOptions, cb: Callback[`0` | `1`]): Unit = js.native
  /* CompleteClass */
  override def changeMessageVisibilityAsync(opts: ChangeMessageVisibilityOptions): js.Promise[`0` | `1`] = js.native
  /* CompleteClass */
  override def createQueueAsync(opts: CreateQueueOptions): js.Promise[`1`] = js.native
  /* CompleteClass */
  @JSName("createQueue")
  override def createQueue_1(opts: CreateQueueOptions, cb: Callback[`1`]): Unit = js.native
  /* CompleteClass */
  override def deleteMessage(opts: DeleteMessageOptions, cb: Callback[`0` | `1`]): Unit = js.native
  /* CompleteClass */
  override def deleteMessageAsync(opts: DeleteMessageOptions): js.Promise[`0` | `1`] = js.native
  /* CompleteClass */
  override def deleteQueueAsync(opts: DeleteQueueOptions): js.Promise[`1`] = js.native
  /* CompleteClass */
  @JSName("deleteQueue")
  override def deleteQueue_1(opts: DeleteQueueOptions, cb: Callback[`1`]): Unit = js.native
  /* CompleteClass */
  override def getQueueAttributes(opts: GetQueueAttributesOptions, cb: Callback[QueueAttributes]): Unit = js.native
  /* CompleteClass */
  override def getQueueAttributesAsync(opts: GetQueueAttributesOptions): js.Promise[QueueAttributes] = js.native
  /* CompleteClass */
  override def listQueues(cb: Callback[js.Array[String]]): Unit = js.native
  /* CompleteClass */
  override def listQueuesAsync(): js.Promise[js.Array[String]] = js.native
  /* CompleteClass */
  override def popMessage(opts: PopMessageOptions, cb: Callback[QueueMessage | js.Object]): Unit = js.native
  /* CompleteClass */
  override def popMessageAsync(opts: PopMessageOptions): js.Promise[QueueMessage | js.Object] = js.native
  /* CompleteClass */
  override def quit(): Unit = js.native
  /* CompleteClass */
  override def receiveMessage(opts: ReceiveMessageOptions, cb: Callback[QueueMessage | js.Object]): Unit = js.native
  /* CompleteClass */
  override def receiveMessageAsync(opts: ReceiveMessageOptions): js.Promise[QueueMessage | js.Object] = js.native
  /* CompleteClass */
  override def sendMessage(opts: SendMessageOptions, cb: Callback[Double]): Unit = js.native
  /* CompleteClass */
  override def sendMessageAsync(opts: SendMessageOptions): js.Promise[Double] = js.native
  /* CompleteClass */
  override def setQueueAttributes(opts: SetQueueAttributesOptions, cb: Callback[QueueAttributes]): Unit = js.native
  /* CompleteClass */
  override def setQueueAttributesAsync(opts: SetQueueAttributesOptions): js.Promise[QueueAttributes] = js.native
}


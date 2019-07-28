package typings.rsmq.rsmqMod

import typings.redis.redisMod.RedisClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Client extends js.Object {
  var redis: RedisClient
  def changeMessageVisibility(options: VisibilityOptions, cb: CallbackT[Double]): Unit
  def createQueue(options: QueueOptions, cb: CallbackT[Double]): Unit
  def deleteMessage(options: MessageIdentifier, cb: CallbackT[Double]): Unit
  def deleteQueue(options: QueueIdentifier, cb: CallbackT[Double]): Unit
  def getQueueAttributes(options: QueueIdentifier, cb: CallbackT[QueueAttributes]): Unit
  def listQueues(cb: CallbackT[js.Array[String]]): Unit
  def quit(): Unit
  def receiveMessage(options: ReceiveOptions, cb: CallbackT[Message]): Unit
  def sendMessage(options: NewMessage, cb: CallbackT[String]): Unit
  def setQueueAttributes(options: QueueOptions, cb: CallbackT[QueueAttributes]): Unit
}

object Client {
  @scala.inline
  def apply(
    changeMessageVisibility: (VisibilityOptions, CallbackT[Double]) => Unit,
    createQueue: (QueueOptions, CallbackT[Double]) => Unit,
    deleteMessage: (MessageIdentifier, CallbackT[Double]) => Unit,
    deleteQueue: (QueueIdentifier, CallbackT[Double]) => Unit,
    getQueueAttributes: (QueueIdentifier, CallbackT[QueueAttributes]) => Unit,
    listQueues: CallbackT[js.Array[String]] => Unit,
    quit: () => Unit,
    receiveMessage: (ReceiveOptions, CallbackT[Message]) => Unit,
    redis: RedisClient,
    sendMessage: (NewMessage, CallbackT[String]) => Unit,
    setQueueAttributes: (QueueOptions, CallbackT[QueueAttributes]) => Unit
  ): Client = {
    val __obj = js.Dynamic.literal(changeMessageVisibility = js.Any.fromFunction2(changeMessageVisibility), createQueue = js.Any.fromFunction2(createQueue), deleteMessage = js.Any.fromFunction2(deleteMessage), deleteQueue = js.Any.fromFunction2(deleteQueue), getQueueAttributes = js.Any.fromFunction2(getQueueAttributes), listQueues = js.Any.fromFunction1(listQueues), quit = js.Any.fromFunction0(quit), receiveMessage = js.Any.fromFunction2(receiveMessage), redis = redis, sendMessage = js.Any.fromFunction2(sendMessage), setQueueAttributes = js.Any.fromFunction2(setQueueAttributes))
  
    __obj.asInstanceOf[Client]
  }
}


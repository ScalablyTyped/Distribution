package typings
package rsmqLib.rsmqMod.RedisSMQNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Client extends js.Object {
  def changeMessageVisibility(options: VisibilityOptions, cb: CallbackT[scala.Double]): scala.Unit
  def createQueue(options: QueueOptions, cb: CallbackT[scala.Double]): scala.Unit
  def deleteMessage(options: MessageIdentifier, cb: CallbackT[scala.Double]): scala.Unit
  def deleteQueue(options: QueueIdentifier, cb: CallbackT[scala.Double]): scala.Unit
  def getQueueAttributes(options: QueueIdentifier, cb: CallbackT[QueueAttributes]): scala.Unit
  def listQueues(cb: CallbackT[js.Array[java.lang.String]]): scala.Unit
  def quit(): scala.Unit
  def receiveMessage(options: ReceiveOptions, cb: CallbackT[Message]): scala.Unit
  def sendMessage(options: NewMessage, cb: CallbackT[java.lang.String]): scala.Unit
  def setQueueAttributes(options: QueueOptions, cb: CallbackT[QueueAttributes]): scala.Unit
}

object Client {
  @scala.inline
  def apply(
    changeMessageVisibility: (VisibilityOptions, CallbackT[scala.Double]) => scala.Unit,
    createQueue: (QueueOptions, CallbackT[scala.Double]) => scala.Unit,
    deleteMessage: (MessageIdentifier, CallbackT[scala.Double]) => scala.Unit,
    deleteQueue: (QueueIdentifier, CallbackT[scala.Double]) => scala.Unit,
    getQueueAttributes: (QueueIdentifier, CallbackT[QueueAttributes]) => scala.Unit,
    listQueues: CallbackT[js.Array[java.lang.String]] => scala.Unit,
    quit: () => scala.Unit,
    receiveMessage: (ReceiveOptions, CallbackT[Message]) => scala.Unit,
    sendMessage: (NewMessage, CallbackT[java.lang.String]) => scala.Unit,
    setQueueAttributes: (QueueOptions, CallbackT[QueueAttributes]) => scala.Unit
  ): Client = {
    val __obj = js.Dynamic.literal(changeMessageVisibility = js.Any.fromFunction2(changeMessageVisibility), createQueue = js.Any.fromFunction2(createQueue), deleteMessage = js.Any.fromFunction2(deleteMessage), deleteQueue = js.Any.fromFunction2(deleteQueue), getQueueAttributes = js.Any.fromFunction2(getQueueAttributes), listQueues = js.Any.fromFunction1(listQueues), quit = js.Any.fromFunction0(quit), receiveMessage = js.Any.fromFunction2(receiveMessage), sendMessage = js.Any.fromFunction2(sendMessage), setQueueAttributes = js.Any.fromFunction2(setQueueAttributes))
  
    __obj.asInstanceOf[Client]
  }
}


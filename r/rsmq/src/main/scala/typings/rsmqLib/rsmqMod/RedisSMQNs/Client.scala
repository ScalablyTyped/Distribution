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
    changeMessageVisibility: js.Function2[VisibilityOptions, CallbackT[scala.Double], scala.Unit],
    createQueue: js.Function2[QueueOptions, CallbackT[scala.Double], scala.Unit],
    deleteMessage: js.Function2[MessageIdentifier, CallbackT[scala.Double], scala.Unit],
    deleteQueue: js.Function2[QueueIdentifier, CallbackT[scala.Double], scala.Unit],
    getQueueAttributes: js.Function2[QueueIdentifier, CallbackT[QueueAttributes], scala.Unit],
    listQueues: js.Function1[CallbackT[js.Array[java.lang.String]], scala.Unit],
    quit: js.Function0[scala.Unit],
    receiveMessage: js.Function2[ReceiveOptions, CallbackT[Message], scala.Unit],
    sendMessage: js.Function2[NewMessage, CallbackT[java.lang.String], scala.Unit],
    setQueueAttributes: js.Function2[QueueOptions, CallbackT[QueueAttributes], scala.Unit]
  ): Client = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changeMessageVisibility")(changeMessageVisibility)
    __obj.updateDynamic("createQueue")(createQueue)
    __obj.updateDynamic("deleteMessage")(deleteMessage)
    __obj.updateDynamic("deleteQueue")(deleteQueue)
    __obj.updateDynamic("getQueueAttributes")(getQueueAttributes)
    __obj.updateDynamic("listQueues")(listQueues)
    __obj.updateDynamic("quit")(quit)
    __obj.updateDynamic("receiveMessage")(receiveMessage)
    __obj.updateDynamic("sendMessage")(sendMessage)
    __obj.updateDynamic("setQueueAttributes")(setQueueAttributes)
    __obj.asInstanceOf[Client]
  }
}


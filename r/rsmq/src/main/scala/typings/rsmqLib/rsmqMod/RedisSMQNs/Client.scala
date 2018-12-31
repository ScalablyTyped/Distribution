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


package typings
package rsmqLib.rsmqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsmq", JSImport.Namespace)
@js.native
class namespaced protected () extends Client {
  def this(options: ClientOptions) = this()
  /* CompleteClass */
  override var redis: redisLib.redisMod.RedisClient = js.native
  /* CompleteClass */
  override def changeMessageVisibility(
    options: rsmqLib.rsmqMod.RedisSMQNs.VisibilityOptions,
    cb: rsmqLib.rsmqMod.RedisSMQNs.CallbackT[scala.Double]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def createQueue(
    options: rsmqLib.rsmqMod.RedisSMQNs.QueueOptions,
    cb: rsmqLib.rsmqMod.RedisSMQNs.CallbackT[scala.Double]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def deleteMessage(
    options: rsmqLib.rsmqMod.RedisSMQNs.MessageIdentifier,
    cb: rsmqLib.rsmqMod.RedisSMQNs.CallbackT[scala.Double]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def deleteQueue(
    options: rsmqLib.rsmqMod.RedisSMQNs.QueueIdentifier,
    cb: rsmqLib.rsmqMod.RedisSMQNs.CallbackT[scala.Double]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def getQueueAttributes(
    options: rsmqLib.rsmqMod.RedisSMQNs.QueueIdentifier,
    cb: rsmqLib.rsmqMod.RedisSMQNs.CallbackT[rsmqLib.rsmqMod.RedisSMQNs.QueueAttributes]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def listQueues(cb: rsmqLib.rsmqMod.RedisSMQNs.CallbackT[js.Array[java.lang.String]]): scala.Unit = js.native
  /* CompleteClass */
  override def quit(): scala.Unit = js.native
  /* CompleteClass */
  override def receiveMessage(
    options: rsmqLib.rsmqMod.RedisSMQNs.ReceiveOptions,
    cb: rsmqLib.rsmqMod.RedisSMQNs.CallbackT[rsmqLib.rsmqMod.RedisSMQNs.Message]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def sendMessage(
    options: rsmqLib.rsmqMod.RedisSMQNs.NewMessage,
    cb: rsmqLib.rsmqMod.RedisSMQNs.CallbackT[java.lang.String]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def setQueueAttributes(
    options: rsmqLib.rsmqMod.RedisSMQNs.QueueOptions,
    cb: rsmqLib.rsmqMod.RedisSMQNs.CallbackT[rsmqLib.rsmqMod.RedisSMQNs.QueueAttributes]
  ): scala.Unit = js.native
}


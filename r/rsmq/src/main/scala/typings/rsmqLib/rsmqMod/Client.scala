package typings
package rsmqLib.rsmqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Client
  extends rsmqLib.rsmqMod.RedisSMQNs.Client {
  var redis: redisLib.redisMod.RedisClient
}

object Client {
  @scala.inline
  def apply(
    changeMessageVisibility: (rsmqLib.rsmqMod.RedisSMQNs.VisibilityOptions, rsmqLib.rsmqMod.RedisSMQNs.CallbackT[scala.Double]) => scala.Unit,
    createQueue: (rsmqLib.rsmqMod.RedisSMQNs.QueueOptions, rsmqLib.rsmqMod.RedisSMQNs.CallbackT[scala.Double]) => scala.Unit,
    deleteMessage: (rsmqLib.rsmqMod.RedisSMQNs.MessageIdentifier, rsmqLib.rsmqMod.RedisSMQNs.CallbackT[scala.Double]) => scala.Unit,
    deleteQueue: (rsmqLib.rsmqMod.RedisSMQNs.QueueIdentifier, rsmqLib.rsmqMod.RedisSMQNs.CallbackT[scala.Double]) => scala.Unit,
    getQueueAttributes: (rsmqLib.rsmqMod.RedisSMQNs.QueueIdentifier, rsmqLib.rsmqMod.RedisSMQNs.CallbackT[rsmqLib.rsmqMod.RedisSMQNs.QueueAttributes]) => scala.Unit,
    listQueues: rsmqLib.rsmqMod.RedisSMQNs.CallbackT[js.Array[java.lang.String]] => scala.Unit,
    quit: () => scala.Unit,
    receiveMessage: (rsmqLib.rsmqMod.RedisSMQNs.ReceiveOptions, rsmqLib.rsmqMod.RedisSMQNs.CallbackT[rsmqLib.rsmqMod.RedisSMQNs.Message]) => scala.Unit,
    redis: redisLib.redisMod.RedisClient,
    sendMessage: (rsmqLib.rsmqMod.RedisSMQNs.NewMessage, rsmqLib.rsmqMod.RedisSMQNs.CallbackT[java.lang.String]) => scala.Unit,
    setQueueAttributes: (rsmqLib.rsmqMod.RedisSMQNs.QueueOptions, rsmqLib.rsmqMod.RedisSMQNs.CallbackT[rsmqLib.rsmqMod.RedisSMQNs.QueueAttributes]) => scala.Unit
  ): Client = {
    val __obj = js.Dynamic.literal(changeMessageVisibility = js.Any.fromFunction2(changeMessageVisibility), createQueue = js.Any.fromFunction2(createQueue), deleteMessage = js.Any.fromFunction2(deleteMessage), deleteQueue = js.Any.fromFunction2(deleteQueue), getQueueAttributes = js.Any.fromFunction2(getQueueAttributes), listQueues = js.Any.fromFunction1(listQueues), quit = js.Any.fromFunction0(quit), receiveMessage = js.Any.fromFunction2(receiveMessage), redis = redis, sendMessage = js.Any.fromFunction2(sendMessage), setQueueAttributes = js.Any.fromFunction2(setQueueAttributes))
  
    __obj.asInstanceOf[Client]
  }
}


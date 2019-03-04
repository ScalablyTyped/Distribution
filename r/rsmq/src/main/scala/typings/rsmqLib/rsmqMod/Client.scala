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
    changeMessageVisibility: js.Function2[
      rsmqLib.rsmqMod.RedisSMQNs.VisibilityOptions, 
      rsmqLib.rsmqMod.RedisSMQNs.CallbackT[scala.Double], 
      scala.Unit
    ],
    createQueue: js.Function2[
      rsmqLib.rsmqMod.RedisSMQNs.QueueOptions, 
      rsmqLib.rsmqMod.RedisSMQNs.CallbackT[scala.Double], 
      scala.Unit
    ],
    deleteMessage: js.Function2[
      rsmqLib.rsmqMod.RedisSMQNs.MessageIdentifier, 
      rsmqLib.rsmqMod.RedisSMQNs.CallbackT[scala.Double], 
      scala.Unit
    ],
    deleteQueue: js.Function2[
      rsmqLib.rsmqMod.RedisSMQNs.QueueIdentifier, 
      rsmqLib.rsmqMod.RedisSMQNs.CallbackT[scala.Double], 
      scala.Unit
    ],
    getQueueAttributes: js.Function2[
      rsmqLib.rsmqMod.RedisSMQNs.QueueIdentifier, 
      rsmqLib.rsmqMod.RedisSMQNs.CallbackT[rsmqLib.rsmqMod.RedisSMQNs.QueueAttributes], 
      scala.Unit
    ],
    listQueues: js.Function1[rsmqLib.rsmqMod.RedisSMQNs.CallbackT[js.Array[java.lang.String]], scala.Unit],
    quit: js.Function0[scala.Unit],
    receiveMessage: js.Function2[
      rsmqLib.rsmqMod.RedisSMQNs.ReceiveOptions, 
      rsmqLib.rsmqMod.RedisSMQNs.CallbackT[rsmqLib.rsmqMod.RedisSMQNs.Message], 
      scala.Unit
    ],
    redis: redisLib.redisMod.RedisClient,
    sendMessage: js.Function2[
      rsmqLib.rsmqMod.RedisSMQNs.NewMessage, 
      rsmqLib.rsmqMod.RedisSMQNs.CallbackT[java.lang.String], 
      scala.Unit
    ],
    setQueueAttributes: js.Function2[
      rsmqLib.rsmqMod.RedisSMQNs.QueueOptions, 
      rsmqLib.rsmqMod.RedisSMQNs.CallbackT[rsmqLib.rsmqMod.RedisSMQNs.QueueAttributes], 
      scala.Unit
    ]
  ): Client = {
    val __obj = js.Dynamic.literal(changeMessageVisibility = changeMessageVisibility, createQueue = createQueue, deleteMessage = deleteMessage, deleteQueue = deleteQueue, getQueueAttributes = getQueueAttributes, listQueues = listQueues, quit = quit, receiveMessage = receiveMessage, redis = redis, sendMessage = sendMessage, setQueueAttributes = setQueueAttributes)
  
    __obj.asInstanceOf[Client]
  }
}


package typings.redisClient

import typings.redisClient.distLibCommandsGenericTransformersMod.StreamMessageReply
import typings.redisClient.distLibCommandsGenericTransformersMod.StreamMessagesReply
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsXautoclaimMod {
  
  @JSImport("@redis/client/dist/lib/commands/XAUTOCLAIM", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/XAUTOCLAIM", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(
    key: RedisCommandArgument,
    group: RedisCommandArgument,
    consumer: RedisCommandArgument,
    minIdleTime: Double,
    start: String
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], group.asInstanceOf[js.Any], consumer.asInstanceOf[js.Any], minIdleTime.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(
    key: RedisCommandArgument,
    group: RedisCommandArgument,
    consumer: RedisCommandArgument,
    minIdleTime: Double,
    start: String,
    options: XAutoClaimOptions
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], group.asInstanceOf[js.Any], consumer.asInstanceOf[js.Any], minIdleTime.asInstanceOf[js.Any], start.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: XAutoClaimRawReply): XAutoClaimReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[XAutoClaimReply]
  
  trait XAutoClaimOptions extends StObject {
    
    var COUNT: js.UndefOr[Double] = js.undefined
  }
  object XAutoClaimOptions {
    
    inline def apply(): XAutoClaimOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XAutoClaimOptions]
    }
    
    extension [Self <: XAutoClaimOptions](x: Self) {
      
      inline def setCOUNT(value: Double): Self = StObject.set(x, "COUNT", value.asInstanceOf[js.Any])
      
      inline def setCOUNTUndefined: Self = StObject.set(x, "COUNT", js.undefined)
    }
  }
  
  type XAutoClaimRawReply = js.Tuple2[RedisCommandArgument, js.Array[Any]]
  
  trait XAutoClaimReply extends StObject {
    
    var messages: StreamMessagesReply
    
    var nextId: RedisCommandArgument
  }
  object XAutoClaimReply {
    
    inline def apply(messages: StreamMessagesReply, nextId: RedisCommandArgument): XAutoClaimReply = {
      val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], nextId = nextId.asInstanceOf[js.Any])
      __obj.asInstanceOf[XAutoClaimReply]
    }
    
    extension [Self <: XAutoClaimReply](x: Self) {
      
      inline def setMessages(value: StreamMessagesReply): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesVarargs(value: StreamMessageReply*): Self = StObject.set(x, "messages", js.Array(value*))
      
      inline def setNextId(value: RedisCommandArgument): Self = StObject.set(x, "nextId", value.asInstanceOf[js.Any])
    }
  }
}

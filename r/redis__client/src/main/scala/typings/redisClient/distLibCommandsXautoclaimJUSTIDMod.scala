package typings.redisClient

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.distLibCommandsXautoclaimMod.XAutoClaimOptions
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsXautoclaimJUSTIDMod {
  
  @JSImport("@redis/client/dist/lib/commands/XAUTOCLAIM_JUSTID", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/XAUTOCLAIM_JUSTID", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof transformXAutoClaimArguments> is not an array type */ args: Parameters[
      js.Function6[
        /* key */ RedisCommandArgument, 
        /* group */ RedisCommandArgument, 
        /* consumer */ RedisCommandArgument, 
        /* minIdleTime */ Double, 
        /* start */ String, 
        /* options */ js.UndefOr[XAutoClaimOptions], 
        RedisCommandArguments
      ]
    ]
  ): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(args.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: XAutoClaimJustIdRawReply): XAutoClaimJustIdReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[XAutoClaimJustIdReply]
  
  type XAutoClaimJustIdRawReply = js.Tuple2[RedisCommandArgument, js.Array[RedisCommandArgument]]
  
  trait XAutoClaimJustIdReply extends StObject {
    
    var messages: js.Array[RedisCommandArgument]
    
    var nextId: RedisCommandArgument
  }
  object XAutoClaimJustIdReply {
    
    inline def apply(messages: js.Array[RedisCommandArgument], nextId: RedisCommandArgument): XAutoClaimJustIdReply = {
      val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], nextId = nextId.asInstanceOf[js.Any])
      __obj.asInstanceOf[XAutoClaimJustIdReply]
    }
    
    extension [Self <: XAutoClaimJustIdReply](x: Self) {
      
      inline def setMessages(value: js.Array[RedisCommandArgument]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesVarargs(value: RedisCommandArgument*): Self = StObject.set(x, "messages", js.Array(value*))
      
      inline def setNextId(value: RedisCommandArgument): Self = StObject.set(x, "nextId", value.asInstanceOf[js.Any])
    }
  }
}

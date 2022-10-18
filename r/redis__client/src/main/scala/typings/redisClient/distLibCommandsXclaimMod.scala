package typings.redisClient

import typings.redisClient.distLibCommandsGenericTransformersMod.StreamMessagesReply
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsXclaimMod {
  
  @JSImport("@redis/client/dist/lib/commands/XCLAIM", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/XCLAIM", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(
    key: RedisCommandArgument,
    group: RedisCommandArgument,
    consumer: RedisCommandArgument,
    minIdleTime: Double,
    id: js.Array[RedisCommandArgument]
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], group.asInstanceOf[js.Any], consumer.asInstanceOf[js.Any], minIdleTime.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(
    key: RedisCommandArgument,
    group: RedisCommandArgument,
    consumer: RedisCommandArgument,
    minIdleTime: Double,
    id: js.Array[RedisCommandArgument],
    options: XClaimOptions
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], group.asInstanceOf[js.Any], consumer.asInstanceOf[js.Any], minIdleTime.asInstanceOf[js.Any], id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(
    key: RedisCommandArgument,
    group: RedisCommandArgument,
    consumer: RedisCommandArgument,
    minIdleTime: Double,
    id: RedisCommandArgument
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], group.asInstanceOf[js.Any], consumer.asInstanceOf[js.Any], minIdleTime.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(
    key: RedisCommandArgument,
    group: RedisCommandArgument,
    consumer: RedisCommandArgument,
    minIdleTime: Double,
    id: RedisCommandArgument,
    options: XClaimOptions
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], group.asInstanceOf[js.Any], consumer.asInstanceOf[js.Any], minIdleTime.asInstanceOf[js.Any], id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: js.Array[Any]): StreamMessagesReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[StreamMessagesReply]
  
  trait XClaimOptions extends StObject {
    
    var FORCE: js.UndefOr[`true`] = js.undefined
    
    var IDLE: js.UndefOr[Double] = js.undefined
    
    var RETRYCOUNT: js.UndefOr[Double] = js.undefined
    
    var TIME: js.UndefOr[Double | js.Date] = js.undefined
  }
  object XClaimOptions {
    
    inline def apply(): XClaimOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XClaimOptions]
    }
    
    extension [Self <: XClaimOptions](x: Self) {
      
      inline def setFORCE(value: `true`): Self = StObject.set(x, "FORCE", value.asInstanceOf[js.Any])
      
      inline def setFORCEUndefined: Self = StObject.set(x, "FORCE", js.undefined)
      
      inline def setIDLE(value: Double): Self = StObject.set(x, "IDLE", value.asInstanceOf[js.Any])
      
      inline def setIDLEUndefined: Self = StObject.set(x, "IDLE", js.undefined)
      
      inline def setRETRYCOUNT(value: Double): Self = StObject.set(x, "RETRYCOUNT", value.asInstanceOf[js.Any])
      
      inline def setRETRYCOUNTUndefined: Self = StObject.set(x, "RETRYCOUNT", js.undefined)
      
      inline def setTIME(value: Double | js.Date): Self = StObject.set(x, "TIME", value.asInstanceOf[js.Any])
      
      inline def setTIMEUndefined: Self = StObject.set(x, "TIME", js.undefined)
    }
  }
}

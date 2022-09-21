package typings.redisClient

import typings.redisClient.anon.Id
import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xpendingRANGEMod {
  
  @JSImport("@redis/client/dist/lib/commands/XPENDING_RANGE", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/XPENDING_RANGE", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/client/dist/lib/commands/XPENDING_RANGE", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key: RedisCommandArgument, group: RedisCommandArgument, start: String, end: String, count: Double): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], group.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(
    key: RedisCommandArgument,
    group: RedisCommandArgument,
    start: String,
    end: String,
    count: Double,
    options: XPendingRangeOptions
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], group.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], count.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: XPendingRangeRawReply): XPendingRangeReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[XPendingRangeReply]
  
  trait XPendingRangeOptions extends StObject {
    
    var IDLE: js.UndefOr[Double] = js.undefined
    
    var consumer: js.UndefOr[RedisCommandArgument] = js.undefined
  }
  object XPendingRangeOptions {
    
    inline def apply(): XPendingRangeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XPendingRangeOptions]
    }
    
    extension [Self <: XPendingRangeOptions](x: Self) {
      
      inline def setConsumer(value: RedisCommandArgument): Self = StObject.set(x, "consumer", value.asInstanceOf[js.Any])
      
      inline def setConsumerUndefined: Self = StObject.set(x, "consumer", js.undefined)
      
      inline def setIDLE(value: Double): Self = StObject.set(x, "IDLE", value.asInstanceOf[js.Any])
      
      inline def setIDLEUndefined: Self = StObject.set(x, "IDLE", js.undefined)
    }
  }
  
  type XPendingRangeRawReply = js.Array[
    js.Tuple4[
      /* id */ RedisCommandArgument, 
      /* consumer */ RedisCommandArgument, 
      /* millisecondsSinceLastDelivery */ Double, 
      /* deliveriesCounter */ Double
    ]
  ]
  
  type XPendingRangeReply = js.Array[Id]
}

package typings.redisClient

import typings.redisClient.distLibCommandsGenericTransformersMod.StreamMessagesReply
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsXrangeMod {
  
  @JSImport("@redis/client/dist/lib/commands/XRANGE", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/XRANGE", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/client/dist/lib/commands/XRANGE", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key: RedisCommandArgument, start: RedisCommandArgument, end: RedisCommandArgument): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(
    key: RedisCommandArgument,
    start: RedisCommandArgument,
    end: RedisCommandArgument,
    options: XRangeOptions
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: js.Array[Any]): StreamMessagesReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[StreamMessagesReply]
  
  trait XRangeOptions extends StObject {
    
    var COUNT: js.UndefOr[Double] = js.undefined
  }
  object XRangeOptions {
    
    inline def apply(): XRangeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XRangeOptions]
    }
    
    extension [Self <: XRangeOptions](x: Self) {
      
      inline def setCOUNT(value: Double): Self = StObject.set(x, "COUNT", value.asInstanceOf[js.Any])
      
      inline def setCOUNTUndefined: Self = StObject.set(x, "COUNT", js.undefined)
    }
  }
}

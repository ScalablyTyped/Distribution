package typings.redisClient

import typings.redisClient.distLibCommandsGenericTransformersMod.StreamsMessagesReply
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsXreadgroupMod {
  
  @JSImport("@redis/client/dist/lib/commands/XREADGROUP", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FIRST_KEY_INDEX(_group: RedisCommandArgument, _consumer: RedisCommandArgument, streams: js.Array[XReadGroupStream]): RedisCommandArgument = (^.asInstanceOf[js.Dynamic].applyDynamic("FIRST_KEY_INDEX")(_group.asInstanceOf[js.Any], _consumer.asInstanceOf[js.Any], streams.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArgument]
  inline def FIRST_KEY_INDEX(_group: RedisCommandArgument, _consumer: RedisCommandArgument, streams: XReadGroupStream): RedisCommandArgument = (^.asInstanceOf[js.Dynamic].applyDynamic("FIRST_KEY_INDEX")(_group.asInstanceOf[js.Any], _consumer.asInstanceOf[js.Any], streams.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArgument]
  
  @JSImport("@redis/client/dist/lib/commands/XREADGROUP", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(group: RedisCommandArgument, consumer: RedisCommandArgument, streams: js.Array[XReadGroupStream]): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(group.asInstanceOf[js.Any], consumer.asInstanceOf[js.Any], streams.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(
    group: RedisCommandArgument,
    consumer: RedisCommandArgument,
    streams: js.Array[XReadGroupStream],
    options: XReadGroupOptions
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(group.asInstanceOf[js.Any], consumer.asInstanceOf[js.Any], streams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(group: RedisCommandArgument, consumer: RedisCommandArgument, streams: XReadGroupStream): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(group.asInstanceOf[js.Any], consumer.asInstanceOf[js.Any], streams.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(
    group: RedisCommandArgument,
    consumer: RedisCommandArgument,
    streams: XReadGroupStream,
    options: XReadGroupOptions
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(group.asInstanceOf[js.Any], consumer.asInstanceOf[js.Any], streams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): StreamsMessagesReply | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[StreamsMessagesReply | Null]
  inline def transformReply(reply: js.Array[Any]): StreamsMessagesReply | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[StreamsMessagesReply | Null]
  
  trait XReadGroupOptions extends StObject {
    
    var BLOCK: js.UndefOr[Double] = js.undefined
    
    var COUNT: js.UndefOr[Double] = js.undefined
    
    var NOACK: js.UndefOr[`true`] = js.undefined
  }
  object XReadGroupOptions {
    
    inline def apply(): XReadGroupOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XReadGroupOptions]
    }
    
    extension [Self <: XReadGroupOptions](x: Self) {
      
      inline def setBLOCK(value: Double): Self = StObject.set(x, "BLOCK", value.asInstanceOf[js.Any])
      
      inline def setBLOCKUndefined: Self = StObject.set(x, "BLOCK", js.undefined)
      
      inline def setCOUNT(value: Double): Self = StObject.set(x, "COUNT", value.asInstanceOf[js.Any])
      
      inline def setCOUNTUndefined: Self = StObject.set(x, "COUNT", js.undefined)
      
      inline def setNOACK(value: `true`): Self = StObject.set(x, "NOACK", value.asInstanceOf[js.Any])
      
      inline def setNOACKUndefined: Self = StObject.set(x, "NOACK", js.undefined)
    }
  }
  
  trait XReadGroupStream extends StObject {
    
    var id: RedisCommandArgument
    
    var key: RedisCommandArgument
  }
  object XReadGroupStream {
    
    inline def apply(id: RedisCommandArgument, key: RedisCommandArgument): XReadGroupStream = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[XReadGroupStream]
    }
    
    extension [Self <: XReadGroupStream](x: Self) {
      
      inline def setId(value: RedisCommandArgument): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKey(value: RedisCommandArgument): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
}

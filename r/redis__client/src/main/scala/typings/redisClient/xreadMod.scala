package typings.redisClient

import typings.redisClient.genericTransformersMod.StreamsMessagesReply
import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xreadMod {
  
  @JSImport("@redis/client/dist/lib/commands/XREAD", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FIRST_KEY_INDEX(streams: js.Array[XReadStream]): RedisCommandArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("FIRST_KEY_INDEX")(streams.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArgument]
  inline def FIRST_KEY_INDEX(streams: XReadStream): RedisCommandArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("FIRST_KEY_INDEX")(streams.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArgument]
  
  @JSImport("@redis/client/dist/lib/commands/XREAD", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(streams: js.Array[XReadStream]): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(streams.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(streams: js.Array[XReadStream], options: XReadOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(streams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(streams: XReadStream): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(streams.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(streams: XReadStream, options: XReadOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(streams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): StreamsMessagesReply | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[StreamsMessagesReply | Null]
  inline def transformReply(reply: js.Array[Any]): StreamsMessagesReply | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[StreamsMessagesReply | Null]
  
  trait XReadOptions extends StObject {
    
    var BLOCK: js.UndefOr[Double] = js.undefined
    
    var COUNT: js.UndefOr[Double] = js.undefined
  }
  object XReadOptions {
    
    inline def apply(): XReadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XReadOptions]
    }
    
    extension [Self <: XReadOptions](x: Self) {
      
      inline def setBLOCK(value: Double): Self = StObject.set(x, "BLOCK", value.asInstanceOf[js.Any])
      
      inline def setBLOCKUndefined: Self = StObject.set(x, "BLOCK", js.undefined)
      
      inline def setCOUNT(value: Double): Self = StObject.set(x, "COUNT", value.asInstanceOf[js.Any])
      
      inline def setCOUNTUndefined: Self = StObject.set(x, "COUNT", js.undefined)
    }
  }
  
  trait XReadStream extends StObject {
    
    var id: RedisCommandArgument
    
    var key: RedisCommandArgument
  }
  object XReadStream {
    
    inline def apply(id: RedisCommandArgument, key: RedisCommandArgument): XReadStream = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[XReadStream]
    }
    
    extension [Self <: XReadStream](x: Self) {
      
      inline def setId(value: RedisCommandArgument): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKey(value: RedisCommandArgument): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
}

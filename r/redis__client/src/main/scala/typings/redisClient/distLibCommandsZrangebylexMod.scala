package typings.redisClient

import typings.redisClient.anon.Count
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsZrangebylexMod {
  
  @JSImport("@redis/client/dist/lib/commands/ZRANGEBYLEX", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/ZRANGEBYLEX", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/client/dist/lib/commands/ZRANGEBYLEX", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key: RedisCommandArgument, min: RedisCommandArgument, max: RedisCommandArgument): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(
    key: RedisCommandArgument,
    min: RedisCommandArgument,
    max: RedisCommandArgument,
    options: ZRangeByLexOptions
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): js.Array[RedisCommandArgument] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[js.Array[RedisCommandArgument]]
  
  trait ZRangeByLexOptions extends StObject {
    
    var LIMIT: js.UndefOr[Count] = js.undefined
  }
  object ZRangeByLexOptions {
    
    inline def apply(): ZRangeByLexOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZRangeByLexOptions]
    }
    
    extension [Self <: ZRangeByLexOptions](x: Self) {
      
      inline def setLIMIT(value: Count): Self = StObject.set(x, "LIMIT", value.asInstanceOf[js.Any])
      
      inline def setLIMITUndefined: Self = StObject.set(x, "LIMIT", js.undefined)
    }
  }
}

package typings.redisClient

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientStrings.MAX
import typings.redisClient.redisClientStrings.MIN
import typings.redisClient.redisClientStrings.SUM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsZinterstoreMod {
  
  @JSImport("@redis/client/dist/lib/commands/ZINTERSTORE", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/ZINTERSTORE", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(destination: RedisCommandArgument, keys: js.Array[RedisCommandArgument]): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(destination.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(
    destination: RedisCommandArgument,
    keys: js.Array[RedisCommandArgument],
    options: ZInterStoreOptions
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(destination.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(destination: RedisCommandArgument, keys: RedisCommandArgument): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(destination.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(destination: RedisCommandArgument, keys: RedisCommandArgument, options: ZInterStoreOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(destination.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[Double]
  
  trait ZInterStoreOptions extends StObject {
    
    var AGGREGATE: js.UndefOr[SUM | MIN | MAX] = js.undefined
    
    var WEIGHTS: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object ZInterStoreOptions {
    
    inline def apply(): ZInterStoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZInterStoreOptions]
    }
    
    extension [Self <: ZInterStoreOptions](x: Self) {
      
      inline def setAGGREGATE(value: SUM | MIN | MAX): Self = StObject.set(x, "AGGREGATE", value.asInstanceOf[js.Any])
      
      inline def setAGGREGATEUndefined: Self = StObject.set(x, "AGGREGATE", js.undefined)
      
      inline def setWEIGHTS(value: js.Array[Double]): Self = StObject.set(x, "WEIGHTS", value.asInstanceOf[js.Any])
      
      inline def setWEIGHTSUndefined: Self = StObject.set(x, "WEIGHTS", js.undefined)
      
      inline def setWEIGHTSVarargs(value: Double*): Self = StObject.set(x, "WEIGHTS", js.Array(value*))
    }
  }
}

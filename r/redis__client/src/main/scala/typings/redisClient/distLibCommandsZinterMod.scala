package typings.redisClient

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientStrings.MAX
import typings.redisClient.redisClientStrings.MIN
import typings.redisClient.redisClientStrings.SUM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsZinterMod {
  
  @JSImport("@redis/client/dist/lib/commands/ZINTER", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/ZINTER", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 2 */ Double = js.native
  
  @JSImport("@redis/client/dist/lib/commands/ZINTER", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(keys: js.Array[RedisCommandArgument]): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(keys.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(keys: js.Array[RedisCommandArgument], options: ZInterOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(keys.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(keys: RedisCommandArgument): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(keys.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(keys: RedisCommandArgument, options: ZInterOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(keys.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): js.Array[RedisCommandArgument] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[js.Array[RedisCommandArgument]]
  
  trait ZInterOptions extends StObject {
    
    var AGGREGATE: js.UndefOr[SUM | MIN | MAX] = js.undefined
    
    var WEIGHTS: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object ZInterOptions {
    
    inline def apply(): ZInterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZInterOptions]
    }
    
    extension [Self <: ZInterOptions](x: Self) {
      
      inline def setAGGREGATE(value: SUM | MIN | MAX): Self = StObject.set(x, "AGGREGATE", value.asInstanceOf[js.Any])
      
      inline def setAGGREGATEUndefined: Self = StObject.set(x, "AGGREGATE", js.undefined)
      
      inline def setWEIGHTS(value: js.Array[Double]): Self = StObject.set(x, "WEIGHTS", value.asInstanceOf[js.Any])
      
      inline def setWEIGHTSUndefined: Self = StObject.set(x, "WEIGHTS", js.undefined)
      
      inline def setWEIGHTSVarargs(value: Double*): Self = StObject.set(x, "WEIGHTS", js.Array(value*))
    }
  }
}

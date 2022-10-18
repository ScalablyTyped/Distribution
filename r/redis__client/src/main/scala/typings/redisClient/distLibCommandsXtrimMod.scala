package typings.redisClient

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientStrings.Equalssign
import typings.redisClient.redisClientStrings.MAXLEN
import typings.redisClient.redisClientStrings.MINID
import typings.redisClient.redisClientStrings.Tilde
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsXtrimMod {
  
  @JSImport("@redis/client/dist/lib/commands/XTRIM", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/XTRIM", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(key: RedisCommandArgument, strategy: MAXLEN | MINID, threshold: Double): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(key: RedisCommandArgument, strategy: MAXLEN | MINID, threshold: Double, options: XTrimOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[Double]
  
  trait XTrimOptions extends StObject {
    
    var LIMIT: js.UndefOr[Double] = js.undefined
    
    var strategyModifier: js.UndefOr[Equalssign | Tilde] = js.undefined
  }
  object XTrimOptions {
    
    inline def apply(): XTrimOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XTrimOptions]
    }
    
    extension [Self <: XTrimOptions](x: Self) {
      
      inline def setLIMIT(value: Double): Self = StObject.set(x, "LIMIT", value.asInstanceOf[js.Any])
      
      inline def setLIMITUndefined: Self = StObject.set(x, "LIMIT", js.undefined)
      
      inline def setStrategyModifier(value: Equalssign | Tilde): Self = StObject.set(x, "strategyModifier", value.asInstanceOf[js.Any])
      
      inline def setStrategyModifierUndefined: Self = StObject.set(x, "strategyModifier", js.undefined)
    }
  }
}

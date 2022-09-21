package typings.redisClient

import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lposMod {
  
  @JSImport("@redis/client/dist/lib/commands/LPOS", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/LPOS", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/client/dist/lib/commands/LPOS", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key: RedisCommandArgument, element: RedisCommandArgument): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(key: RedisCommandArgument, element: RedisCommandArgument, options: LPosOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[Double | Null]
  
  trait LPosOptions extends StObject {
    
    var MAXLEN: js.UndefOr[Double] = js.undefined
    
    var RANK: js.UndefOr[Double] = js.undefined
  }
  object LPosOptions {
    
    inline def apply(): LPosOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LPosOptions]
    }
    
    extension [Self <: LPosOptions](x: Self) {
      
      inline def setMAXLEN(value: Double): Self = StObject.set(x, "MAXLEN", value.asInstanceOf[js.Any])
      
      inline def setMAXLENUndefined: Self = StObject.set(x, "MAXLEN", js.undefined)
      
      inline def setRANK(value: Double): Self = StObject.set(x, "RANK", value.asInstanceOf[js.Any])
      
      inline def setRANKUndefined: Self = StObject.set(x, "RANK", js.undefined)
    }
  }
}

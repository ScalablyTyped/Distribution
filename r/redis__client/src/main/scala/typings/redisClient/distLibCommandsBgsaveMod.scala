package typings.redisClient

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsBgsaveMod {
  
  @JSImport("@redis/client/dist/lib/commands/BGSAVE", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")().asInstanceOf[RedisCommandArguments]
  inline def transformArguments(options: BgSaveOptions): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(options.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): RedisCommandArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[RedisCommandArgument]
  
  trait BgSaveOptions extends StObject {
    
    var SCHEDULE: js.UndefOr[`true`] = js.undefined
  }
  object BgSaveOptions {
    
    inline def apply(): BgSaveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BgSaveOptions]
    }
    
    extension [Self <: BgSaveOptions](x: Self) {
      
      inline def setSCHEDULE(value: `true`): Self = StObject.set(x, "SCHEDULE", value.asInstanceOf[js.Any])
      
      inline def setSCHEDULEUndefined: Self = StObject.set(x, "SCHEDULE", js.undefined)
    }
  }
}

package typings.redisClient

import typings.redisClient.anon.Limit
import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientBooleans.`true`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xaddMod {
  
  @JSImport("@redis/client/dist/lib/commands/XADD", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/XADD", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(key: RedisCommandArgument, id: RedisCommandArgument, message: Record[String, RedisCommandArgument]): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], id.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(
    key: RedisCommandArgument,
    id: RedisCommandArgument,
    message: Record[String, RedisCommandArgument],
    options: XAddOptions
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], id.asInstanceOf[js.Any], message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[String]
  
  trait XAddOptions extends StObject {
    
    var NOMKSTREAM: js.UndefOr[`true`] = js.undefined
    
    var TRIM: js.UndefOr[Limit] = js.undefined
  }
  object XAddOptions {
    
    inline def apply(): XAddOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XAddOptions]
    }
    
    extension [Self <: XAddOptions](x: Self) {
      
      inline def setNOMKSTREAM(value: `true`): Self = StObject.set(x, "NOMKSTREAM", value.asInstanceOf[js.Any])
      
      inline def setNOMKSTREAMUndefined: Self = StObject.set(x, "NOMKSTREAM", js.undefined)
      
      inline def setTRIM(value: Limit): Self = StObject.set(x, "TRIM", value.asInstanceOf[js.Any])
      
      inline def setTRIMUndefined: Self = StObject.set(x, "TRIM", js.undefined)
    }
  }
}

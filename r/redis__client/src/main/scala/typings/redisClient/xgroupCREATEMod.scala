package typings.redisClient

import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xgroupCREATEMod {
  
  @JSImport("@redis/client/dist/lib/commands/XGROUP_CREATE", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/XGROUP_CREATE", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 2 */ Double = js.native
  
  inline def transformArguments(key: RedisCommandArgument, group: RedisCommandArgument, id: RedisCommandArgument): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], group.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(
    key: RedisCommandArgument,
    group: RedisCommandArgument,
    id: RedisCommandArgument,
    options: XGroupCreateOptions
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], group.asInstanceOf[js.Any], id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): RedisCommandArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[RedisCommandArgument]
  
  trait XGroupCreateOptions extends StObject {
    
    var MKSTREAM: js.UndefOr[`true`] = js.undefined
  }
  object XGroupCreateOptions {
    
    inline def apply(): XGroupCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XGroupCreateOptions]
    }
    
    extension [Self <: XGroupCreateOptions](x: Self) {
      
      inline def setMKSTREAM(value: `true`): Self = StObject.set(x, "MKSTREAM", value.asInstanceOf[js.Any])
      
      inline def setMKSTREAMUndefined: Self = StObject.set(x, "MKSTREAM", js.undefined)
    }
  }
}

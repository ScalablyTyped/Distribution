package typings.redisClient

import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisClient.xclaimMod.XClaimOptions
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xclaimJUSTIDMod {
  
  @JSImport("@redis/client/dist/lib/commands/XCLAIM_JUSTID", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/XCLAIM_JUSTID", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof transformXClaimArguments> is not an array type */ args: Parameters[
      js.Function6[
        /* key */ RedisCommandArgument, 
        /* group */ RedisCommandArgument, 
        /* consumer */ RedisCommandArgument, 
        /* minIdleTime */ Double, 
        /* id */ RedisCommandArgument | js.Array[RedisCommandArgument], 
        /* options */ js.UndefOr[XClaimOptions], 
        RedisCommandArguments
      ]
    ]
  ): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(args.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): js.Array[RedisCommandArgument] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[js.Array[RedisCommandArgument]]
}

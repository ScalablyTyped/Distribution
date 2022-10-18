package typings.redisClient

import typings.redisClient.distLibCommandsGenericTransformersMod.ZMember
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.distLibCommandsZinterMod.ZInterOptions
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsZinterWITHSCORESMod {
  
  @JSImport("@redis/client/dist/lib/commands/ZINTER_WITHSCORES", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/ZINTER_WITHSCORES", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 2 */ Double = js.native
  
  @JSImport("@redis/client/dist/lib/commands/ZINTER_WITHSCORES", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof transformZInterArguments> is not an array type */ args: Parameters[
      js.Function2[
        /* keys */ js.Array[RedisCommandArgument] | RedisCommandArgument, 
        /* options */ js.UndefOr[ZInterOptions], 
        RedisCommandArguments
      ]
    ]
  ): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(args.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: js.Array[RedisCommandArgument]): js.Array[ZMember] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[js.Array[ZMember]]
}

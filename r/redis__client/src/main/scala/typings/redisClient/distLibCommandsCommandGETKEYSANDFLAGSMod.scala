package typings.redisClient

import typings.redisClient.anon.Flags
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsCommandGETKEYSANDFLAGSMod {
  
  @JSImport("@redis/client/dist/lib/commands/COMMAND_GETKEYSANDFLAGS", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/COMMAND_GETKEYSANDFLAGS", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(args: js.Array[RedisCommandArgument]): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(args.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: KeysAndFlagsRawReply): KeysAndFlagsReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[KeysAndFlagsReply]
  
  type KeysAndFlagsRawReply = js.Array[js.Tuple2[RedisCommandArgument, RedisCommandArguments]]
  
  type KeysAndFlagsReply = js.Array[Flags]
}

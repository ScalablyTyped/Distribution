package typings.redisClient

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsAclDRYRUNMod {
  
  @JSImport("@redis/client/dist/lib/commands/ACL_DRYRUN", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/ACL_DRYRUN", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(username: RedisCommandArgument, command: js.Array[RedisCommandArgument]): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(username.asInstanceOf[js.Any], command.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): RedisCommandArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[RedisCommandArgument]
}

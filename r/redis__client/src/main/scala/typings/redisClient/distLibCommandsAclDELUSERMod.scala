package typings.redisClient

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsAclDELUSERMod {
  
  @JSImport("@redis/client/dist/lib/commands/ACL_DELUSER", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(username: js.Array[RedisCommandArgument]): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(username.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(username: RedisCommandArgument): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(username.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[Double]
}

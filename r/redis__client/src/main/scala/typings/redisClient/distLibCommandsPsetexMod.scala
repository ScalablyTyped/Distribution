package typings.redisClient

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsPsetexMod {
  
  @JSImport("@redis/client/dist/lib/commands/PSETEX", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/PSETEX", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(key: RedisCommandArgument, milliseconds: Double, value: RedisCommandArgument): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): RedisCommandArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[RedisCommandArgument]
}

package typings.redisClient

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsSintercardMod {
  
  @JSImport("@redis/client/dist/lib/commands/SINTERCARD", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/SINTERCARD", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 2 */ Double = js.native
  
  @JSImport("@redis/client/dist/lib/commands/SINTERCARD", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(keys: js.Array[RedisCommandArgument]): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(keys.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(keys: js.Array[RedisCommandArgument], limit: Double): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(keys.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(keys: RedisCommandArgument): RedisCommandArguments = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(keys.asInstanceOf[js.Any]).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(keys: RedisCommandArgument, limit: Double): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(keys.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[Double]
}

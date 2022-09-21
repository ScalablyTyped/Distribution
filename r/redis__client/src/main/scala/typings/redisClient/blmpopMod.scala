package typings.redisClient

import typings.redisClient.genericTransformersMod.LMPopOptions
import typings.redisClient.genericTransformersMod.ListSide
import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blmpopMod {
  
  @JSImport("@redis/client/dist/lib/commands/BLMPOP", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/BLMPOP", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 3 */ Double = js.native
  
  inline def transformArguments(timeout: Double, keys: js.Array[RedisCommandArgument], side: ListSide): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(timeout.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], side.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(timeout: Double, keys: js.Array[RedisCommandArgument], side: ListSide, options: LMPopOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(timeout.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], side.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(timeout: Double, keys: RedisCommandArgument, side: ListSide): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(timeout.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], side.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(timeout: Double, keys: RedisCommandArgument, side: ListSide, options: LMPopOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(timeout.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], side.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): Null | (js.Tuple2[/* key */ String, /* elements */ js.Array[String]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[Null | (js.Tuple2[/* key */ String, /* elements */ js.Array[String]])]
}

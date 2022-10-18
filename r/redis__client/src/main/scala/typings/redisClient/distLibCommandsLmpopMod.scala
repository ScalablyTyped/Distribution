package typings.redisClient

import typings.redisClient.distLibCommandsGenericTransformersMod.LMPopOptions
import typings.redisClient.distLibCommandsGenericTransformersMod.ListSide
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsLmpopMod {
  
  @JSImport("@redis/client/dist/lib/commands/LMPOP", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/LMPOP", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 2 */ Double = js.native
  
  inline def transformArguments(keys: js.Array[RedisCommandArgument], side: ListSide): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(keys.asInstanceOf[js.Any], side.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(keys: js.Array[RedisCommandArgument], side: ListSide, options: LMPopOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(keys.asInstanceOf[js.Any], side.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(keys: RedisCommandArgument, side: ListSide): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(keys.asInstanceOf[js.Any], side.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(keys: RedisCommandArgument, side: ListSide, options: LMPopOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(keys.asInstanceOf[js.Any], side.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): Null | (js.Tuple2[/* key */ String, /* elements */ js.Array[String]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[Null | (js.Tuple2[/* key */ String, /* elements */ js.Array[String]])]
}

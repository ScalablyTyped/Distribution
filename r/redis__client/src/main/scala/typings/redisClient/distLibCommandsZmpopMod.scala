package typings.redisClient

import typings.redisClient.anon.Elements
import typings.redisClient.distLibCommandsGenericTransformersMod.SortedSetSide
import typings.redisClient.distLibCommandsGenericTransformersMod.ZMPopOptions
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsZmpopMod {
  
  @JSImport("@redis/client/dist/lib/commands/ZMPOP", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/ZMPOP", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 2 */ Double = js.native
  
  inline def transformArguments(keys: js.Array[RedisCommandArgument], side: SortedSetSide): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(keys.asInstanceOf[js.Any], side.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(keys: js.Array[RedisCommandArgument], side: SortedSetSide, options: ZMPopOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(keys.asInstanceOf[js.Any], side.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(keys: RedisCommandArgument, side: SortedSetSide): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(keys.asInstanceOf[js.Any], side.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(keys: RedisCommandArgument, side: SortedSetSide, options: ZMPopOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(keys.asInstanceOf[js.Any], side.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: ZMPopRawReply): ZMPopReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[ZMPopReply]
  
  type ZMPopRawReply = Null | (js.Tuple2[
    /* key */ String, 
    /* elements */ js.Array[js.Tuple2[RedisCommandArgument, RedisCommandArgument]]
  ])
  
  type ZMPopReply = Null | Elements
}

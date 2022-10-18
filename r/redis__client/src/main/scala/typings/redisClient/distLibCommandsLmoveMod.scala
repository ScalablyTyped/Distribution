package typings.redisClient

import typings.redisClient.distLibCommandsGenericTransformersMod.ListSide
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsLmoveMod {
  
  @JSImport("@redis/client/dist/lib/commands/LMOVE", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/LMOVE", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(
    source: RedisCommandArgument,
    destination: RedisCommandArgument,
    sourceSide: ListSide,
    destinationSide: ListSide
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], sourceSide.asInstanceOf[js.Any], destinationSide.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): RedisCommandArgument | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[RedisCommandArgument | Null]
}

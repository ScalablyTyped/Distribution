package typings.redisClient

import typings.redisClient.distLibCommandsGenericTransformersMod.GeoUnits
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsGeodistMod {
  
  @JSImport("@redis/client/dist/lib/commands/GEODIST", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/GEODIST", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/client/dist/lib/commands/GEODIST", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key: RedisCommandArgument, member1: RedisCommandArgument, member2: RedisCommandArgument): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], member1.asInstanceOf[js.Any], member2.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(
    key: RedisCommandArgument,
    member1: RedisCommandArgument,
    member2: RedisCommandArgument,
    unit: GeoUnits
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], member1.asInstanceOf[js.Any], member2.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[Double | Null]
  inline def transformReply(reply: RedisCommandArgument): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
}

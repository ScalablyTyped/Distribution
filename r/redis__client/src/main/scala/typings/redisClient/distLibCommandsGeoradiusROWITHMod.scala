package typings.redisClient

import typings.redisClient.distLibCommandsGenericTransformersMod.GeoCoordinates
import typings.redisClient.distLibCommandsGenericTransformersMod.GeoReplyWith
import typings.redisClient.distLibCommandsGenericTransformersMod.GeoReplyWithMember
import typings.redisClient.distLibCommandsGenericTransformersMod.GeoSearchOptions
import typings.redisClient.distLibCommandsGenericTransformersMod.GeoUnits
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsGeoradiusROWITHMod {
  
  @JSImport("@redis/client/dist/lib/commands/GEORADIUS_RO_WITH", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/GEORADIUS_RO_WITH", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/client/dist/lib/commands/GEORADIUS_RO_WITH", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(
    key: RedisCommandArgument,
    coordinates: GeoCoordinates,
    radius: Double,
    unit: GeoUnits,
    replyWith: js.Array[GeoReplyWith]
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], coordinates.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], replyWith.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(
    key: RedisCommandArgument,
    coordinates: GeoCoordinates,
    radius: Double,
    unit: GeoUnits,
    replyWith: js.Array[GeoReplyWith],
    options: GeoSearchOptions
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], coordinates.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], replyWith.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: js.Array[js.Array[Any]], replyWith: js.Array[GeoReplyWith]): js.Array[GeoReplyWithMember] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any], replyWith.asInstanceOf[js.Any])).asInstanceOf[js.Array[GeoReplyWithMember]]
}

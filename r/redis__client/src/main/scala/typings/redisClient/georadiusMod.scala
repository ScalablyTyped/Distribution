package typings.redisClient

import typings.redisClient.genericTransformersMod.GeoCoordinates
import typings.redisClient.genericTransformersMod.GeoSearchOptions
import typings.redisClient.genericTransformersMod.GeoUnits
import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object georadiusMod {
  
  @JSImport("@redis/client/dist/lib/commands/GEORADIUS", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/GEORADIUS", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/client/dist/lib/commands/GEORADIUS", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key: RedisCommandArgument, coordinates: GeoCoordinates, radius: Double, unit: GeoUnits): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], coordinates.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(
    key: RedisCommandArgument,
    coordinates: GeoCoordinates,
    radius: Double,
    unit: GeoUnits,
    options: GeoSearchOptions
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], coordinates.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): js.Array[RedisCommandArgument] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[js.Array[RedisCommandArgument]]
}

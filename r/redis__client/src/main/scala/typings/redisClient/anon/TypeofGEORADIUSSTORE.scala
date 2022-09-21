package typings.redisClient.anon

import typings.redisClient.genericTransformersMod.GeoCoordinates
import typings.redisClient.genericTransformersMod.GeoRadiusStoreOptions
import typings.redisClient.genericTransformersMod.GeoUnits
import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofGEORADIUSSTORE extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(
    key: RedisCommandArgument,
    coordinates: GeoCoordinates,
    radius: Double,
    unit: GeoUnits,
    destination: RedisCommandArgument
  ): RedisCommandArguments = js.native
  def transformArguments(
    key: RedisCommandArgument,
    coordinates: GeoCoordinates,
    radius: Double,
    unit: GeoUnits,
    destination: RedisCommandArgument,
    options: GeoRadiusStoreOptions
  ): RedisCommandArguments = js.native
  
  def transformReply(): Double = js.native
}

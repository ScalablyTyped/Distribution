package typings.redisClient.anon

import typings.redisClient.distLibCommandsGenericTransformersMod.GeoRadiusStoreOptions
import typings.redisClient.distLibCommandsGenericTransformersMod.GeoUnits
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedGEORADIUSBISREADONLY extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(
    key: RedisCommandArgument,
    member: String,
    radius: Double,
    unit: GeoUnits,
    destination: RedisCommandArgument
  ): RedisCommandArguments = js.native
  def transformArguments(
    key: RedisCommandArgument,
    member: String,
    radius: Double,
    unit: GeoUnits,
    destination: RedisCommandArgument,
    options: GeoRadiusStoreOptions
  ): RedisCommandArguments = js.native
  
  def transformReply(): Double = js.native
}

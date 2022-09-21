package typings.redisClient.anon

import typings.redisClient.genericTransformersMod.GeoSearchOptions
import typings.redisClient.genericTransformersMod.GeoUnits
import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedGEORADIUSBFIRSTKEYINDEX extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(key: RedisCommandArgument, member: String, radius: Double, unit: GeoUnits): RedisCommandArguments = js.native
  def transformArguments(
    key: RedisCommandArgument,
    member: String,
    radius: Double,
    unit: GeoUnits,
    options: GeoSearchOptions
  ): RedisCommandArguments = js.native
  
  def transformReply(): js.Array[RedisCommandArgument] = js.native
}

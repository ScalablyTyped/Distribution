package typings.redisClient.anon

import typings.redisClient.distLibCommandsGeoaddMod.GeoAddOptions
import typings.redisClient.distLibCommandsGeoaddMod.GeoMember
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedGEOADD extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(key: RedisCommandArgument, toAdd: js.Array[GeoMember]): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, toAdd: js.Array[GeoMember], options: GeoAddOptions): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, toAdd: GeoMember): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, toAdd: GeoMember, options: GeoAddOptions): RedisCommandArguments = js.native
  
  def transformReply(): Double = js.native
}

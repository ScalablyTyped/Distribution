package typings.redisClient.anon

import typings.redisClient.geoaddMod.GeoAddOptions
import typings.redisClient.geoaddMod.GeoMember
import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
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

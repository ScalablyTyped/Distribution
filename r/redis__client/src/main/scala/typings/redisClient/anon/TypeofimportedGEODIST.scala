package typings.redisClient.anon

import typings.redisClient.distLibCommandsGenericTransformersMod.GeoUnits
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedGEODIST extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(key: RedisCommandArgument, member1: RedisCommandArgument, member2: RedisCommandArgument): RedisCommandArguments = js.native
  def transformArguments(
    key: RedisCommandArgument,
    member1: RedisCommandArgument,
    member2: RedisCommandArgument,
    unit: GeoUnits
  ): RedisCommandArguments = js.native
  
  def transformReply(): Double | Null = js.native
  def transformReply(reply: RedisCommandArgument): Double | Null = js.native
}

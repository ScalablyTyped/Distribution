package typings.redisClient.anon

import typings.redisClient.distLibCommandsBitopMod.BitOperations
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofBITOP extends StObject {
  
  val FIRST_KEY_INDEX: /* 2 */ Double = js.native
  
  def transformArguments(operation: BitOperations, destKey: RedisCommandArgument, key: js.Array[RedisCommandArgument]): RedisCommandArguments = js.native
  def transformArguments(operation: BitOperations, destKey: RedisCommandArgument, key: RedisCommandArgument): RedisCommandArguments = js.native
  
  def transformReply(): Double = js.native
}

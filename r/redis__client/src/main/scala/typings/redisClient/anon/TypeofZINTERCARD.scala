package typings.redisClient.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofZINTERCARD extends StObject {
  
  val FIRST_KEY_INDEX: /* 2 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(keys: js.Array[RedisCommandArgument]): RedisCommandArguments = js.native
  def transformArguments(keys: js.Array[RedisCommandArgument], limit: Double): RedisCommandArguments = js.native
  def transformArguments(keys: RedisCommandArgument): RedisCommandArguments = js.native
  def transformArguments(keys: RedisCommandArgument, limit: Double): RedisCommandArguments = js.native
  
  def transformReply(): Double = js.native
}

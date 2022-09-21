package typings.redisClient.anon

import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedZINTERCARD extends StObject {
  
  val FIRST_KEY_INDEX: /* 2 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(keys: js.Array[RedisCommandArgument]): RedisCommandArguments = js.native
  def transformArguments(keys: js.Array[RedisCommandArgument], limit: Double): RedisCommandArguments = js.native
  def transformArguments(keys: RedisCommandArgument): RedisCommandArguments = js.native
  def transformArguments(keys: RedisCommandArgument, limit: Double): RedisCommandArguments = js.native
  
  def transformReply(): Double = js.native
}

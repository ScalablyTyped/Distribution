package typings.redisClient.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.distLibCommandsZunionMod.ZUnionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofZUNION extends StObject {
  
  val FIRST_KEY_INDEX: /* 2 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(keys: js.Array[RedisCommandArgument]): RedisCommandArguments = js.native
  def transformArguments(keys: js.Array[RedisCommandArgument], options: ZUnionOptions): RedisCommandArguments = js.native
  def transformArguments(keys: RedisCommandArgument): RedisCommandArguments = js.native
  def transformArguments(keys: RedisCommandArgument, options: ZUnionOptions): RedisCommandArguments = js.native
  
  def transformReply(): js.Array[RedisCommandArgument] = js.native
}

package typings.redisClient.anon

import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisClient.zinterMod.ZInterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedZINTER extends StObject {
  
  val FIRST_KEY_INDEX: /* 2 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(keys: js.Array[RedisCommandArgument]): RedisCommandArguments = js.native
  def transformArguments(keys: js.Array[RedisCommandArgument], options: ZInterOptions): RedisCommandArguments = js.native
  def transformArguments(keys: RedisCommandArgument): RedisCommandArguments = js.native
  def transformArguments(keys: RedisCommandArgument, options: ZInterOptions): RedisCommandArguments = js.native
  
  def transformReply(): js.Array[RedisCommandArgument] = js.native
}

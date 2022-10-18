package typings.redisClient.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.distLibCommandsXsetidMod.XSetIdOptions
import typings.redisClient.redisClientStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedXSETID extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(key: RedisCommandArgument, lastId: RedisCommandArgument): RedisCommandArguments = js.native
  def transformArguments(key: RedisCommandArgument, lastId: RedisCommandArgument, options: XSetIdOptions): RedisCommandArguments = js.native
  
  def transformReply(): OK = js.native
}

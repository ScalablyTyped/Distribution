package typings.redisClient.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.distLibCommandsXgroupCREATEMod.XGroupCreateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofXGROUPCREATE extends StObject {
  
  val FIRST_KEY_INDEX: /* 2 */ Double = js.native
  
  def transformArguments(key: RedisCommandArgument, group: RedisCommandArgument, id: RedisCommandArgument): RedisCommandArguments = js.native
  def transformArguments(
    key: RedisCommandArgument,
    group: RedisCommandArgument,
    id: RedisCommandArgument,
    options: XGroupCreateOptions
  ): RedisCommandArguments = js.native
  
  def transformReply(): RedisCommandArgument = js.native
}

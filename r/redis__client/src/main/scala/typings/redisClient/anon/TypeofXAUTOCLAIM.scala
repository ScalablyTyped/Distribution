package typings.redisClient.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.distLibCommandsXautoclaimMod.XAutoClaimOptions
import typings.redisClient.distLibCommandsXautoclaimMod.XAutoClaimRawReply
import typings.redisClient.distLibCommandsXautoclaimMod.XAutoClaimReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofXAUTOCLAIM extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(
    key: RedisCommandArgument,
    group: RedisCommandArgument,
    consumer: RedisCommandArgument,
    minIdleTime: Double,
    start: String
  ): RedisCommandArguments = js.native
  def transformArguments(
    key: RedisCommandArgument,
    group: RedisCommandArgument,
    consumer: RedisCommandArgument,
    minIdleTime: Double,
    start: String,
    options: XAutoClaimOptions
  ): RedisCommandArguments = js.native
  
  def transformReply(reply: XAutoClaimRawReply): XAutoClaimReply = js.native
}

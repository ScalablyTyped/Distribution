package typings.redisClient.anon

import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisClient.xautoclaimMod.XAutoClaimOptions
import typings.redisClient.xautoclaimMod.XAutoClaimRawReply
import typings.redisClient.xautoclaimMod.XAutoClaimReply
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

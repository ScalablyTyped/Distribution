package typings.redisClient.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.distLibCommandsXpendingRANGEMod.XPendingRangeOptions
import typings.redisClient.distLibCommandsXpendingRANGEMod.XPendingRangeRawReply
import typings.redisClient.distLibCommandsXpendingRANGEMod.XPendingRangeReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofXPENDINGRANGE extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(key: RedisCommandArgument, group: RedisCommandArgument, start: String, end: String, count: Double): RedisCommandArguments = js.native
  def transformArguments(
    key: RedisCommandArgument,
    group: RedisCommandArgument,
    start: String,
    end: String,
    count: Double,
    options: XPendingRangeOptions
  ): RedisCommandArguments = js.native
  
  def transformReply(reply: XPendingRangeRawReply): XPendingRangeReply = js.native
}

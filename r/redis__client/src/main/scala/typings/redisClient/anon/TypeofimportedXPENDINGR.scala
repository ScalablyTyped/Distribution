package typings.redisClient.anon

import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisClient.xpendingRANGEMod.XPendingRangeOptions
import typings.redisClient.xpendingRANGEMod.XPendingRangeRawReply
import typings.redisClient.xpendingRANGEMod.XPendingRangeReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedXPENDINGR extends StObject {
  
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

package typings.redisClient.anon

import typings.redisClient.genericTransformersMod.StreamMessagesReply
import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisClient.xrevrangeMod.XRangeRevOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedXREVRANGE extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(key: RedisCommandArgument, start: RedisCommandArgument, end: RedisCommandArgument): RedisCommandArguments = js.native
  def transformArguments(
    key: RedisCommandArgument,
    start: RedisCommandArgument,
    end: RedisCommandArgument,
    options: XRangeRevOptions
  ): RedisCommandArguments = js.native
  
  def transformReply(reply: js.Array[Any]): StreamMessagesReply = js.native
}

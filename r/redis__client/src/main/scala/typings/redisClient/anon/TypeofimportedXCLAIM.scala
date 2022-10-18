package typings.redisClient.anon

import typings.redisClient.distLibCommandsGenericTransformersMod.StreamMessagesReply
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.distLibCommandsXclaimMod.XClaimOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedXCLAIM extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(
    key: RedisCommandArgument,
    group: RedisCommandArgument,
    consumer: RedisCommandArgument,
    minIdleTime: Double,
    id: js.Array[RedisCommandArgument]
  ): RedisCommandArguments = js.native
  def transformArguments(
    key: RedisCommandArgument,
    group: RedisCommandArgument,
    consumer: RedisCommandArgument,
    minIdleTime: Double,
    id: js.Array[RedisCommandArgument],
    options: XClaimOptions
  ): RedisCommandArguments = js.native
  def transformArguments(
    key: RedisCommandArgument,
    group: RedisCommandArgument,
    consumer: RedisCommandArgument,
    minIdleTime: Double,
    id: RedisCommandArgument
  ): RedisCommandArguments = js.native
  def transformArguments(
    key: RedisCommandArgument,
    group: RedisCommandArgument,
    consumer: RedisCommandArgument,
    minIdleTime: Double,
    id: RedisCommandArgument,
    options: XClaimOptions
  ): RedisCommandArguments = js.native
  
  def transformReply(reply: js.Array[Any]): StreamMessagesReply = js.native
}

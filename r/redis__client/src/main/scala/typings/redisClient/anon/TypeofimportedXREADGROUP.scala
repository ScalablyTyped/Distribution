package typings.redisClient.anon

import typings.redisClient.genericTransformersMod.StreamsMessagesReply
import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisClient.xreadgroupMod.XReadGroupOptions
import typings.redisClient.xreadgroupMod.XReadGroupStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedXREADGROUP extends StObject {
  
  def FIRST_KEY_INDEX(_group: RedisCommandArgument, _consumer: RedisCommandArgument, streams: js.Array[XReadGroupStream]): RedisCommandArgument = js.native
  def FIRST_KEY_INDEX(_group: RedisCommandArgument, _consumer: RedisCommandArgument, streams: XReadGroupStream): RedisCommandArgument = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(group: RedisCommandArgument, consumer: RedisCommandArgument, streams: js.Array[XReadGroupStream]): RedisCommandArguments = js.native
  def transformArguments(
    group: RedisCommandArgument,
    consumer: RedisCommandArgument,
    streams: js.Array[XReadGroupStream],
    options: XReadGroupOptions
  ): RedisCommandArguments = js.native
  def transformArguments(group: RedisCommandArgument, consumer: RedisCommandArgument, streams: XReadGroupStream): RedisCommandArguments = js.native
  def transformArguments(
    group: RedisCommandArgument,
    consumer: RedisCommandArgument,
    streams: XReadGroupStream,
    options: XReadGroupOptions
  ): RedisCommandArguments = js.native
  
  def transformReply(): StreamsMessagesReply | Null = js.native
  def transformReply(reply: js.Array[Any]): StreamsMessagesReply | Null = js.native
}

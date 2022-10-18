package typings.redisClient.anon

import typings.redisClient.distLibCommandsGenericTransformersMod.StreamsMessagesReply
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.distLibCommandsXreadMod.XReadOptions
import typings.redisClient.distLibCommandsXreadMod.XReadStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofXREAD extends StObject {
  
  def FIRST_KEY_INDEX(streams: js.Array[XReadStream]): RedisCommandArgument = js.native
  def FIRST_KEY_INDEX(streams: XReadStream): RedisCommandArgument = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(streams: js.Array[XReadStream]): RedisCommandArguments = js.native
  def transformArguments(streams: js.Array[XReadStream], options: XReadOptions): RedisCommandArguments = js.native
  def transformArguments(streams: XReadStream): RedisCommandArguments = js.native
  def transformArguments(streams: XReadStream, options: XReadOptions): RedisCommandArguments = js.native
  
  def transformReply(): StreamsMessagesReply | Null = js.native
  def transformReply(reply: js.Array[Any]): StreamsMessagesReply | Null = js.native
}

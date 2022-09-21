package typings.redisClient.anon

import typings.redisClient.genericTransformersMod.StreamsMessagesReply
import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisClient.xreadMod.XReadOptions
import typings.redisClient.xreadMod.XReadStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedXREAD extends StObject {
  
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

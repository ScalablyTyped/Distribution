package typings.redisClient.anon

import typings.redisClient.distLibCommandsGenericTransformersMod.GeoReplyWith
import typings.redisClient.distLibCommandsGenericTransformersMod.GeoReplyWithMember
import typings.redisClient.distLibCommandsGenericTransformersMod.GeoSearchBy
import typings.redisClient.distLibCommandsGenericTransformersMod.GeoSearchFrom
import typings.redisClient.distLibCommandsGenericTransformersMod.GeoSearchOptions
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofimported_GEOSEARCH extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(key: RedisCommandArgument, from: GeoSearchFrom, by: GeoSearchBy, replyWith: js.Array[GeoReplyWith]): RedisCommandArguments = js.native
  def transformArguments(
    key: RedisCommandArgument,
    from: GeoSearchFrom,
    by: GeoSearchBy,
    replyWith: js.Array[GeoReplyWith],
    options: GeoSearchOptions
  ): RedisCommandArguments = js.native
  
  def transformReply(reply: js.Array[js.Array[Any]], replyWith: js.Array[GeoReplyWith]): js.Array[GeoReplyWithMember] = js.native
}

package typings.redisClient.anon

import typings.redisClient.genericTransformersMod.GeoReplyWith
import typings.redisClient.genericTransformersMod.GeoReplyWithMember
import typings.redisClient.genericTransformersMod.GeoSearchOptions
import typings.redisClient.genericTransformersMod.GeoUnits
import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofGEORADIUSBYMEMBERW extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(
    key: RedisCommandArgument,
    member: String,
    radius: Double,
    unit: GeoUnits,
    replyWith: js.Array[GeoReplyWith]
  ): RedisCommandArguments = js.native
  def transformArguments(
    key: RedisCommandArgument,
    member: String,
    radius: Double,
    unit: GeoUnits,
    replyWith: js.Array[GeoReplyWith],
    options: GeoSearchOptions
  ): RedisCommandArguments = js.native
  
  def transformReply(reply: js.Array[js.Array[Any]], replyWith: js.Array[GeoReplyWith]): js.Array[GeoReplyWithMember] = js.native
}

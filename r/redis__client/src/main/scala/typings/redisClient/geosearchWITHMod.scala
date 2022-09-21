package typings.redisClient

import typings.redisClient.genericTransformersMod.GeoReplyWith
import typings.redisClient.genericTransformersMod.GeoReplyWithMember
import typings.redisClient.genericTransformersMod.GeoSearchBy
import typings.redisClient.genericTransformersMod.GeoSearchFrom
import typings.redisClient.genericTransformersMod.GeoSearchOptions
import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geosearchWITHMod {
  
  @JSImport("@redis/client/dist/lib/commands/GEOSEARCH_WITH", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/GEOSEARCH_WITH", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/client/dist/lib/commands/GEOSEARCH_WITH", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key: RedisCommandArgument, from: GeoSearchFrom, by: GeoSearchBy, replyWith: js.Array[GeoReplyWith]): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], from.asInstanceOf[js.Any], by.asInstanceOf[js.Any], replyWith.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(
    key: RedisCommandArgument,
    from: GeoSearchFrom,
    by: GeoSearchBy,
    replyWith: js.Array[GeoReplyWith],
    options: GeoSearchOptions
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], from.asInstanceOf[js.Any], by.asInstanceOf[js.Any], replyWith.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: js.Array[js.Array[Any]], replyWith: js.Array[GeoReplyWith]): js.Array[GeoReplyWithMember] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any], replyWith.asInstanceOf[js.Any])).asInstanceOf[js.Array[GeoReplyWithMember]]
}

package typings.redisSearch

import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisSearch.commandsMod.ProfileOptions
import typings.redisSearch.commandsMod.ProfileRawReply
import typings.redisSearch.commandsMod.ProfileReply
import typings.redisSearch.searchMod.SearchOptions
import typings.redisSearch.searchMod.SearchRawReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object profileSEARCHMod {
  
  @JSImport("@redis/search/dist/commands/PROFILE_SEARCH", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/search/dist/commands/PROFILE_SEARCH", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(index: String, query: String): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(index.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(index: String, query: String, options: ProfileOptions & SearchOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(index.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: ProfileSearchRawReply): ProfileReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[ProfileReply]
  
  type ProfileSearchRawReply = ProfileRawReply[SearchRawReply]
}

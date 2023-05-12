package typings.redisSearch

import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisSearch.distCommandsMod.ProfileOptions
import typings.redisSearch.distCommandsMod.ProfileRawReply
import typings.redisSearch.distCommandsMod.ProfileReply
import typings.redisSearch.distCommandsSearchMod.SearchOptions
import typings.redisSearch.distCommandsSearchMod.SearchRawReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsProfileSEARCHMod {
  
  @JSImport("@redis/search/dist/commands/PROFILE_SEARCH", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/search/dist/commands/PROFILE_SEARCH", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(index: String, query: String): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(index.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(index: String, query: String, options: ProfileOptions & SearchOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(index.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: ProfileSearchRawReply, withoutDocuments: Boolean): ProfileReply = (^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any], withoutDocuments.asInstanceOf[js.Any])).asInstanceOf[ProfileReply]
  
  type ProfileSearchRawReply = ProfileRawReply[SearchRawReply]
}

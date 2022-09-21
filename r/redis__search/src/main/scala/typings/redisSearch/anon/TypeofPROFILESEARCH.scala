package typings.redisSearch.anon

import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisSearch.commandsMod.ProfileOptions
import typings.redisSearch.commandsMod.ProfileReply
import typings.redisSearch.profileSEARCHMod.ProfileSearchRawReply
import typings.redisSearch.searchMod.SearchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPROFILESEARCH extends StObject {
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(index: String, query: String): RedisCommandArguments = js.native
  def transformArguments(index: String, query: String, options: ProfileOptions & SearchOptions): RedisCommandArguments = js.native
  
  def transformReply(reply: ProfileSearchRawReply): ProfileReply = js.native
}

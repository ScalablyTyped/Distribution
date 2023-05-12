package typings.redisSearch.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisSearch.distCommandsMod.ProfileOptions
import typings.redisSearch.distCommandsMod.ProfileReply
import typings.redisSearch.distCommandsProfileSEARCHMod.ProfileSearchRawReply
import typings.redisSearch.distCommandsSearchMod.SearchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPROFILESEARCH extends StObject {
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(index: String, query: String): RedisCommandArguments = js.native
  def transformArguments(index: String, query: String, options: ProfileOptions & SearchOptions): RedisCommandArguments = js.native
  
  def transformReply(reply: ProfileSearchRawReply, withoutDocuments: Boolean): ProfileReply = js.native
}

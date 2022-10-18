package typings.redisSearch.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisSearch.distCommandsMod.SearchReply
import typings.redisSearch.distCommandsSearchMod.SearchOptions
import typings.redisSearch.distCommandsSearchMod.SearchRawReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSEARCH extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(index: String, query: String): RedisCommandArguments = js.native
  def transformArguments(index: String, query: String, options: SearchOptions): RedisCommandArguments = js.native
  
  def transformReply(reply: SearchRawReply): SearchReply = js.native
}

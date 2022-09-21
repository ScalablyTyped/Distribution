package typings.redisSearch.anon

import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisSearch.commandsMod.SearchReply
import typings.redisSearch.searchMod.SearchOptions
import typings.redisSearch.searchMod.SearchRawReply
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

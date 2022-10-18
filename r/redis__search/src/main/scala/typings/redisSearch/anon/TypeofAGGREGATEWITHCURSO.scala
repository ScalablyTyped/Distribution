package typings.redisSearch.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisSearch.distCommandsAggregateWITHCURSORMod.AggregateWithCursorOptions
import typings.redisSearch.distCommandsAggregateWITHCURSORMod.AggregateWithCursorRawReply
import typings.redisSearch.distCommandsAggregateWITHCURSORMod.AggregateWithCursorReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAGGREGATEWITHCURSO extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def transformArguments(index: String, query: String): RedisCommandArguments = js.native
  def transformArguments(index: String, query: String, options: AggregateWithCursorOptions): RedisCommandArguments = js.native
  
  def transformReply(reply: AggregateWithCursorRawReply): AggregateWithCursorReply = js.native
}

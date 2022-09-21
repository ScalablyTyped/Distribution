package typings.redisSearch.anon

import typings.redisClient.libCommandsMod.RedisCommandArguments
import typings.redisSearch.aggregateMod.AggregateOptions
import typings.redisSearch.aggregateMod.AggregateRawReply
import typings.redisSearch.aggregateMod.AggregateReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAGGREGATE extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  def pushAggregatehOptions(args: RedisCommandArguments): RedisCommandArguments = js.native
  def pushAggregatehOptions(args: RedisCommandArguments, options: AggregateOptions): RedisCommandArguments = js.native
  
  def transformArguments(index: String, query: String): RedisCommandArguments = js.native
  def transformArguments(index: String, query: String, options: AggregateOptions): RedisCommandArguments = js.native
  
  def transformReply(rawReply: AggregateRawReply): AggregateReply = js.native
}

package typings.redisGraph.anon

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisGraph.distCommandsMod.QueryOptionsBackwardCompatible
import typings.redisGraph.distCommandsQueryMod.QueryRawReply
import typings.redisGraph.distCommandsQueryMod.QueryReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedQUERY extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  def transformArguments(graph: RedisCommandArgument, query: RedisCommandArgument): RedisCommandArguments = js.native
  def transformArguments(graph: RedisCommandArgument, query: RedisCommandArgument, options: Unit, compact: Boolean): RedisCommandArguments = js.native
  def transformArguments(graph: RedisCommandArgument, query: RedisCommandArgument, options: QueryOptionsBackwardCompatible): RedisCommandArguments = js.native
  def transformArguments(
    graph: RedisCommandArgument,
    query: RedisCommandArgument,
    options: QueryOptionsBackwardCompatible,
    compact: Boolean
  ): RedisCommandArguments = js.native
  
  def transformReply(reply: QueryRawReply): QueryReply = js.native
}

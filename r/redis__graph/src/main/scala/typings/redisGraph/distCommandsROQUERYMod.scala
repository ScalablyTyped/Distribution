package typings.redisGraph

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisGraph.distCommandsMod.QueryOptionsBackwardCompatible
import typings.redisGraph.distCommandsQueryMod.QueryRawReply
import typings.redisGraph.distCommandsQueryMod.QueryReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsROQUERYMod {
  
  @JSImport("@redis/graph/dist/commands/RO_QUERY", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/graph/dist/commands/RO_QUERY", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/graph/dist/commands/RO_QUERY", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(graph: RedisCommandArgument, query: RedisCommandArgument): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(graph.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(graph: RedisCommandArgument, query: RedisCommandArgument, options: Unit, compact: Boolean): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(graph.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], compact.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(graph: RedisCommandArgument, query: RedisCommandArgument, options: QueryOptionsBackwardCompatible): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(graph.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(
    graph: RedisCommandArgument,
    query: RedisCommandArgument,
    options: QueryOptionsBackwardCompatible,
    compact: Boolean
  ): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(graph.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], compact.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: QueryRawReply): QueryReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[QueryReply]
}

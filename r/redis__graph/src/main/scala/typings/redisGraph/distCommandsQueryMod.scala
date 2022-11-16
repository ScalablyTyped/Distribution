package typings.redisGraph

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisGraph.distCommandsMod.QueryOptionsBackwardCompatible
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsQueryMod {
  
  @JSImport("@redis/graph/dist/commands/QUERY", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/graph/dist/commands/QUERY", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
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
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Data = std.Array<string | number | null | @redis/graph.@redis/graph/dist/commands/QUERY.Data>
  }}}
  to avoid circular code involving: 
  - @redis/graph.@redis/graph/dist/commands/QUERY.Data
  */
  @js.native
  trait Data
    extends StObject
       with Array[String | Double | Null | Data]
  
  type Headers = js.Array[String]
  
  type Metadata = js.Array[String]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type QueryRawReply = [headers: @redis/graph.@redis/graph/dist/commands/QUERY.Headers, data: @redis/graph.@redis/graph/dist/commands/QUERY.Data, metadata: @redis/graph.@redis/graph/dist/commands/QUERY.Metadata] | [metadata: @redis/graph.@redis/graph/dist/commands/QUERY.Metadata]
  }}}
  to avoid circular code involving: 
  - @redis/graph.@redis/graph/dist/commands/QUERY.Data
  - @redis/graph.@redis/graph/dist/commands/QUERY.QueryRawReply
  */
  type QueryRawReply = (js.Tuple3[/* headers */ Headers, /* data */ Any, /* metadata */ Metadata]) | (js.Array[/* metadata */ Metadata])
  
  /* Rewritten from type alias, can be one of: 
    - typings.redisGraph.anon.Data
    - typings.redisGraph.anon.Headers
  */
  trait QueryReply extends StObject
  object QueryReply {
    
    inline def Data(data: Unit, headers: Unit, metadata: Metadata): typings.redisGraph.anon.Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.redisGraph.anon.Data]
    }
    
    inline def Headers(data: Data, headers: typings.redisGraph.distCommandsQueryMod.Headers, metadata: Metadata): typings.redisGraph.anon.Headers = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.redisGraph.anon.Headers]
    }
  }
}

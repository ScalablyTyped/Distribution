package typings.redisGraph

import typings.redisClient.distLibClientMod.RedisClientType
import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisClient.distLibCommandsMod.RedisFunctions
import typings.redisClient.distLibCommandsMod.RedisScripts
import typings.redisGraph.anon.`0`
import typings.redisGraph.distCommandsMod.QueryOptions
import typings.redisGraph.distCommandsQueryMod.QueryReply
import typings.redisGraph.redisGraphStrings.data
import typings.redisGraph.redisGraphStrings.headers
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distGraphMod {
  
  @JSImport("@redis/graph/dist/graph", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Graph {
    def this(client: GraphClientType, name: String) = this()
  }
  
  @js.native
  trait Graph extends StObject {
    
    /* private */ var `private`: Any = js.native
    
    def query[T](query: RedisCommandArgument): js.Promise[GraphReply[T]] = js.native
    def query[T](query: RedisCommandArgument, options: QueryOptions): js.Promise[GraphReply[T]] = js.native
    
    def roQuery[T](query: RedisCommandArgument): js.Promise[GraphReply[T]] = js.native
    def roQuery[T](query: RedisCommandArgument, options: QueryOptions): js.Promise[GraphReply[T]] = js.native
  }
  
  type GraphClientType = RedisClientType[typings.redisGraph.anon.Graph, RedisFunctions, RedisScripts]
  
  type GraphReply[T] = (Omit[QueryReply, headers | data]) & `0`[T]
}

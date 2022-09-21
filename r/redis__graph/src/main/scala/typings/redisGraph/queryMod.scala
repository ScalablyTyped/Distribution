package typings.redisGraph

import typings.redisClient.libCommandsMod.RedisCommandArgument
import typings.redisClient.libCommandsMod.RedisCommandArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryMod {
  
  @JSImport("@redis/graph/dist/commands/QUERY", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/graph/dist/commands/QUERY", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(graph: RedisCommandArgument, query: RedisCommandArgument): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(graph.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(graph: RedisCommandArgument, query: RedisCommandArgument, timeout: Double): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(graph.asInstanceOf[js.Any], query.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(reply: QueryRawReply): QueryReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[QueryReply]
  
  type Data = js.Array[js.Array[String | Double | Null]]
  
  type Headers = js.Array[String]
  
  type Metadata = js.Array[String]
  
  type QueryRawReply = js.Tuple3[/* headers */ Headers, /* data */ Data, /* metadata */ Metadata]
  
  trait QueryReply extends StObject {
    
    var data: Data
    
    var headers: Headers
    
    var metadata: Metadata
  }
  object QueryReply {
    
    inline def apply(data: Data, headers: Headers, metadata: Metadata): QueryReply = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryReply]
    }
    
    extension [Self <: QueryReply](x: Self) {
      
      inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: (js.Array[String | Double | Null])*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataVarargs(value: String*): Self = StObject.set(x, "metadata", js.Array(value*))
    }
  }
}

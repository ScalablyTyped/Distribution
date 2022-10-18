package typings.redisSearch.distCommandsAggregateMod

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateReply extends StObject {
  
  var results: js.Array[Record[String, RedisCommandArgument]]
  
  var total: Double
}
object AggregateReply {
  
  inline def apply(results: js.Array[Record[String, RedisCommandArgument]], total: Double): AggregateReply = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateReply]
  }
  
  extension [Self <: AggregateReply](x: Self) {
    
    inline def setResults(value: js.Array[Record[String, RedisCommandArgument]]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: (Record[String, RedisCommandArgument])*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}

package typings.redisTimeSeries

import typings.redisTimeSeries.anon.AggregationType
import typings.redisTimeSeries.anon.Name
import typings.redisTimeSeries.distCommandsMod.TimeSeriesDuplicatePolicies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsInfoMod {
  
  @JSImport("@redis/time-series/dist/commands/INFO", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/time-series/dist/commands/INFO", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/time-series/dist/commands/INFO", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def transformReply(reply: InfoRawReply): InfoReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(reply.asInstanceOf[js.Any]).asInstanceOf[InfoReply]
  
  type InfoRawReply = js.Array[Any]
  
  trait InfoReply extends StObject {
    
    var chunkCount: Double
    
    var chunkSize: Double
    
    var chunkType: String
    
    var duplicatePolicy: TimeSeriesDuplicatePolicies | Null
    
    var firstTimestamp: Double
    
    var labels: js.Array[Name]
    
    var lastTimestamp: Double
    
    var memoryUsage: Double
    
    var retentionTime: Double
    
    var rules: js.Array[AggregationType]
    
    var sourceKey: String | Null
    
    var totalSamples: Double
  }
  object InfoReply {
    
    inline def apply(
      chunkCount: Double,
      chunkSize: Double,
      chunkType: String,
      firstTimestamp: Double,
      labels: js.Array[Name],
      lastTimestamp: Double,
      memoryUsage: Double,
      retentionTime: Double,
      rules: js.Array[AggregationType],
      totalSamples: Double
    ): InfoReply = {
      val __obj = js.Dynamic.literal(chunkCount = chunkCount.asInstanceOf[js.Any], chunkSize = chunkSize.asInstanceOf[js.Any], chunkType = chunkType.asInstanceOf[js.Any], firstTimestamp = firstTimestamp.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], lastTimestamp = lastTimestamp.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], retentionTime = retentionTime.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], totalSamples = totalSamples.asInstanceOf[js.Any], duplicatePolicy = null, sourceKey = null)
      __obj.asInstanceOf[InfoReply]
    }
    
    extension [Self <: InfoReply](x: Self) {
      
      inline def setChunkCount(value: Double): Self = StObject.set(x, "chunkCount", value.asInstanceOf[js.Any])
      
      inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      inline def setChunkType(value: String): Self = StObject.set(x, "chunkType", value.asInstanceOf[js.Any])
      
      inline def setDuplicatePolicy(value: TimeSeriesDuplicatePolicies): Self = StObject.set(x, "duplicatePolicy", value.asInstanceOf[js.Any])
      
      inline def setDuplicatePolicyNull: Self = StObject.set(x, "duplicatePolicy", null)
      
      inline def setFirstTimestamp(value: Double): Self = StObject.set(x, "firstTimestamp", value.asInstanceOf[js.Any])
      
      inline def setLabels(value: js.Array[Name]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsVarargs(value: Name*): Self = StObject.set(x, "labels", js.Array(value*))
      
      inline def setLastTimestamp(value: Double): Self = StObject.set(x, "lastTimestamp", value.asInstanceOf[js.Any])
      
      inline def setMemoryUsage(value: Double): Self = StObject.set(x, "memoryUsage", value.asInstanceOf[js.Any])
      
      inline def setRetentionTime(value: Double): Self = StObject.set(x, "retentionTime", value.asInstanceOf[js.Any])
      
      inline def setRules(value: js.Array[AggregationType]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesVarargs(value: AggregationType*): Self = StObject.set(x, "rules", js.Array(value*))
      
      inline def setSourceKey(value: String): Self = StObject.set(x, "sourceKey", value.asInstanceOf[js.Any])
      
      inline def setSourceKeyNull: Self = StObject.set(x, "sourceKey", null)
      
      inline def setTotalSamples(value: Double): Self = StObject.set(x, "totalSamples", value.asInstanceOf[js.Any])
    }
  }
}

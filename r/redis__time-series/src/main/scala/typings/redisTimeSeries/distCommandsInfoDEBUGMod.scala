package typings.redisTimeSeries

import typings.redisTimeSeries.anon.AggregationType
import typings.redisTimeSeries.anon.BytesPerSample
import typings.redisTimeSeries.anon.Name
import typings.redisTimeSeries.distCommandsInfoMod.InfoReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsInfoDEBUGMod {
  
  @JSImport("@redis/time-series/dist/commands/INFO_DEBUG", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/time-series/dist/commands/INFO_DEBUG", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  @JSImport("@redis/time-series/dist/commands/INFO_DEBUG", "IS_READ_ONLY")
  @js.native
  val IS_READ_ONLY: /* true */ Boolean = js.native
  
  inline def transformArguments(key: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def transformReply(rawReply: InfoDebugRawReply): InfoDebugReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(rawReply.asInstanceOf[js.Any]).asInstanceOf[InfoDebugReply]
  
  type InfoDebugRawReply = /* import warning: importer.ImportType#apply c repeated non-array type: ['totalSamples', number, 'memoryUsage', number, 'firstTimestamp', number, 'lastTimestamp', number, 'retentionTime', number, 'chunkCount', number, 'chunkSize', number, 'chunkType', string, 'duplicatePolicy', @redis/time-series.@redis/time-series/dist/commands.TimeSeriesDuplicatePolicies | null, 'labels', std.Array<[name: string, value: string]>, 'sourceKey', string | null, 'rules', std.Array<[key: string, timeBucket: number, aggregationType: @redis/time-series.@redis/time-series/dist/commands.TimeSeriesAggregationType]>] */ js.Array[js.Array[Any]]
  
  trait InfoDebugReply
    extends StObject
       with InfoReply {
    
    var chunks: js.Array[BytesPerSample]
    
    var keySelfName: String
  }
  object InfoDebugReply {
    
    inline def apply(
      chunkCount: Double,
      chunkSize: Double,
      chunkType: String,
      chunks: js.Array[BytesPerSample],
      firstTimestamp: Double,
      keySelfName: String,
      labels: js.Array[Name],
      lastTimestamp: Double,
      memoryUsage: Double,
      retentionTime: Double,
      rules: js.Array[AggregationType],
      totalSamples: Double
    ): InfoDebugReply = {
      val __obj = js.Dynamic.literal(chunkCount = chunkCount.asInstanceOf[js.Any], chunkSize = chunkSize.asInstanceOf[js.Any], chunkType = chunkType.asInstanceOf[js.Any], chunks = chunks.asInstanceOf[js.Any], firstTimestamp = firstTimestamp.asInstanceOf[js.Any], keySelfName = keySelfName.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], lastTimestamp = lastTimestamp.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], retentionTime = retentionTime.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], totalSamples = totalSamples.asInstanceOf[js.Any], duplicatePolicy = null, sourceKey = null)
      __obj.asInstanceOf[InfoDebugReply]
    }
    
    extension [Self <: InfoDebugReply](x: Self) {
      
      inline def setChunks(value: js.Array[BytesPerSample]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
      
      inline def setChunksVarargs(value: BytesPerSample*): Self = StObject.set(x, "chunks", js.Array(value*))
      
      inline def setKeySelfName(value: String): Self = StObject.set(x, "keySelfName", value.asInstanceOf[js.Any])
    }
  }
}

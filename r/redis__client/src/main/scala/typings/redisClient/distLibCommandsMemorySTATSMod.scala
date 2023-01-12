package typings.redisClient

import org.scalablytyped.runtime.NumberDictionary
import typings.redisClient.anon.OverheadHashtableExpires
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsMemorySTATSMod {
  
  @JSImport("@redis/client/dist/lib/commands/MEMORY_STATS", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")().asInstanceOf[js.Array[String]]
  
  inline def transformReply(rawReply: js.Array[String | Double | (js.Array[String | Double])]): MemoryStatsReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(rawReply.asInstanceOf[js.Any]).asInstanceOf[MemoryStatsReply]
  
  trait MemoryStatsReply extends StObject {
    
    var allocatorActive: js.UndefOr[Double] = js.undefined
    
    var allocatorAllocated: js.UndefOr[Double] = js.undefined
    
    var allocatorFragmentationBytes: js.UndefOr[Double] = js.undefined
    
    var allocatorFragmentationRatio: js.UndefOr[Double] = js.undefined
    
    var allocatorResident: js.UndefOr[Double] = js.undefined
    
    var allocatorRssBytes: js.UndefOr[Double] = js.undefined
    
    var allocatorRssRatio: js.UndefOr[Double] = js.undefined
    
    var aofBuffer: Double
    
    var clientsNormal: Double
    
    var clientsReplicas: Double
    
    var datasetBytes: Double
    
    var datasetPercentage: Double
    
    var db: NumberDictionary[OverheadHashtableExpires]
    
    var fragmentation: js.UndefOr[Double] = js.undefined
    
    var fragmentationBytes: Double
    
    var keysBytesPerKey: Double
    
    var keysCount: Double
    
    var luaCaches: Double
    
    var overheadTotal: Double
    
    var peakAllocated: Double
    
    var peakPercentage: Double
    
    var replicationBacklog: Double
    
    var rssOverheadBytes: js.UndefOr[Double] = js.undefined
    
    var rssOverheadRatio: js.UndefOr[Double] = js.undefined
    
    var startupAllocated: Double
    
    var totalAllocated: Double
  }
  object MemoryStatsReply {
    
    inline def apply(
      aofBuffer: Double,
      clientsNormal: Double,
      clientsReplicas: Double,
      datasetBytes: Double,
      datasetPercentage: Double,
      db: NumberDictionary[OverheadHashtableExpires],
      fragmentationBytes: Double,
      keysBytesPerKey: Double,
      keysCount: Double,
      luaCaches: Double,
      overheadTotal: Double,
      peakAllocated: Double,
      peakPercentage: Double,
      replicationBacklog: Double,
      startupAllocated: Double,
      totalAllocated: Double
    ): MemoryStatsReply = {
      val __obj = js.Dynamic.literal(aofBuffer = aofBuffer.asInstanceOf[js.Any], clientsNormal = clientsNormal.asInstanceOf[js.Any], clientsReplicas = clientsReplicas.asInstanceOf[js.Any], datasetBytes = datasetBytes.asInstanceOf[js.Any], datasetPercentage = datasetPercentage.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], fragmentationBytes = fragmentationBytes.asInstanceOf[js.Any], keysBytesPerKey = keysBytesPerKey.asInstanceOf[js.Any], keysCount = keysCount.asInstanceOf[js.Any], luaCaches = luaCaches.asInstanceOf[js.Any], overheadTotal = overheadTotal.asInstanceOf[js.Any], peakAllocated = peakAllocated.asInstanceOf[js.Any], peakPercentage = peakPercentage.asInstanceOf[js.Any], replicationBacklog = replicationBacklog.asInstanceOf[js.Any], startupAllocated = startupAllocated.asInstanceOf[js.Any], totalAllocated = totalAllocated.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemoryStatsReply]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MemoryStatsReply] (val x: Self) extends AnyVal {
      
      inline def setAllocatorActive(value: Double): Self = StObject.set(x, "allocatorActive", value.asInstanceOf[js.Any])
      
      inline def setAllocatorActiveUndefined: Self = StObject.set(x, "allocatorActive", js.undefined)
      
      inline def setAllocatorAllocated(value: Double): Self = StObject.set(x, "allocatorAllocated", value.asInstanceOf[js.Any])
      
      inline def setAllocatorAllocatedUndefined: Self = StObject.set(x, "allocatorAllocated", js.undefined)
      
      inline def setAllocatorFragmentationBytes(value: Double): Self = StObject.set(x, "allocatorFragmentationBytes", value.asInstanceOf[js.Any])
      
      inline def setAllocatorFragmentationBytesUndefined: Self = StObject.set(x, "allocatorFragmentationBytes", js.undefined)
      
      inline def setAllocatorFragmentationRatio(value: Double): Self = StObject.set(x, "allocatorFragmentationRatio", value.asInstanceOf[js.Any])
      
      inline def setAllocatorFragmentationRatioUndefined: Self = StObject.set(x, "allocatorFragmentationRatio", js.undefined)
      
      inline def setAllocatorResident(value: Double): Self = StObject.set(x, "allocatorResident", value.asInstanceOf[js.Any])
      
      inline def setAllocatorResidentUndefined: Self = StObject.set(x, "allocatorResident", js.undefined)
      
      inline def setAllocatorRssBytes(value: Double): Self = StObject.set(x, "allocatorRssBytes", value.asInstanceOf[js.Any])
      
      inline def setAllocatorRssBytesUndefined: Self = StObject.set(x, "allocatorRssBytes", js.undefined)
      
      inline def setAllocatorRssRatio(value: Double): Self = StObject.set(x, "allocatorRssRatio", value.asInstanceOf[js.Any])
      
      inline def setAllocatorRssRatioUndefined: Self = StObject.set(x, "allocatorRssRatio", js.undefined)
      
      inline def setAofBuffer(value: Double): Self = StObject.set(x, "aofBuffer", value.asInstanceOf[js.Any])
      
      inline def setClientsNormal(value: Double): Self = StObject.set(x, "clientsNormal", value.asInstanceOf[js.Any])
      
      inline def setClientsReplicas(value: Double): Self = StObject.set(x, "clientsReplicas", value.asInstanceOf[js.Any])
      
      inline def setDatasetBytes(value: Double): Self = StObject.set(x, "datasetBytes", value.asInstanceOf[js.Any])
      
      inline def setDatasetPercentage(value: Double): Self = StObject.set(x, "datasetPercentage", value.asInstanceOf[js.Any])
      
      inline def setDb(value: NumberDictionary[OverheadHashtableExpires]): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      inline def setFragmentation(value: Double): Self = StObject.set(x, "fragmentation", value.asInstanceOf[js.Any])
      
      inline def setFragmentationBytes(value: Double): Self = StObject.set(x, "fragmentationBytes", value.asInstanceOf[js.Any])
      
      inline def setFragmentationUndefined: Self = StObject.set(x, "fragmentation", js.undefined)
      
      inline def setKeysBytesPerKey(value: Double): Self = StObject.set(x, "keysBytesPerKey", value.asInstanceOf[js.Any])
      
      inline def setKeysCount(value: Double): Self = StObject.set(x, "keysCount", value.asInstanceOf[js.Any])
      
      inline def setLuaCaches(value: Double): Self = StObject.set(x, "luaCaches", value.asInstanceOf[js.Any])
      
      inline def setOverheadTotal(value: Double): Self = StObject.set(x, "overheadTotal", value.asInstanceOf[js.Any])
      
      inline def setPeakAllocated(value: Double): Self = StObject.set(x, "peakAllocated", value.asInstanceOf[js.Any])
      
      inline def setPeakPercentage(value: Double): Self = StObject.set(x, "peakPercentage", value.asInstanceOf[js.Any])
      
      inline def setReplicationBacklog(value: Double): Self = StObject.set(x, "replicationBacklog", value.asInstanceOf[js.Any])
      
      inline def setRssOverheadBytes(value: Double): Self = StObject.set(x, "rssOverheadBytes", value.asInstanceOf[js.Any])
      
      inline def setRssOverheadBytesUndefined: Self = StObject.set(x, "rssOverheadBytes", js.undefined)
      
      inline def setRssOverheadRatio(value: Double): Self = StObject.set(x, "rssOverheadRatio", value.asInstanceOf[js.Any])
      
      inline def setRssOverheadRatioUndefined: Self = StObject.set(x, "rssOverheadRatio", js.undefined)
      
      inline def setStartupAllocated(value: Double): Self = StObject.set(x, "startupAllocated", value.asInstanceOf[js.Any])
      
      inline def setTotalAllocated(value: Double): Self = StObject.set(x, "totalAllocated", value.asInstanceOf[js.Any])
    }
  }
}

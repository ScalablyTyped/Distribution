package typings.redisSearch

import typings.redisClient.distLibCommandsMod.RedisCommandArgument
import typings.redisSearch.anon.AverageCycleTimeMs
import typings.redisSearch.anon.GlobalIdle
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsInfoMod {
  
  @JSImport("@redis/search/dist/commands/INFO", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(index: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(index.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def transformReply(rawReply: InfoRawReply): InfoReply = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")(rawReply.asInstanceOf[js.Any]).asInstanceOf[InfoReply]
  
  type InfoRawReply = js.Array[Any]
  
  trait InfoReply extends StObject {
    
    var attributes: js.Array[Record[String, RedisCommandArgument]]
    
    var bytesPerRecordAvg: RedisCommandArgument
    
    var cursorStats: GlobalIdle
    
    var docTableSizeMb: RedisCommandArgument
    
    var gcStats: AverageCycleTimeMs
    
    var hashIndexingFailures: RedisCommandArgument
    
    var indexDefinition: Record[String, RedisCommandArgument]
    
    var indexName: RedisCommandArgument
    
    var indexOptions: js.Array[RedisCommandArgument]
    
    var indexing: RedisCommandArgument
    
    var invertedSzMb: RedisCommandArgument
    
    var keyTableSizeMb: RedisCommandArgument
    
    var maxDocId: RedisCommandArgument
    
    var numDocs: RedisCommandArgument
    
    var numRecords: RedisCommandArgument
    
    var numTerms: RedisCommandArgument
    
    var offsetBitsPerRecordAvg: RedisCommandArgument
    
    var offsetVectorsSzMb: RedisCommandArgument
    
    var offsetsPerTermAvg: RedisCommandArgument
    
    var percentIndexed: RedisCommandArgument
    
    var recordsPerDocAvg: RedisCommandArgument
    
    var sortableValuesSizeMb: RedisCommandArgument
    
    var stopWords: js.UndefOr[js.Array[RedisCommandArgument]] = js.undefined
    
    var totalInvertedIndexBlocks: RedisCommandArgument
    
    var vectorIndexSzMb: RedisCommandArgument
  }
  object InfoReply {
    
    inline def apply(
      attributes: js.Array[Record[String, RedisCommandArgument]],
      bytesPerRecordAvg: RedisCommandArgument,
      cursorStats: GlobalIdle,
      docTableSizeMb: RedisCommandArgument,
      gcStats: AverageCycleTimeMs,
      hashIndexingFailures: RedisCommandArgument,
      indexDefinition: Record[String, RedisCommandArgument],
      indexName: RedisCommandArgument,
      indexOptions: js.Array[RedisCommandArgument],
      indexing: RedisCommandArgument,
      invertedSzMb: RedisCommandArgument,
      keyTableSizeMb: RedisCommandArgument,
      maxDocId: RedisCommandArgument,
      numDocs: RedisCommandArgument,
      numRecords: RedisCommandArgument,
      numTerms: RedisCommandArgument,
      offsetBitsPerRecordAvg: RedisCommandArgument,
      offsetVectorsSzMb: RedisCommandArgument,
      offsetsPerTermAvg: RedisCommandArgument,
      percentIndexed: RedisCommandArgument,
      recordsPerDocAvg: RedisCommandArgument,
      sortableValuesSizeMb: RedisCommandArgument,
      totalInvertedIndexBlocks: RedisCommandArgument,
      vectorIndexSzMb: RedisCommandArgument
    ): InfoReply = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], bytesPerRecordAvg = bytesPerRecordAvg.asInstanceOf[js.Any], cursorStats = cursorStats.asInstanceOf[js.Any], docTableSizeMb = docTableSizeMb.asInstanceOf[js.Any], gcStats = gcStats.asInstanceOf[js.Any], hashIndexingFailures = hashIndexingFailures.asInstanceOf[js.Any], indexDefinition = indexDefinition.asInstanceOf[js.Any], indexName = indexName.asInstanceOf[js.Any], indexOptions = indexOptions.asInstanceOf[js.Any], indexing = indexing.asInstanceOf[js.Any], invertedSzMb = invertedSzMb.asInstanceOf[js.Any], keyTableSizeMb = keyTableSizeMb.asInstanceOf[js.Any], maxDocId = maxDocId.asInstanceOf[js.Any], numDocs = numDocs.asInstanceOf[js.Any], numRecords = numRecords.asInstanceOf[js.Any], numTerms = numTerms.asInstanceOf[js.Any], offsetBitsPerRecordAvg = offsetBitsPerRecordAvg.asInstanceOf[js.Any], offsetVectorsSzMb = offsetVectorsSzMb.asInstanceOf[js.Any], offsetsPerTermAvg = offsetsPerTermAvg.asInstanceOf[js.Any], percentIndexed = percentIndexed.asInstanceOf[js.Any], recordsPerDocAvg = recordsPerDocAvg.asInstanceOf[js.Any], sortableValuesSizeMb = sortableValuesSizeMb.asInstanceOf[js.Any], totalInvertedIndexBlocks = totalInvertedIndexBlocks.asInstanceOf[js.Any], vectorIndexSzMb = vectorIndexSzMb.asInstanceOf[js.Any])
      __obj.asInstanceOf[InfoReply]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InfoReply] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: js.Array[Record[String, RedisCommandArgument]]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesVarargs(value: (Record[String, RedisCommandArgument])*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setBytesPerRecordAvg(value: RedisCommandArgument): Self = StObject.set(x, "bytesPerRecordAvg", value.asInstanceOf[js.Any])
      
      inline def setCursorStats(value: GlobalIdle): Self = StObject.set(x, "cursorStats", value.asInstanceOf[js.Any])
      
      inline def setDocTableSizeMb(value: RedisCommandArgument): Self = StObject.set(x, "docTableSizeMb", value.asInstanceOf[js.Any])
      
      inline def setGcStats(value: AverageCycleTimeMs): Self = StObject.set(x, "gcStats", value.asInstanceOf[js.Any])
      
      inline def setHashIndexingFailures(value: RedisCommandArgument): Self = StObject.set(x, "hashIndexingFailures", value.asInstanceOf[js.Any])
      
      inline def setIndexDefinition(value: Record[String, RedisCommandArgument]): Self = StObject.set(x, "indexDefinition", value.asInstanceOf[js.Any])
      
      inline def setIndexName(value: RedisCommandArgument): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
      
      inline def setIndexOptions(value: js.Array[RedisCommandArgument]): Self = StObject.set(x, "indexOptions", value.asInstanceOf[js.Any])
      
      inline def setIndexOptionsVarargs(value: RedisCommandArgument*): Self = StObject.set(x, "indexOptions", js.Array(value*))
      
      inline def setIndexing(value: RedisCommandArgument): Self = StObject.set(x, "indexing", value.asInstanceOf[js.Any])
      
      inline def setInvertedSzMb(value: RedisCommandArgument): Self = StObject.set(x, "invertedSzMb", value.asInstanceOf[js.Any])
      
      inline def setKeyTableSizeMb(value: RedisCommandArgument): Self = StObject.set(x, "keyTableSizeMb", value.asInstanceOf[js.Any])
      
      inline def setMaxDocId(value: RedisCommandArgument): Self = StObject.set(x, "maxDocId", value.asInstanceOf[js.Any])
      
      inline def setNumDocs(value: RedisCommandArgument): Self = StObject.set(x, "numDocs", value.asInstanceOf[js.Any])
      
      inline def setNumRecords(value: RedisCommandArgument): Self = StObject.set(x, "numRecords", value.asInstanceOf[js.Any])
      
      inline def setNumTerms(value: RedisCommandArgument): Self = StObject.set(x, "numTerms", value.asInstanceOf[js.Any])
      
      inline def setOffsetBitsPerRecordAvg(value: RedisCommandArgument): Self = StObject.set(x, "offsetBitsPerRecordAvg", value.asInstanceOf[js.Any])
      
      inline def setOffsetVectorsSzMb(value: RedisCommandArgument): Self = StObject.set(x, "offsetVectorsSzMb", value.asInstanceOf[js.Any])
      
      inline def setOffsetsPerTermAvg(value: RedisCommandArgument): Self = StObject.set(x, "offsetsPerTermAvg", value.asInstanceOf[js.Any])
      
      inline def setPercentIndexed(value: RedisCommandArgument): Self = StObject.set(x, "percentIndexed", value.asInstanceOf[js.Any])
      
      inline def setRecordsPerDocAvg(value: RedisCommandArgument): Self = StObject.set(x, "recordsPerDocAvg", value.asInstanceOf[js.Any])
      
      inline def setSortableValuesSizeMb(value: RedisCommandArgument): Self = StObject.set(x, "sortableValuesSizeMb", value.asInstanceOf[js.Any])
      
      inline def setStopWords(value: js.Array[RedisCommandArgument]): Self = StObject.set(x, "stopWords", value.asInstanceOf[js.Any])
      
      inline def setStopWordsUndefined: Self = StObject.set(x, "stopWords", js.undefined)
      
      inline def setStopWordsVarargs(value: RedisCommandArgument*): Self = StObject.set(x, "stopWords", js.Array(value*))
      
      inline def setTotalInvertedIndexBlocks(value: RedisCommandArgument): Self = StObject.set(x, "totalInvertedIndexBlocks", value.asInstanceOf[js.Any])
      
      inline def setVectorIndexSzMb(value: RedisCommandArgument): Self = StObject.set(x, "vectorIndexSzMb", value.asInstanceOf[js.Any])
    }
  }
}

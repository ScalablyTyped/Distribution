package typings.qiniuJs

import typings.qiniuJs.apiMod.UploadChunkData
import typings.qiniuJs.baseMod.Extra
import typings.qiniuJs.qiniuJsInts.`0`
import typings.qiniuJs.qiniuJsInts.`1`
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resumeMod {
  
  @JSImport("qiniu-js/esm/upload/resume", JSImport.Default)
  @js.native
  open class default () extends Resume
  
  trait ChunkInfo extends StObject {
    
    var chunk: Blob
    
    var index: Double
  }
  object ChunkInfo {
    
    inline def apply(chunk: Blob, index: Double): ChunkInfo = {
      val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChunkInfo]
    }
    
    extension [Self <: ChunkInfo](x: Self) {
      
      inline def setChunk(value: Blob): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChunkLoaded extends StObject {
    
    var chunks: js.Array[Double]
    
    var mkFileProgress: `0` | `1`
  }
  object ChunkLoaded {
    
    inline def apply(chunks: js.Array[Double], mkFileProgress: `0` | `1`): ChunkLoaded = {
      val __obj = js.Dynamic.literal(chunks = chunks.asInstanceOf[js.Any], mkFileProgress = mkFileProgress.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChunkLoaded]
    }
    
    extension [Self <: ChunkLoaded](x: Self) {
      
      inline def setChunks(value: js.Array[Double]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
      
      inline def setChunksVarargs(value: Double*): Self = StObject.set(x, "chunks", js.Array(value*))
      
      inline def setMkFileProgress(value: `0` | `1`): Self = StObject.set(x, "mkFileProgress", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChunkPart extends StObject {
    
    var etag: String
    
    var partNumber: Double
  }
  object ChunkPart {
    
    inline def apply(etag: String, partNumber: Double): ChunkPart = {
      val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], partNumber = partNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChunkPart]
    }
    
    extension [Self <: ChunkPart](x: Self) {
      
      inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      inline def setPartNumber(value: Double): Self = StObject.set(x, "partNumber", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocalInfo extends StObject {
    
    var data: js.Array[UploadedChunkStorage]
    
    var id: String
  }
  object LocalInfo {
    
    inline def apply(data: js.Array[UploadedChunkStorage], id: String): LocalInfo = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalInfo]
    }
    
    extension [Self <: LocalInfo](x: Self) {
      
      inline def setData(value: js.Array[UploadedChunkStorage]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: UploadedChunkStorage*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Resume
    extends typings.qiniuJs.baseMod.default {
    
    /**
      * @description 来自缓存的上传信息
      */
    /* private */ var cachedUploadedList: Any = js.native
    
    /**
      * @description 文件的分片 chunks
      */
    /* private */ var chunks: Any = js.native
    
    /* private */ var getLocalKey: Any = js.native
    
    /* private */ var getUploadInfo: Any = js.native
    
    /* private */ var initBeforeUploadChunks: Any = js.native
    
    /**
      * @description 当前上传片进度信息
      */
    /* private */ var loaded: Any = js.native
    
    /* private */ var mkFileReq: Any = js.native
    
    /* private */ var notifyResumeProgress: Any = js.native
    
    /* private */ var updateChunkProgress: Any = js.native
    
    /* private */ var updateLocalCache: Any = js.native
    
    /* private */ var updateMkFileProgress: Any = js.native
    
    /* private */ var uploadChunk: Any = js.native
    
    /**
      * @description 当前上传任务的 id
      */
    /* private */ var uploadId: Any = js.native
    
    /**
      * @description 当前上传过程中已完成的上传信息
      */
    /* private */ var uploadedList: Any = js.native
    
    /**
      * @description 使用缓存的 chunks
      */
    /* private */ var usedCacheList: Any = js.native
  }
  
  trait UploadChunkBody
    extends StObject
       with Extra {
    
    var parts: js.Array[ChunkPart]
  }
  object UploadChunkBody {
    
    inline def apply(fname: String, parts: js.Array[ChunkPart]): UploadChunkBody = {
      val __obj = js.Dynamic.literal(fname = fname.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadChunkBody]
    }
    
    extension [Self <: UploadChunkBody](x: Self) {
      
      inline def setParts(value: js.Array[ChunkPart]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      inline def setPartsVarargs(value: ChunkPart*): Self = StObject.set(x, "parts", js.Array(value*))
    }
  }
  
  trait UploadedChunkStorage
    extends StObject
       with UploadChunkData {
    
    var size: Double
  }
  object UploadedChunkStorage {
    
    inline def apply(etag: String, md5: String, size: Double): UploadedChunkStorage = {
      val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], md5 = md5.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadedChunkStorage]
    }
    
    extension [Self <: UploadedChunkStorage](x: Self) {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}

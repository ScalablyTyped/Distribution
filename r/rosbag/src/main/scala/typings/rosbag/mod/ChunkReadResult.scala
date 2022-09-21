package typings.rosbag.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChunkReadResult extends StObject {
  
  var chunk: Chunk
  
  var indices: js.Array[IndexData]
}
object ChunkReadResult {
  
  inline def apply(chunk: Chunk, indices: js.Array[IndexData]): ChunkReadResult = {
    val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkReadResult]
  }
  
  extension [Self <: ChunkReadResult](x: Self) {
    
    inline def setChunk(value: Chunk): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
    
    inline def setIndices(value: js.Array[IndexData]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesVarargs(value: IndexData*): Self = StObject.set(x, "indices", js.Array(value*))
  }
}

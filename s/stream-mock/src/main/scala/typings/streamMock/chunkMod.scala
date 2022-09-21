package typings.streamMock

import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chunkMod {
  
  trait IChunk extends StObject {
    
    var chunk: Buffer | String
    
    var encoding: BufferEncoding
  }
  object IChunk {
    
    inline def apply(chunk: Buffer | String, encoding: BufferEncoding): IChunk = {
      val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[IChunk]
    }
    
    extension [Self <: IChunk](x: Self) {
      
      inline def setChunk(value: Buffer | String): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
}

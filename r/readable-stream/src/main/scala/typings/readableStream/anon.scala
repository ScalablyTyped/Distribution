package typings.readableStream

import typings.node.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AfterTransform extends StObject {
    
    def afterTransform(er: js.Any, data: js.Any): Unit | Boolean
    
    var needTransform: Boolean
    
    var transforming: Boolean
    
    var writecb: (js.Function1[/* err */ js.Any, js.Any]) | Null
    
    var writechunk: js.Any
    
    // TODO
    var writeencoding: BufferEncoding | Null
  }
  object AfterTransform {
    
    inline def apply(
      afterTransform: (js.Any, js.Any) => Unit | Boolean,
      needTransform: Boolean,
      transforming: Boolean,
      writechunk: js.Any
    ): AfterTransform = {
      val __obj = js.Dynamic.literal(afterTransform = js.Any.fromFunction2(afterTransform), needTransform = needTransform.asInstanceOf[js.Any], transforming = transforming.asInstanceOf[js.Any], writechunk = writechunk.asInstanceOf[js.Any], writecb = null, writeencoding = null)
      __obj.asInstanceOf[AfterTransform]
    }
    
    extension [Self <: AfterTransform](x: Self) {
      
      inline def setAfterTransform(value: (js.Any, js.Any) => Unit | Boolean): Self = StObject.set(x, "afterTransform", js.Any.fromFunction2(value))
      
      inline def setNeedTransform(value: Boolean): Self = StObject.set(x, "needTransform", value.asInstanceOf[js.Any])
      
      inline def setTransforming(value: Boolean): Self = StObject.set(x, "transforming", value.asInstanceOf[js.Any])
      
      inline def setWritecb(value: /* err */ js.Any => js.Any): Self = StObject.set(x, "writecb", js.Any.fromFunction1(value))
      
      inline def setWritecbNull: Self = StObject.set(x, "writecb", null)
      
      inline def setWritechunk(value: js.Any): Self = StObject.set(x, "writechunk", value.asInstanceOf[js.Any])
      
      inline def setWriteencoding(value: BufferEncoding): Self = StObject.set(x, "writeencoding", value.asInstanceOf[js.Any])
      
      inline def setWriteencodingNull: Self = StObject.set(x, "writeencoding", null)
    }
  }
  
  trait Chunk extends StObject {
    
    var chunk: js.Any
    
    var encoding: BufferEncoding | String
  }
  object Chunk {
    
    inline def apply(chunk: js.Any, encoding: BufferEncoding | String): Chunk = {
      val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[Chunk]
    }
    
    extension [Self <: Chunk](x: Self) {
      
      inline def setChunk(value: js.Any): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
      
      inline def setEncoding(value: BufferEncoding | String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
  
  trait Encoding extends StObject {
    
    var chunk: js.Any
    
    var encoding: BufferEncoding
  }
  object Encoding {
    
    inline def apply(chunk: js.Any, encoding: BufferEncoding): Encoding = {
      val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[Encoding]
    }
    
    extension [Self <: Encoding](x: Self) {
      
      inline def setChunk(value: js.Any): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
  
  trait End extends StObject {
    
    var end: js.UndefOr[Boolean] = js.undefined
  }
  object End {
    
    inline def apply(): End = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[End]
    }
    
    extension [Self <: End](x: Self) {
      
      inline def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    }
  }
}

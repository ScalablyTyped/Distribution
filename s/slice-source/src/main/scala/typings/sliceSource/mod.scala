package typings.sliceSource

import typings.std.ReadableStream
import typings.std.ReadableStreamReader
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(source: SliceSource): SliceSource = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[SliceSource]
  inline def apply(source: ReadableStream[js.Any]): SliceSource = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[SliceSource]
  inline def apply(source: ReadableStreamReader[js.Any]): SliceSource = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[SliceSource]
  
  @JSImport("slice-source", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait SliceChunk extends StObject {
    
    var done: Boolean
    
    var value: Uint8Array
  }
  object SliceChunk {
    
    inline def apply(done: Boolean, value: Uint8Array): SliceChunk = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliceChunk]
    }
    
    extension [Self <: SliceChunk](x: Self) {
      
      inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait SliceSource extends StObject {
    
    def cancel(): js.Promise[Unit]
    
    def read(): js.Promise[SliceChunk]
    
    def slice(length: Double): js.Promise[Uint8Array]
  }
  object SliceSource {
    
    inline def apply(
      cancel: () => js.Promise[Unit],
      read: () => js.Promise[SliceChunk],
      slice: Double => js.Promise[Uint8Array]
    ): SliceSource = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), read = js.Any.fromFunction0(read), slice = js.Any.fromFunction1(slice))
      __obj.asInstanceOf[SliceSource]
    }
    
    extension [Self <: SliceSource](x: Self) {
      
      inline def setCancel(value: () => js.Promise[Unit]): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setRead(value: () => js.Promise[SliceChunk]): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
      
      inline def setSlice(value: Double => js.Promise[Uint8Array]): Self = StObject.set(x, "slice", js.Any.fromFunction1(value))
    }
  }
}

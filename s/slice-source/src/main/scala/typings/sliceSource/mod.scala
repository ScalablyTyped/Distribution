package typings.sliceSource

import typings.std.ReadableStream
import typings.std.ReadableStreamReader
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(source: SliceSource): SliceSource = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[SliceSource]
  @scala.inline
  def apply(source: ReadableStream[js.Any]): SliceSource = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[SliceSource]
  @scala.inline
  def apply(source: ReadableStreamReader[js.Any]): SliceSource = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[SliceSource]
  
  @JSImport("slice-source", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait SliceChunk extends StObject {
    
    var done: Boolean
    
    var value: Uint8Array
  }
  object SliceChunk {
    
    @scala.inline
    def apply(done: Boolean, value: Uint8Array): SliceChunk = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliceChunk]
    }
    
    @scala.inline
    implicit class SliceChunkMutableBuilder[Self <: SliceChunk] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait SliceSource extends StObject {
    
    def cancel(): js.Promise[Unit]
    
    def read(): js.Promise[SliceChunk]
    
    def slice(length: Double): js.Promise[Uint8Array]
  }
  object SliceSource {
    
    @scala.inline
    def apply(
      cancel: () => js.Promise[Unit],
      read: () => js.Promise[SliceChunk],
      slice: Double => js.Promise[Uint8Array]
    ): SliceSource = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), read = js.Any.fromFunction0(read), slice = js.Any.fromFunction1(slice))
      __obj.asInstanceOf[SliceSource]
    }
    
    @scala.inline
    implicit class SliceSourceMutableBuilder[Self <: SliceSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: () => js.Promise[Unit]): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRead(value: () => js.Promise[SliceChunk]): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSlice(value: Double => js.Promise[Uint8Array]): Self = StObject.set(x, "slice", js.Any.fromFunction1(value))
    }
  }
}

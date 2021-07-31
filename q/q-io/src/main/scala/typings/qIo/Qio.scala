package typings.qIo

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Qio {
  
  type BufferReader = QioBufferReader
  
  trait ForEach extends StObject {
    
    def forEach(callback: ForEachCallback): Promise[Unit]
  }
  object ForEach {
    
    @scala.inline
    def apply(forEach: ForEachCallback => Promise[Unit]): ForEach = {
      val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach))
      __obj.asInstanceOf[ForEach]
    }
    
    @scala.inline
    implicit class ForEachMutableBuilder[Self <: ForEach] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForEach(value: ForEachCallback => Promise[Unit]): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ForEachCallback extends StObject {
    
    def apply(chunk: String): Promise[js.Any] = js.native
    def apply(chunk: Buffer): Promise[js.Any] = js.native
  }
  
  @js.native
  trait Reader
    extends StObject
       with ForEach {
    
    def close(): Unit = js.native
    
    var node: ReadableStream = js.native
    
    def read(): Promise[Buffer] = js.native
    def read(charset: String): Promise[String] = js.native
  }
  
  @js.native
  trait Stream extends StObject {
    
    def close(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def flush(): Promise[Unit] = js.native
    
    var node: js.Any = js.native
    
    def read(): Promise[Buffer] = js.native
    def read(charset: String): Promise[String] = js.native
    
    def write(content: String): Unit = js.native
    def write(content: Buffer): Unit = js.native
  }
  
  @js.native
  trait Writer extends StObject {
    
    def close(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def flush(): Promise[Unit] = js.native
    
    var node: WritableStream = js.native
    
    def write(content: String): Unit = js.native
    def write(content: Buffer): Unit = js.native
  }
}

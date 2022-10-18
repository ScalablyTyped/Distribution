package typings.streamMock

import typings.node.bufferMod.global.BufferEncoding
import typings.node.streamMod.ReadableOptions
import typings.std.ArrayLike
import typings.streamMock.libReadableIreadablemockMod.IReadableMock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libReadableBufferReadableMockMod {
  
  @JSImport("stream-mock/lib/readable/BufferReadableMock", JSImport.Default)
  @js.native
  open class default protected () extends BufferReadableMock {
    def this(source: js.Iterable[Any]) = this()
    def this(source: ArrayLike[Any]) = this()
    def this(source: js.Iterable[Any], options: ReadableOptions) = this()
    def this(source: ArrayLike[Any], options: ReadableOptions) = this()
  }
  
  @js.native
  trait BufferReadableMock extends IReadableMock {
    
    def _read(): Unit = js.native
    
    var encoding: BufferEncoding = js.native
  }
}

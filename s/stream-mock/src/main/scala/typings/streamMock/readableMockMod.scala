package typings.streamMock

import typings.node.bufferMod.global.BufferEncoding
import typings.node.streamMod.ReadableOptions
import typings.std.ArrayLike
import typings.streamMock.ireadablemockMod.IReadableMock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readableMockMod {
  
  @JSImport("stream-mock/lib/readable/ReadableMock", JSImport.Default)
  @js.native
  open class default protected () extends ReadableMock {
    def this(source: js.Iterable[Any]) = this()
    def this(source: ArrayLike[Any]) = this()
    def this(source: js.Iterable[Any], options: ReadableOptions) = this()
    def this(source: ArrayLike[Any], options: ReadableOptions) = this()
  }
  
  @js.native
  trait ReadableMock extends IReadableMock {
    
    /* private */ var _readableState: Any = js.native
    
    var encoding: BufferEncoding = js.native
    
    var objectMode: Boolean = js.native
  }
}

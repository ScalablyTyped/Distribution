package typings.streamMock

import typings.node.BufferEncoding
import typings.node.streamMod.ReadableOptions
import typings.std.ArrayLike
import typings.std.Iterable
import typings.streamMock.ireadablemockMod.IReadableMock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readableMockMod {
  
  @JSImport("stream-mock/lib/readable/ReadableMock", JSImport.Default)
  @js.native
  class default protected () extends ReadableMock {
    def this(source: ArrayLike[js.Any]) = this()
    def this(source: Iterable[js.Any]) = this()
    def this(source: ArrayLike[js.Any], options: ReadableOptions) = this()
    def this(source: Iterable[js.Any], options: ReadableOptions) = this()
  }
  
  @js.native
  trait ReadableMock extends IReadableMock {
    
    var _readableState: js.Any = js.native
    
    var encoding: BufferEncoding = js.native
    
    var objectMode: Boolean = js.native
  }
}

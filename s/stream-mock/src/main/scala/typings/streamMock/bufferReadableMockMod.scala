package typings.streamMock

import typings.node.BufferEncoding
import typings.node.streamMod.ReadableOptions
import typings.std.ArrayLike
import typings.std.Iterable
import typings.streamMock.ireadablemockMod.IReadableMock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stream-mock/lib/readable/BufferReadableMock", JSImport.Namespace)
@js.native
object bufferReadableMockMod extends js.Object {
  
  @js.native
  trait BufferReadableMock extends IReadableMock {
    
    def _read(): Unit = js.native
    
    var encoding: BufferEncoding = js.native
  }
  
  @js.native
  class default protected () extends BufferReadableMock {
    def this(source: ArrayLike[_]) = this()
    def this(source: Iterable[_]) = this()
    def this(source: ArrayLike[_], options: ReadableOptions) = this()
    def this(source: Iterable[_], options: ReadableOptions) = this()
  }
}

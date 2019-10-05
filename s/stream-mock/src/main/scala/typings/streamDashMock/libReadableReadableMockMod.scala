package typings.streamDashMock

import typings.node.BufferEncoding
import typings.node.streamMod.ReadableOptions
import typings.std.ArrayLike
import typings.std.Iterable
import typings.streamDashMock.libReadableIReadableMockMod.IReadableMock
import typings.streamDashMock.libReadableReadableMockMod.ReadableMock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock/lib/readable/ReadableMock", JSImport.Namespace)
@js.native
object libReadableReadableMockMod extends js.Object {
  @js.native
  trait ReadableMock extends IReadableMock {
    var _readableState: js.Any = js.native
    var encoding: BufferEncoding = js.native
    var objectMode: Boolean = js.native
  }
  
  @js.native
  class default protected () extends ReadableMock {
    def this(source: ArrayLike[_]) = this()
    def this(source: Iterable[_]) = this()
    def this(source: ArrayLike[_], options: ReadableOptions) = this()
    def this(source: Iterable[_], options: ReadableOptions) = this()
  }
  
}


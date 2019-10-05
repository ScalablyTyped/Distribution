package typings.streamDashMock

import typings.node.BufferEncoding
import typings.node.streamMod.ReadableOptions
import typings.std.ArrayLike
import typings.std.Iterable
import typings.streamDashMock.libReadableBufferReadableMockMod.BufferReadableMock
import typings.streamDashMock.libReadableIReadableMockMod.IReadableMock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock/lib/readable/BufferReadableMock", JSImport.Namespace)
@js.native
object libReadableBufferReadableMockMod extends js.Object {
  @js.native
  trait BufferReadableMock extends IReadableMock {
    var encoding: BufferEncoding = js.native
    def _read(): Unit = js.native
  }
  
  @js.native
  class default protected () extends BufferReadableMock {
    def this(source: ArrayLike[_]) = this()
    def this(source: Iterable[_]) = this()
    def this(source: ArrayLike[_], options: ReadableOptions) = this()
    def this(source: Iterable[_], options: ReadableOptions) = this()
  }
  
}


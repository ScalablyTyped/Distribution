package typings.streamDashMock

import typings.node.streamMod.ReadableOptions
import typings.std.ArrayLike
import typings.std.Iterable
import typings.streamDashMock.libReadableIReadableMockMod.IReadableMock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock/lib/readable/ObjectReadableMock", JSImport.Namespace)
@js.native
object libReadableObjectReadableMockMod extends js.Object {
  @js.native
  trait ObjectReadableMock extends IReadableMock {
    def _read(): Unit = js.native
  }
  
  @js.native
  class default protected () extends ObjectReadableMock {
    def this(source: ArrayLike[_]) = this()
    def this(source: Iterable[_]) = this()
    def this(source: ArrayLike[_], options: ReadableOptions) = this()
    def this(source: Iterable[_], options: ReadableOptions) = this()
  }
  
}


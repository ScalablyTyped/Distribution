package typings.streamMock

import typings.node.streamMod.DuplexOptions
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.WritableOptions
import typings.std.ArrayLike
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class BufferReadableMock protected ()
    extends typings.streamMock.readableMod.BufferReadableMock {
    def this(source: ArrayLike[_]) = this()
    def this(source: Iterable[_]) = this()
    def this(source: ArrayLike[_], options: ReadableOptions) = this()
    def this(source: Iterable[_], options: ReadableOptions) = this()
  }
  
  @js.native
  class BufferWritableMock ()
    extends typings.streamMock.writableMod.BufferWritableMock {
    def this(options: WritableOptions) = this()
  }
  
  @js.native
  class DuplexMock ()
    extends typings.streamMock.duplexMod.DuplexMock {
    def this(source: ArrayLike[_]) = this()
    def this(source: Iterable[_]) = this()
    def this(source: js.UndefOr[scala.Nothing], options: DuplexOptions) = this()
    def this(source: ArrayLike[_], options: DuplexOptions) = this()
    def this(source: Iterable[_], options: DuplexOptions) = this()
  }
  
  @js.native
  class ObjectReadableMock protected ()
    extends typings.streamMock.readableMod.ObjectReadableMock {
    def this(source: ArrayLike[_]) = this()
    def this(source: Iterable[_]) = this()
    def this(source: ArrayLike[_], options: ReadableOptions) = this()
    def this(source: Iterable[_], options: ReadableOptions) = this()
  }
  
  @js.native
  class ObjectWritableMock ()
    extends typings.streamMock.writableMod.ObjectWritableMock {
    def this(options: WritableOptions) = this()
  }
  
  @js.native
  class ReadableMock protected ()
    extends typings.streamMock.readableMod.ReadableMock {
    def this(source: ArrayLike[_]) = this()
    def this(source: Iterable[_]) = this()
    def this(source: ArrayLike[_], options: ReadableOptions) = this()
    def this(source: Iterable[_], options: ReadableOptions) = this()
  }
  
  @js.native
  class WritableMock ()
    extends typings.streamMock.writableMod.WritableMock {
    def this(options: WritableOptions) = this()
  }
  
}


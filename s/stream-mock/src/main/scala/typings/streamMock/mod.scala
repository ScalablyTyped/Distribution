package typings.streamMock

import typings.node.streamMod.DuplexOptions
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.WritableOptions
import typings.std.ArrayLike
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stream-mock", "BufferReadableMock")
  @js.native
  class BufferReadableMock protected ()
    extends typings.streamMock.readableMod.BufferReadableMock {
    def this(source: ArrayLike[js.Any]) = this()
    def this(source: Iterable[js.Any]) = this()
    def this(source: ArrayLike[js.Any], options: ReadableOptions) = this()
    def this(source: Iterable[js.Any], options: ReadableOptions) = this()
  }
  
  @JSImport("stream-mock", "BufferWritableMock")
  @js.native
  class BufferWritableMock ()
    extends typings.streamMock.writableMod.BufferWritableMock {
    def this(options: WritableOptions) = this()
  }
  
  @JSImport("stream-mock", "DuplexMock")
  @js.native
  class DuplexMock ()
    extends typings.streamMock.duplexMod.DuplexMock {
    def this(source: ArrayLike[js.Any]) = this()
    def this(source: Iterable[js.Any]) = this()
    def this(source: Unit, options: DuplexOptions) = this()
    def this(source: ArrayLike[js.Any], options: DuplexOptions) = this()
    def this(source: Iterable[js.Any], options: DuplexOptions) = this()
  }
  
  @JSImport("stream-mock", "ObjectReadableMock")
  @js.native
  class ObjectReadableMock protected ()
    extends typings.streamMock.readableMod.ObjectReadableMock {
    def this(source: ArrayLike[js.Any]) = this()
    def this(source: Iterable[js.Any]) = this()
    def this(source: ArrayLike[js.Any], options: ReadableOptions) = this()
    def this(source: Iterable[js.Any], options: ReadableOptions) = this()
  }
  
  @JSImport("stream-mock", "ObjectWritableMock")
  @js.native
  class ObjectWritableMock ()
    extends typings.streamMock.writableMod.ObjectWritableMock {
    def this(options: WritableOptions) = this()
  }
  
  @JSImport("stream-mock", "ReadableMock")
  @js.native
  class ReadableMock protected ()
    extends typings.streamMock.readableMod.ReadableMock {
    def this(source: ArrayLike[js.Any]) = this()
    def this(source: Iterable[js.Any]) = this()
    def this(source: ArrayLike[js.Any], options: ReadableOptions) = this()
    def this(source: Iterable[js.Any], options: ReadableOptions) = this()
  }
  
  @JSImport("stream-mock", "WritableMock")
  @js.native
  class WritableMock ()
    extends typings.streamMock.writableMod.WritableMock {
    def this(options: WritableOptions) = this()
  }
}

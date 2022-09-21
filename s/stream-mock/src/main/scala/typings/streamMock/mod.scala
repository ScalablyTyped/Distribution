package typings.streamMock

import typings.node.streamMod.DuplexOptions
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.WritableOptions
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stream-mock", "BufferReadableMock")
  @js.native
  open class BufferReadableMock protected ()
    extends typings.streamMock.readableMod.BufferReadableMock {
    def this(source: js.Iterable[Any]) = this()
    def this(source: ArrayLike[Any]) = this()
    def this(source: js.Iterable[Any], options: ReadableOptions) = this()
    def this(source: ArrayLike[Any], options: ReadableOptions) = this()
  }
  
  @JSImport("stream-mock", "BufferWritableMock")
  @js.native
  open class BufferWritableMock ()
    extends typings.streamMock.writableMod.BufferWritableMock {
    def this(options: WritableOptions) = this()
  }
  
  @JSImport("stream-mock", "DuplexMock")
  @js.native
  open class DuplexMock ()
    extends typings.streamMock.duplexMod.DuplexMock {
    def this(source: js.Iterable[Any]) = this()
    def this(source: ArrayLike[Any]) = this()
    def this(source: js.Iterable[Any], options: DuplexOptions) = this()
    def this(source: Unit, options: DuplexOptions) = this()
    def this(source: ArrayLike[Any], options: DuplexOptions) = this()
  }
  
  @JSImport("stream-mock", "ObjectReadableMock")
  @js.native
  open class ObjectReadableMock protected ()
    extends typings.streamMock.readableMod.ObjectReadableMock {
    def this(source: js.Iterable[Any]) = this()
    def this(source: ArrayLike[Any]) = this()
    def this(source: js.Iterable[Any], options: ReadableOptions) = this()
    def this(source: ArrayLike[Any], options: ReadableOptions) = this()
  }
  
  @JSImport("stream-mock", "ObjectWritableMock")
  @js.native
  open class ObjectWritableMock ()
    extends typings.streamMock.writableMod.ObjectWritableMock {
    def this(options: WritableOptions) = this()
  }
  
  @JSImport("stream-mock", "ReadableMock")
  @js.native
  open class ReadableMock protected ()
    extends typings.streamMock.readableMod.ReadableMock {
    def this(source: js.Iterable[Any]) = this()
    def this(source: ArrayLike[Any]) = this()
    def this(source: js.Iterable[Any], options: ReadableOptions) = this()
    def this(source: ArrayLike[Any], options: ReadableOptions) = this()
  }
  
  @JSImport("stream-mock", "WritableMock")
  @js.native
  open class WritableMock ()
    extends typings.streamMock.writableMod.WritableMock {
    def this(options: WritableOptions) = this()
  }
}

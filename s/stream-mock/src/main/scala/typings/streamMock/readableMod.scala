package typings.streamMock

import typings.node.streamMod.ReadableOptions
import typings.std.ArrayLike
import typings.std.Iterable
import typings.streamMock.bufferReadableMockMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readableMod {
  
  @JSImport("stream-mock/lib/readable", "BufferReadableMock")
  @js.native
  class BufferReadableMock protected () extends default {
    def this(source: ArrayLike[js.Any]) = this()
    def this(source: Iterable[js.Any]) = this()
    def this(source: ArrayLike[js.Any], options: ReadableOptions) = this()
    def this(source: Iterable[js.Any], options: ReadableOptions) = this()
  }
  
  @JSImport("stream-mock/lib/readable", "ObjectReadableMock")
  @js.native
  class ObjectReadableMock protected ()
    extends typings.streamMock.objectReadableMockMod.default {
    def this(source: ArrayLike[js.Any]) = this()
    def this(source: Iterable[js.Any]) = this()
    def this(source: ArrayLike[js.Any], options: ReadableOptions) = this()
    def this(source: Iterable[js.Any], options: ReadableOptions) = this()
  }
  
  @JSImport("stream-mock/lib/readable", "ReadableMock")
  @js.native
  class ReadableMock protected ()
    extends typings.streamMock.readableMockMod.default {
    def this(source: ArrayLike[js.Any]) = this()
    def this(source: Iterable[js.Any]) = this()
    def this(source: ArrayLike[js.Any], options: ReadableOptions) = this()
    def this(source: Iterable[js.Any], options: ReadableOptions) = this()
  }
}

package typings.streamMock

import typings.node.streamMod.DuplexOptions
import typings.std.ArrayLike
import typings.std.Iterable
import typings.streamMock.duplexMockMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object duplexMod {
  
  @JSImport("stream-mock/lib/duplex", "DuplexMock")
  @js.native
  class DuplexMock () extends default {
    def this(source: ArrayLike[js.Any]) = this()
    def this(source: Iterable[js.Any]) = this()
    def this(source: Unit, options: DuplexOptions) = this()
    def this(source: ArrayLike[js.Any], options: DuplexOptions) = this()
    def this(source: Iterable[js.Any], options: DuplexOptions) = this()
  }
}

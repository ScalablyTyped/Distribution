package typings.streamMock

import typings.node.streamMod.DuplexOptions
import typings.std.ArrayLike
import typings.streamMock.duplexMockMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object duplexMod {
  
  @JSImport("stream-mock/lib/duplex", "DuplexMock")
  @js.native
  open class DuplexMock () extends default {
    def this(source: js.Iterable[Any]) = this()
    def this(source: ArrayLike[Any]) = this()
    def this(source: js.Iterable[Any], options: DuplexOptions) = this()
    def this(source: Unit, options: DuplexOptions) = this()
    def this(source: ArrayLike[Any], options: DuplexOptions) = this()
  }
}

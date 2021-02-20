package typings.streamMock

import typings.node.streamMod.DuplexOptions
import typings.std.ArrayLike
import typings.std.Iterable
import typings.streamMock.duplexMockMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object duplexMod {
  
  @JSImport("stream-mock/lib/duplex", "DuplexMock")
  @js.native
  class DuplexMock () extends default {
    def this(source: ArrayLike[_]) = this()
    def this(source: Iterable[_]) = this()
    def this(source: js.UndefOr[scala.Nothing], options: DuplexOptions) = this()
    def this(source: ArrayLike[_], options: DuplexOptions) = this()
    def this(source: Iterable[_], options: DuplexOptions) = this()
  }
}

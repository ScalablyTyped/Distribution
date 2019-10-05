package typings.streamDashMock

import typings.node.streamMod.DuplexOptions
import typings.std.ArrayLike
import typings.std.Iterable
import typings.streamDashMock.libDuplexDuplexMockMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock/lib/duplex", JSImport.Namespace)
@js.native
object libDuplexMod extends js.Object {
  @js.native
  class DuplexMock () extends default {
    def this(source: ArrayLike[_]) = this()
    def this(source: Iterable[_]) = this()
    def this(source: ArrayLike[_], options: DuplexOptions) = this()
    def this(source: Iterable[_], options: DuplexOptions) = this()
  }
  
}


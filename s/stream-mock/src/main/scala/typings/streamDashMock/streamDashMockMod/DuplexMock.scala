package typings.streamDashMock.streamDashMockMod

import typings.node.streamMod.DuplexOptions
import typings.std.ArrayLike
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock", "DuplexMock")
@js.native
class DuplexMock ()
  extends typings.streamDashMock.libDuplexMod.DuplexMock {
  def this(source: ArrayLike[_]) = this()
  def this(source: Iterable[_]) = this()
  def this(source: ArrayLike[_], options: DuplexOptions) = this()
  def this(source: Iterable[_], options: DuplexOptions) = this()
}


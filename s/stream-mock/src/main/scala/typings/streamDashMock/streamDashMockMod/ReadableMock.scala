package typings.streamDashMock.streamDashMockMod

import typings.node.streamMod.ReadableOptions
import typings.std.ArrayLike
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock", "ReadableMock")
@js.native
class ReadableMock protected ()
  extends typings.streamDashMock.libReadableMod.ReadableMock {
  def this(source: ArrayLike[_]) = this()
  def this(source: Iterable[_]) = this()
  def this(source: ArrayLike[_], options: ReadableOptions) = this()
  def this(source: Iterable[_], options: ReadableOptions) = this()
}


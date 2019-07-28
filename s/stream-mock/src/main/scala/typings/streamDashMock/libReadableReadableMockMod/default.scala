package typings.streamDashMock.libReadableReadableMockMod

import typings.node.streamMod.ReadableOptions
import typings.std.ArrayLike
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock/lib/readable/ReadableMock", JSImport.Default)
@js.native
class default protected () extends ReadableMock {
  def this(source: ArrayLike[_]) = this()
  def this(source: Iterable[_]) = this()
  def this(source: ArrayLike[_], options: ReadableOptions) = this()
  def this(source: Iterable[_], options: ReadableOptions) = this()
}


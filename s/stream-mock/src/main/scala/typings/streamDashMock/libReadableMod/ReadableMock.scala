package typings.streamDashMock.libReadableMod

import typings.node.streamMod.ReadableOptions
import typings.std.ArrayLike
import typings.std.Iterable
import typings.streamDashMock.libReadableReadableMockMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock/lib/readable", "ReadableMock")
@js.native
class ReadableMock protected () extends default {
  def this(source: ArrayLike[_]) = this()
  def this(source: Iterable[_]) = this()
  def this(source: ArrayLike[_], options: ReadableOptions) = this()
  def this(source: Iterable[_], options: ReadableOptions) = this()
}


package typings
package streamDashMockLib.libReadableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock/lib/readable", "BufferReadableMock")
@js.native
class BufferReadableMock protected ()
  extends streamDashMockLib.libReadableBufferReadableMockMod.default {
  def this(source: stdLib.ArrayLike[_]) = this()
  def this(source: stdLib.Iterable[_]) = this()
  def this(source: stdLib.ArrayLike[_], options: nodeLib.streamMod.ReadableOptions) = this()
  def this(source: stdLib.Iterable[_], options: nodeLib.streamMod.ReadableOptions) = this()
}


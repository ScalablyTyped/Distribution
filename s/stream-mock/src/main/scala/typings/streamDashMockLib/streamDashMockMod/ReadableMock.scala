package typings
package streamDashMockLib.streamDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock", "ReadableMock")
@js.native
class ReadableMock protected ()
  extends streamDashMockLib.libReadableMod.ReadableMock {
  def this(source: stdLib.ArrayLike[_]) = this()
  def this(source: stdLib.Iterable[_]) = this()
  def this(source: stdLib.ArrayLike[_], options: nodeLib.streamMod.ReadableOptions) = this()
  def this(source: stdLib.Iterable[_], options: nodeLib.streamMod.ReadableOptions) = this()
}


package typings
package streamDashMockLib.streamDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock", "DuplexMock")
@js.native
class DuplexMock ()
  extends streamDashMockLib.libDuplexMod.DuplexMock {
  def this(source: stdLib.ArrayLike[_]) = this()
  def this(source: stdLib.Iterable[_]) = this()
  def this(source: stdLib.ArrayLike[_], options: nodeLib.streamMod.DuplexOptions) = this()
  def this(source: stdLib.Iterable[_], options: nodeLib.streamMod.DuplexOptions) = this()
}


package typings
package streamDashMockLib.libWritableWritableMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WritableMock
  extends streamDashMockLib.libWritableIWritableMockMod.IWritableMock {
  var _writableState: js.Any = js.native
  @JSName("data")
  var data_WritableMock: js.Array[_] = js.native
  var objectMode: scala.Boolean = js.native
  def _write(
    chunk: js.Any,
    encoding: nodeLib.BufferEncoding,
    callback: js.Function1[/* error */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
}


package typings
package streamDashMockLib.libWritableBufferWritableMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferWritableMock
  extends streamDashMockLib.libWritableIWritableMockMod.IWritableMock {
  @JSName("data")
  var data_BufferWritableMock: js.Array[nodeLib.Buffer] = js.native
  @JSName("flatData")
  var flatData_BufferWritableMock: nodeLib.Buffer = js.native
  def _write(
    chunk: java.lang.String,
    encoding: nodeLib.BufferEncoding,
    callback: js.Function1[/* error */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  def _write(
    chunk: nodeLib.Buffer,
    encoding: nodeLib.BufferEncoding,
    callback: js.Function1[/* error */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
}


package typings
package streamDashMockLib.libWritableObjectWritableMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectWritableMock
  extends streamDashMockLib.libWritableIWritableMockMod.IWritableMock {
  @JSName("data")
  var data_ObjectWritableMock: js.Array[_] = js.native
  @JSName("flatData")
  var flatData_ObjectWritableMock: js.Array[_] = js.native
  def _write(
    chunk: js.Any,
    _encoding: nodeLib.BufferEncoding,
    callback: js.Function1[/* error */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
}


package typings.streamDashMock.libWritableObjectWritableMockMod

import typings.node.BufferEncoding
import typings.std.Error
import typings.streamDashMock.libWritableIWritableMockMod.IWritableMock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectWritableMock extends IWritableMock {
  @JSName("data")
  var data_ObjectWritableMock: js.Array[_] = js.native
  @JSName("flatData")
  var flatData_ObjectWritableMock: js.Array[_] = js.native
  def _write(
    chunk: js.Any,
    _encoding: BufferEncoding,
    callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
}


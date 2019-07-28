package typings.streamDashMock.libWritableWritableMockMod

import typings.node.BufferEncoding
import typings.std.Error
import typings.streamDashMock.libWritableIWritableMockMod.IWritableMock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WritableMock extends IWritableMock {
  var _writableState: js.Any = js.native
  @JSName("data")
  var data_WritableMock: js.Array[_] = js.native
  var objectMode: Boolean = js.native
  def _write(
    chunk: js.Any,
    encoding: BufferEncoding,
    callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
  ): Unit = js.native
}


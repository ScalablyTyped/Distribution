package typings.streamMock

import typings.node.BufferEncoding
import typings.node.streamMod.WritableOptions
import typings.std.Error
import typings.streamMock.iwritablemockMod.IWritableMock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-mock/lib/writable/WritableMock", JSImport.Namespace)
@js.native
object writableMockMod extends js.Object {
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
  
  @js.native
  class default () extends WritableMock {
    def this(options: WritableOptions) = this()
  }
  
}


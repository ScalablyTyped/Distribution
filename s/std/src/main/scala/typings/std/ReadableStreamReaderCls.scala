package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ReadableStreamReader")
@js.native
class ReadableStreamReaderCls ()
  extends ReadableStreamReader[js.Any] {
  /* CompleteClass */
  override def cancel(): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def read(): js.Promise[ReadableStreamReadResult[js.Any]] = js.native
  /* CompleteClass */
  override def releaseLock(): Unit = js.native
}


package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadableStreamReader[R] extends js.Object {
  def cancel(): js.Promise[scala.Unit]
  def read(): js.Promise[ReadableStreamReadResult[R]]
  def releaseLock(): scala.Unit
}

@JSGlobal("ReadableStreamReader")
@js.native
class ReadableStreamReaderCls ()
  extends ReadableStreamReader[js.Any] {
  /* CompleteClass */
  override def cancel(): js.Promise[scala.Unit] = js.native
  /* CompleteClass */
  override def read(): js.Promise[ReadableStreamReadResult[js.Any]] = js.native
  /* CompleteClass */
  override def releaseLock(): scala.Unit = js.native
}

@JSGlobal("ReadableStreamReader")
@js.native
object ReadableStreamReader
  extends org.scalablytyped.runtime.Instantiable0[ReadableStreamReader[js.Any]]


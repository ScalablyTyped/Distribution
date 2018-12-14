package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadableStreamBYOBReader extends js.Object {
  val closed: js.Promise[scala.Unit] = js.native
  def cancel(): js.Promise[scala.Unit] = js.native
  def cancel(reason: js.Any): js.Promise[scala.Unit] = js.native
  def read[T /* <: ArrayBufferView */](view: T): js.Promise[ReadableStreamReadResult[T]] = js.native
  def releaseLock(): scala.Unit = js.native
}

@JSGlobal("ReadableStreamBYOBReader")
@js.native
object ReadableStreamBYOBReader
  extends org.scalablytyped.runtime.Instantiable1[/* stream */ ReadableStream[Uint8Array], ReadableStreamBYOBReader]


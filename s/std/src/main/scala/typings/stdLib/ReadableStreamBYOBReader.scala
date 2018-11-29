package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadableStreamBYOBReader extends js.Object {
  val closed: Promise[scala.Unit] = js.native
  def cancel(): Promise[scala.Unit] = js.native
  def cancel(reason: js.Any): Promise[scala.Unit] = js.native
  def read[T /* <: ArrayBufferView */](view: T): Promise[ReadableStreamReadResult[T]] = js.native
  def releaseLock(): scala.Unit = js.native
}

@JSGlobal("ReadableStreamBYOBReader")
@js.native
object ReadableStreamBYOBReader
  extends ScalablyTyped.runtime.Instantiable1[/* stream */ ReadableStream[Uint8Array], ReadableStreamBYOBReader]


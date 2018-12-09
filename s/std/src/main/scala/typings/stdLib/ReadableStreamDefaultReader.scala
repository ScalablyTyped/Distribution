package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadableStreamDefaultReader[R] extends js.Object {
  val closed: js.Promise[scala.Unit] = js.native
  def cancel(): js.Promise[scala.Unit] = js.native
  def cancel(reason: js.Any): js.Promise[scala.Unit] = js.native
  def read(): js.Promise[ReadableStreamReadResult[R]] = js.native
  def releaseLock(): scala.Unit = js.native
}


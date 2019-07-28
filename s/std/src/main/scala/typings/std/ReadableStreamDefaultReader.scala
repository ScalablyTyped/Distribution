package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadableStreamDefaultReader[R] extends js.Object {
  val closed: js.Promise[Unit] = js.native
  def cancel(): js.Promise[Unit] = js.native
  def cancel(reason: js.Any): js.Promise[Unit] = js.native
  def read(): js.Promise[ReadableStreamReadResult[R]] = js.native
  def releaseLock(): Unit = js.native
}


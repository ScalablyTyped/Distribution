package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadableStreamBYOBReader extends js.Object {
  val closed: js.Promise[Unit] = js.native
  def cancel(): js.Promise[Unit] = js.native
  def cancel(reason: js.Any): js.Promise[Unit] = js.native
  def read[T /* <: ArrayBufferView */](view: T): js.Promise[ReadableStreamReadResult[T]] = js.native
  def releaseLock(): Unit = js.native
}


package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadableStreamDefaultReader[R] extends js.Object {
  val closed: Promise[scala.Unit] = js.native
  def cancel(): Promise[scala.Unit] = js.native
  def cancel(reason: js.Any): Promise[scala.Unit] = js.native
  def read(): Promise[ReadableStreamReadResult[R]] = js.native
  def releaseLock(): scala.Unit = js.native
}


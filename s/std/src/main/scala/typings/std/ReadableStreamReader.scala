package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadableStreamReader[R] extends js.Object {
  def cancel(): js.Promise[Unit]
  def read(): js.Promise[ReadableStreamReadResult[R]]
  def releaseLock(): Unit
}

@JSGlobal("ReadableStreamReader")
@js.native
object ReadableStreamReader
  extends Instantiable0[ReadableStreamReader[js.Any]]


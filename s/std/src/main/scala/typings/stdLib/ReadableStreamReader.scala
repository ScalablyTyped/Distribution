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
object ReadableStreamReader
  extends org.scalablytyped.runtime.Instantiable0[ReadableStreamReader[js.Any]]


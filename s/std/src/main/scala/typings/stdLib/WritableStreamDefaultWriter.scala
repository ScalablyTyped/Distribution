package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WritableStreamDefaultWriter extends js.Object {
  val closed: Promise[scala.Unit] = js.native
  val desiredSize: scala.Double = js.native
  val ready: Promise[scala.Unit] = js.native
  def abort(): Promise[scala.Unit] = js.native
  def abort(reason: js.Any): Promise[scala.Unit] = js.native
  def close(): Promise[scala.Unit] = js.native
  def releaseLock(): scala.Unit = js.native
  def write(): Promise[_] = js.native
  def write(chunk: js.Any): Promise[_] = js.native
}

@JSGlobal("WritableStreamDefaultWriter")
@js.native
object WritableStreamDefaultWriter
  extends ScalablyTyped.runtime.Instantiable0[WritableStreamDefaultWriter]


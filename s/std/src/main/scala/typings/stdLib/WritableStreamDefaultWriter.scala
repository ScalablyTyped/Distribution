package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface of the Streams API is the object returned by WritableStream.getWriter() and once created locks the < writer to the WritableStream ensuring that no other streams can write to the underlying sink. */
@js.native
trait WritableStreamDefaultWriter[W] extends js.Object {
  val closed: js.Promise[scala.Unit] = js.native
  val desiredSize: scala.Double | scala.Null = js.native
  val ready: js.Promise[scala.Unit] = js.native
  def abort(): js.Promise[scala.Unit] = js.native
  def abort(reason: js.Any): js.Promise[scala.Unit] = js.native
  def close(): js.Promise[scala.Unit] = js.native
  def releaseLock(): scala.Unit = js.native
  def write(chunk: W): js.Promise[scala.Unit] = js.native
}


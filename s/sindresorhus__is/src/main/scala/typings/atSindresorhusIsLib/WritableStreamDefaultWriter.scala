package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WritableStreamDefaultWriter[W] extends js.Object {
  val closed: Promise[scala.Unit] = js.native
  val desiredSize: scala.Double | scala.Null = js.native
  val ready: Promise[scala.Unit] = js.native
  def abort(): Promise[scala.Unit] = js.native
  def abort(reason: js.Any): Promise[scala.Unit] = js.native
  def close(): Promise[scala.Unit] = js.native
  def releaseLock(): scala.Unit = js.native
  def write(chunk: W): Promise[scala.Unit] = js.native
}


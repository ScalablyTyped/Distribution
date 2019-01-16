package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformStreamDefaultController[O] extends js.Object {
  val desiredSize: scala.Double | scala.Null = js.native
  def enqueue(chunk: O): scala.Unit = js.native
  def error(): scala.Unit = js.native
  def error(reason: js.Any): scala.Unit = js.native
  def terminate(): scala.Unit = js.native
}


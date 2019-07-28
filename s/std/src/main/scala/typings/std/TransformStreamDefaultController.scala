package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformStreamDefaultController[O] extends js.Object {
  val desiredSize: Double | Null = js.native
  def enqueue(chunk: O): Unit = js.native
  def error(): Unit = js.native
  def error(reason: js.Any): Unit = js.native
  def terminate(): Unit = js.native
}


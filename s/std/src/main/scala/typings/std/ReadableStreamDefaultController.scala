package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadableStreamDefaultController[R] extends js.Object {
  val desiredSize: Double | Null = js.native
  def close(): Unit = js.native
  def enqueue(chunk: R): Unit = js.native
  def error(): Unit = js.native
  def error(error: js.Any): Unit = js.native
}


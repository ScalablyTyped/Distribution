package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadableByteStreamController extends js.Object {
  val byobRequest: js.UndefOr[ReadableStreamBYOBRequest] = js.native
  val desiredSize: Double | Null = js.native
  def close(): Unit = js.native
  def enqueue(chunk: ArrayBufferView): Unit = js.native
  def error(): Unit = js.native
  def error(error: js.Any): Unit = js.native
}


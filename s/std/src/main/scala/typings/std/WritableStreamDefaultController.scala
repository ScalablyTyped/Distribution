package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Streams API interface represents a controller allowing control of a WritableStream's state. When constructing a WritableStream, the underlying sink is given a corresponding WritableStreamDefaultController instance to manipulate. */
@js.native
trait WritableStreamDefaultController extends js.Object {
  def error(): Unit = js.native
  def error(error: js.Any): Unit = js.native
}


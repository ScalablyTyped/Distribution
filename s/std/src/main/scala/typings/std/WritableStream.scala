package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Streams API interface provides a standard abstraction for writing streaming data to a destination, known as a sink. This object comes with built-in backpressure and queuing. */
@js.native
trait WritableStream[W] extends js.Object {
  val locked: scala.Boolean = js.native
  def abort(): js.Promise[Unit] = js.native
  def abort(reason: js.Any): js.Promise[Unit] = js.native
  def getWriter(): WritableStreamDefaultWriter[W] = js.native
}


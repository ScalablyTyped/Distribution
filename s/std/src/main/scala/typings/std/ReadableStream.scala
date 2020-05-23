package typings.std

import typings.std.anon.Mode
import typings.std.anon.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Streams API interface represents a readable stream of byte data. The Fetch API offers a concrete instance of a ReadableStream through the body property of a Response object. */
@js.native
trait ReadableStream[R] extends js.Object {
  val locked: scala.Boolean = js.native
  def cancel(): js.Promise[Unit] = js.native
  def cancel(reason: js.Any): js.Promise[Unit] = js.native
  def getReader(): ReadableStreamDefaultReader[R] = js.native
  def getReader(options: Mode): ReadableStreamBYOBReader = js.native
  def pipeThrough[T](hasWritableReadable: Readable[R, T]): ReadableStream[T] = js.native
  def pipeThrough[T](hasWritableReadable: Readable[R, T], options: PipeOptions): ReadableStream[T] = js.native
  def pipeTo(dest: WritableStream[R]): js.Promise[Unit] = js.native
  def pipeTo(dest: WritableStream[R], options: PipeOptions): js.Promise[Unit] = js.native
  def tee(): js.Tuple2[ReadableStream[R], ReadableStream[R]] = js.native
}


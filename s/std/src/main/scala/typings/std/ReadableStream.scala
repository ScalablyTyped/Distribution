package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
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
  def getReader(options: AnonByob): ReadableStreamBYOBReader = js.native
  def pipeThrough[T](hasWritableReadable: AnonReadable[R, T]): ReadableStream[T] = js.native
  def pipeThrough[T](hasWritableReadable: AnonReadable[R, T], options: PipeOptions): ReadableStream[T] = js.native
  def pipeTo(dest: WritableStream[R]): js.Promise[Unit] = js.native
  def pipeTo(dest: WritableStream[R], options: PipeOptions): js.Promise[Unit] = js.native
  def tee(): js.Tuple2[ReadableStream[R], ReadableStream[R]] = js.native
}

@JSGlobal("ReadableStream")
@js.native
object ReadableStream
  extends Instantiable0[ReadableStream[js.Object]]
     with Instantiable1[
      (/* underlyingSource */ UnderlyingByteSource) | (/* underlyingSource */ UnderlyingSource[js.Object]), 
      ReadableStream[js.Object | Uint8Array]
    ]
     with Instantiable2[
      (/* underlyingSource */ UnderlyingByteSource) | (/* underlyingSource */ UnderlyingSource[js.Object]), 
      (/* strategy */ AnonHighWaterMarkSize) | (/* strategy */ QueuingStrategy[js.Object]), 
      ReadableStream[js.Object | Uint8Array]
    ]


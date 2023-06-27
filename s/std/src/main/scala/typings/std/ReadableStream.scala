package typings.std

import typings.std.anon.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Streams API interface represents a readable stream of byte data. The Fetch API offers a concrete instance of a ReadableStream through the body property of a Response object.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream)
  */
@js.native
trait ReadableStream[R] extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/cancel) */
  /* standard dom */
  def cancel(): js.Promise[Unit] = js.native
  def cancel(reason: Any): js.Promise[Unit] = js.native
  
  /* standard dom */
  def getReader(): ReadableStreamDefaultReader[R] = js.native
  def getReader(options: ReadableStreamGetReaderOptions): ReadableStreamReader[R] = js.native
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/getReader) */
  /* standard dom */
  def getReader(options: Mode): ReadableStreamBYOBReader = js.native
  /* standard dom */
  @JSName("getReader")
  def getReader_ReadableStreamReader(): ReadableStreamReader[R] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/locked) */
  /* standard dom */
  val locked: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/pipeThrough) */
  /* standard dom */
  def pipeThrough[T](transform: ReadableWritablePair[T, R]): ReadableStream[T] = js.native
  def pipeThrough[T](transform: ReadableWritablePair[T, R], options: StreamPipeOptions): ReadableStream[T] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/pipeTo) */
  /* standard dom */
  def pipeTo(destination: WritableStream[R]): js.Promise[Unit] = js.native
  def pipeTo(destination: WritableStream[R], options: StreamPipeOptions): js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/tee) */
  /* standard dom */
  def tee(): js.Tuple2[ReadableStream[R], ReadableStream[R]] = js.native
}

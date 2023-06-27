package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Streams API interface provides a standard abstraction for writing streaming data to a destination, known as a sink. This object comes with built-in backpressure and queuing.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStream)
  */
@js.native
trait WritableStream[W] extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStream/abort) */
  /* standard dom */
  def abort(): js.Promise[Unit] = js.native
  def abort(reason: Any): js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStream/close) */
  /* standard dom */
  def close(): js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStream/getWriter) */
  /* standard dom */
  def getWriter(): WritableStreamDefaultWriter[W] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStream/locked) */
  /* standard dom */
  val locked: scala.Boolean = js.native
}

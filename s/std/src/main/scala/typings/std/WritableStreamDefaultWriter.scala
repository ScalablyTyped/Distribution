package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Streams API interface is the object returned by WritableStream.getWriter() and once created locks the < writer to the WritableStream ensuring that no other streams can write to the underlying sink.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter)
  */
@js.native
trait WritableStreamDefaultWriter[W] extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/abort) */
  /* standard dom */
  def abort(): js.Promise[Unit] = js.native
  def abort(reason: Any): js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/close) */
  /* standard dom */
  def close(): js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/closed) */
  /* standard dom */
  val closed: js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/desiredSize) */
  /* standard dom */
  val desiredSize: Double | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/ready) */
  /* standard dom */
  val ready: js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/releaseLock) */
  /* standard dom */
  def releaseLock(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/write) */
  /* standard dom */
  def write(): js.Promise[Unit] = js.native
  def write(chunk: W): js.Promise[Unit] = js.native
}

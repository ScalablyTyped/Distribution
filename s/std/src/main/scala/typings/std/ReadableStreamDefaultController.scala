package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultController) */
@js.native
trait ReadableStreamDefaultController[R]
  extends StObject
     with ReadableStreamController[R] {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultController/close) */
  /* standard dom */
  def close(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultController/desiredSize) */
  /* standard dom */
  val desiredSize: Double | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultController/enqueue) */
  /* standard dom */
  def enqueue(): Unit = js.native
  def enqueue(chunk: R): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultController/error) */
  /* standard dom */
  def error(): Unit = js.native
  def error(e: Any): Unit = js.native
}

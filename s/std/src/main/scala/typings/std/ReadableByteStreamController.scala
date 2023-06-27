package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableByteStreamController) */
@js.native
trait ReadableByteStreamController
  extends StObject
     with ReadableStreamController[Any] {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableByteStreamController/byobRequest) */
  /* standard dom */
  val byobRequest: ReadableStreamBYOBRequest | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableByteStreamController/close) */
  /* standard dom */
  def close(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableByteStreamController/desiredSize) */
  /* standard dom */
  val desiredSize: Double | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableByteStreamController/enqueue) */
  /* standard dom */
  def enqueue(chunk: js.typedarray.ArrayBufferView): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableByteStreamController/error) */
  /* standard dom */
  def error(): Unit = js.native
  def error(e: Any): Unit = js.native
}

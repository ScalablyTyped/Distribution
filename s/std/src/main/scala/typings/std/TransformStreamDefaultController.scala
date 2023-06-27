package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStreamDefaultController) */
@js.native
trait TransformStreamDefaultController[O] extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStreamDefaultController/desiredSize) */
  /* standard dom */
  val desiredSize: Double | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStreamDefaultController/enqueue) */
  /* standard dom */
  def enqueue(): Unit = js.native
  def enqueue(chunk: O): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStreamDefaultController/error) */
  /* standard dom */
  def error(): Unit = js.native
  def error(reason: Any): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStreamDefaultController/terminate) */
  /* standard dom */
  def terminate(): Unit = js.native
}

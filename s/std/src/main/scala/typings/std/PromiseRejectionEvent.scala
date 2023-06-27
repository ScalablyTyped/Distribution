package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PromiseRejectionEvent) */
@js.native
trait PromiseRejectionEvent
  extends StObject
     with Event {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PromiseRejectionEvent/promise) */
  /* standard dom */
  val promise: js.Promise[Any] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PromiseRejectionEvent/reason) */
  /* standard dom */
  val reason: Any = js.native
}

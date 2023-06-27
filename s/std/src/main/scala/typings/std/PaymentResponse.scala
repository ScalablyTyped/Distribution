package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Payment Request API interface is returned after a user selects a payment method and approves a payment request.
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse)
  */
@js.native
trait PaymentResponse
  extends StObject
     with EventTarget {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/complete) */
  /* standard dom */
  def complete(): js.Promise[Unit] = js.native
  def complete(result: PaymentComplete): js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/details) */
  /* standard dom */
  val details: Any = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/methodName) */
  /* standard dom */
  val methodName: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/requestId) */
  /* standard dom */
  val requestId: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/retry) */
  /* standard dom */
  def retry(): js.Promise[Unit] = js.native
  def retry(errorFields: PaymentValidationErrors): js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/toJSON) */
  /* standard dom */
  def toJSON(): Any = js.native
}

package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentMethodChangeEvent)
  */
@js.native
trait PaymentMethodChangeEvent
  extends StObject
     with PaymentRequestUpdateEvent {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentMethodChangeEvent/methodDetails) */
  /* standard dom */
  val methodDetails: Any = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentMethodChangeEvent/methodName) */
  /* standard dom */
  val methodName: java.lang.String = js.native
}

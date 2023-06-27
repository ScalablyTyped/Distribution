package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Payment Request API interface enables a web page to update the details of a PaymentRequest in response to a user action.
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequestUpdateEvent)
  */
@js.native
trait PaymentRequestUpdateEvent
  extends StObject
     with Event {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequestUpdateEvent/updateWith) */
  /* standard dom */
  def updateWith(detailsPromise: PaymentDetailsUpdate): Unit = js.native
  def updateWith(detailsPromise: PromiseLike[PaymentDetailsUpdate]): Unit = js.native
}

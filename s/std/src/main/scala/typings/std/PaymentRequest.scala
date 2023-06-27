package typings.std

import typings.std.stdStrings.paymentmethodchange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Payment Request API interface is the primary access point into the API, and lets web content and apps accept payments from the end user.
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest)
  */
@js.native
trait PaymentRequest
  extends StObject
     with EventTarget {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/abort) */
  /* standard dom */
  def abort(): js.Promise[Unit] = js.native
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_paymentmethodchange(`type`: paymentmethodchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paymentmethodchange(
    `type`: paymentmethodchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paymentmethodchange(
    `type`: paymentmethodchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/canMakePayment) */
  /* standard dom */
  def canMakePayment(): js.Promise[scala.Boolean] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/id) */
  /* standard dom */
  val id: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/paymentmethodchange_event) */
  /* standard dom */
  var onpaymentmethodchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_paymentmethodchange(`type`: paymentmethodchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paymentmethodchange(
    `type`: paymentmethodchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paymentmethodchange(
    `type`: paymentmethodchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/show) */
  /* standard dom */
  def show(): js.Promise[PaymentResponse] = js.native
  def show(detailsPromise: PaymentDetailsUpdate): js.Promise[PaymentResponse] = js.native
  def show(detailsPromise: PromiseLike[PaymentDetailsUpdate]): js.Promise[PaymentResponse] = js.native
}

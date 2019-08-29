package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Payment Request API interface enables a web page to update the details of a PaymentRequest in response to a user action. */
@js.native
trait PaymentRequestUpdateEvent extends Event {
  def updateWith(detailsPromise: js.Promise[PaymentDetailsUpdate]): Unit = js.native
  def updateWith(detailsPromise: PaymentDetailsUpdate): Unit = js.native
}

@JSGlobal("PaymentRequestUpdateEvent")
@js.native
class PaymentRequestUpdateEventCls protected () extends PaymentRequestUpdateEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: PaymentRequestUpdateEventInit) = this()
}

@JSGlobal("PaymentRequestUpdateEvent")
@js.native
object PaymentRequestUpdateEvent
  extends Instantiable1[/* type */ java.lang.String, PaymentRequestUpdateEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ PaymentRequestUpdateEventInit, 
      PaymentRequestUpdateEvent
    ]


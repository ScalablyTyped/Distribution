package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentRequestUpdateEvent extends Event {
  def updateWith(detailsPromise: js.Promise[PaymentDetailsUpdate]): scala.Unit = js.native
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
  extends org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, PaymentRequestUpdateEvent]
     with org.scalablytyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ PaymentRequestUpdateEventInit, 
      PaymentRequestUpdateEvent
    ]


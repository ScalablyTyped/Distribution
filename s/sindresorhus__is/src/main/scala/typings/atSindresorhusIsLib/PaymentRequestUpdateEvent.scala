package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentRequestUpdateEvent extends Event {
  def updateWith(detailsPromise: Promise[PaymentDetailsUpdate]): scala.Unit = js.native
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


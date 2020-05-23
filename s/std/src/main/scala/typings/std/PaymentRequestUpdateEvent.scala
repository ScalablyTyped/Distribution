package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Payment Request API interface enables a web page to update the details of a PaymentRequest in response to a user action. */
@js.native
trait PaymentRequestUpdateEvent extends Event {
  def updateWith(detailsPromise: js.Promise[PaymentDetailsUpdate]): Unit = js.native
  def updateWith(detailsPromise: PaymentDetailsUpdate): Unit = js.native
}


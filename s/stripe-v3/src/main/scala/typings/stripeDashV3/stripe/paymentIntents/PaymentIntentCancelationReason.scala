package typings.stripeDashV3.stripe.paymentIntents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripeDashV3.stripeDashV3Strings.duplicate
  - typings.stripeDashV3.stripeDashV3Strings.fraudulent
  - typings.stripeDashV3.stripeDashV3Strings.requested_by_customer
  - typings.stripeDashV3.stripeDashV3Strings.abandoned
  - typings.stripeDashV3.stripeDashV3Strings.failed_invoice
  - typings.stripeDashV3.stripeDashV3Strings.void_invoice
  - typings.stripeDashV3.stripeDashV3Strings.automatic
*/
trait PaymentIntentCancelationReason extends js.Object

object PaymentIntentCancelationReason {
  @scala.inline
  def abandoned: typings.stripeDashV3.stripeDashV3Strings.abandoned = this.cast("abandoned")
  @scala.inline
  def automatic: typings.stripeDashV3.stripeDashV3Strings.automatic = this.cast("automatic")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def duplicate: typings.stripeDashV3.stripeDashV3Strings.duplicate = this.cast("duplicate")
  @scala.inline
  def failed_invoice: typings.stripeDashV3.stripeDashV3Strings.failed_invoice = this.cast("failed_invoice")
  @scala.inline
  def fraudulent: typings.stripeDashV3.stripeDashV3Strings.fraudulent = this.cast("fraudulent")
  @scala.inline
  def requested_by_customer: typings.stripeDashV3.stripeDashV3Strings.requested_by_customer = this.cast("requested_by_customer")
  @scala.inline
  def void_invoice: typings.stripeDashV3.stripeDashV3Strings.void_invoice = this.cast("void_invoice")
}


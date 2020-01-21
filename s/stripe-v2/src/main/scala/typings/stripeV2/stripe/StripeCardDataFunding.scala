package typings.stripeV2.stripe

import typings.stripeV2.stripeV2Strings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripeV2.stripeV2Strings.credit
  - typings.stripeV2.stripeV2Strings.debit
  - typings.stripeV2.stripeV2Strings.prepaid
  - typings.stripeV2.stripeV2Strings.unknown_
*/
trait StripeCardDataFunding extends js.Object

object StripeCardDataFunding {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def credit: typings.stripeV2.stripeV2Strings.credit = this.cast("credit")
  @scala.inline
  def debit: typings.stripeV2.stripeV2Strings.debit = this.cast("debit")
  @scala.inline
  def prepaid: typings.stripeV2.stripeV2Strings.prepaid = this.cast("prepaid")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}


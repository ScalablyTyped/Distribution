package typings.stripeDashV2.stripe

import typings.stripeDashV2.stripeDashV2Strings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripeDashV2.stripeDashV2Strings.credit
  - typings.stripeDashV2.stripeDashV2Strings.debit
  - typings.stripeDashV2.stripeDashV2Strings.prepaid
  - typings.stripeDashV2.stripeDashV2Strings.unknown_
*/
trait StripeCardDataFunding extends js.Object

object StripeCardDataFunding {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def credit: typings.stripeDashV2.stripeDashV2Strings.credit = this.cast("credit")
  @scala.inline
  def debit: typings.stripeDashV2.stripeDashV2Strings.debit = this.cast("debit")
  @scala.inline
  def prepaid: typings.stripeDashV2.stripeDashV2Strings.prepaid = this.cast("prepaid")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}


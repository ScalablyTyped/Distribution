package typings.stripeDashV3.stripe.setupIntents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripeDashV3.stripeDashV3Strings.abandoned
  - typings.stripeDashV3.stripeDashV3Strings.requested_by_customer
  - typings.stripeDashV3.stripeDashV3Strings.duplicate
*/
trait SetupIntentCancelationReason extends js.Object

object SetupIntentCancelationReason {
  @scala.inline
  def abandoned: typings.stripeDashV3.stripeDashV3Strings.abandoned = this.cast("abandoned")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def duplicate: typings.stripeDashV3.stripeDashV3Strings.duplicate = this.cast("duplicate")
  @scala.inline
  def requested_by_customer: typings.stripeDashV3.stripeDashV3Strings.requested_by_customer = this.cast("requested_by_customer")
}


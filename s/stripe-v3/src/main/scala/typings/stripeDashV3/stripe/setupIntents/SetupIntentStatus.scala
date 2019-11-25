package typings.stripeDashV3.stripe.setupIntents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripeDashV3.stripeDashV3Strings.requires_payment_method
  - typings.stripeDashV3.stripeDashV3Strings.requires_confirmation
  - typings.stripeDashV3.stripeDashV3Strings.requires_action
  - typings.stripeDashV3.stripeDashV3Strings.processing
  - typings.stripeDashV3.stripeDashV3Strings.canceled
  - typings.stripeDashV3.stripeDashV3Strings.succeeded
*/
trait SetupIntentStatus extends js.Object

object SetupIntentStatus {
  @scala.inline
  def canceled: typings.stripeDashV3.stripeDashV3Strings.canceled = this.cast("canceled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def processing: typings.stripeDashV3.stripeDashV3Strings.processing = this.cast("processing")
  @scala.inline
  def requires_action: typings.stripeDashV3.stripeDashV3Strings.requires_action = this.cast("requires_action")
  @scala.inline
  def requires_confirmation: typings.stripeDashV3.stripeDashV3Strings.requires_confirmation = this.cast("requires_confirmation")
  @scala.inline
  def requires_payment_method: typings.stripeDashV3.stripeDashV3Strings.requires_payment_method = this.cast("requires_payment_method")
  @scala.inline
  def succeeded: typings.stripeDashV3.stripeDashV3Strings.succeeded = this.cast("succeeded")
}


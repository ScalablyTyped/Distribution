package typings.stripeDashV2.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripeDashV2.stripeDashV2Strings.postalAddress
  - typings.stripeDashV2.stripeDashV2Strings.name
*/
trait StripeApplePayBillingContactField extends js.Object

object StripeApplePayBillingContactField {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def name: typings.stripeDashV2.stripeDashV2Strings.name = this.cast("name")
  @scala.inline
  def postalAddress: typings.stripeDashV2.stripeDashV2Strings.postalAddress = this.cast("postalAddress")
}


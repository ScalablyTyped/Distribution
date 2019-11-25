package typings.stripeDashV2.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripeDashV2.stripeDashV2Strings.phone
  - typings.stripeDashV2.stripeDashV2Strings.email
  - typings.stripeDashV2.stripeDashV2Strings.postalAddress
  - typings.stripeDashV2.stripeDashV2Strings.name
*/
trait StripeApplePayShippingContactField extends js.Object

object StripeApplePayShippingContactField {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def email: typings.stripeDashV2.stripeDashV2Strings.email = this.cast("email")
  @scala.inline
  def name: typings.stripeDashV2.stripeDashV2Strings.name = this.cast("name")
  @scala.inline
  def phone: typings.stripeDashV2.stripeDashV2Strings.phone = this.cast("phone")
  @scala.inline
  def postalAddress: typings.stripeDashV2.stripeDashV2Strings.postalAddress = this.cast("postalAddress")
}


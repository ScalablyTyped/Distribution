package typings.stripeDashV3.stripe.paymentMethod

import typings.stripeDashV3.stripeDashV3Strings.discover_
import typings.stripeDashV3.stripeDashV3Strings.jcb_
import typings.stripeDashV3.stripeDashV3Strings.mastercard_
import typings.stripeDashV3.stripeDashV3Strings.unknown_
import typings.stripeDashV3.stripeDashV3Strings.visa_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripeDashV3.stripeDashV3Strings.amex
  - typings.stripeDashV3.stripeDashV3Strings.diners
  - typings.stripeDashV3.stripeDashV3Strings.discover_
  - typings.stripeDashV3.stripeDashV3Strings.jcb_
  - typings.stripeDashV3.stripeDashV3Strings.mastercard_
  - typings.stripeDashV3.stripeDashV3Strings.unionpay
  - typings.stripeDashV3.stripeDashV3Strings.visa_
  - typings.stripeDashV3.stripeDashV3Strings.unknown_
*/
trait paymentMethodCardBrand extends js.Object

object paymentMethodCardBrand {
  @scala.inline
  def amex: typings.stripeDashV3.stripeDashV3Strings.amex = this.cast("amex")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def diners: typings.stripeDashV3.stripeDashV3Strings.diners = this.cast("diners")
  @scala.inline
  def discover: discover_ = this.cast("discover")
  @scala.inline
  def jcb: jcb_ = this.cast("jcb")
  @scala.inline
  def mastercard: mastercard_ = this.cast("mastercard")
  @scala.inline
  def unionpay: typings.stripeDashV3.stripeDashV3Strings.unionpay = this.cast("unionpay")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def visa: visa_ = this.cast("visa")
}


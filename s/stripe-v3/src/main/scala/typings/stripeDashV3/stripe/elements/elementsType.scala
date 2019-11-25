package typings.stripeDashV3.stripe.elements

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripeDashV3.stripeDashV3Strings.card
  - typings.stripeDashV3.stripeDashV3Strings.cardNumber
  - typings.stripeDashV3.stripeDashV3Strings.cardExpiry
  - typings.stripeDashV3.stripeDashV3Strings.cardCvc
  - typings.stripeDashV3.stripeDashV3Strings.postalCode
  - typings.stripeDashV3.stripeDashV3Strings.paymentRequestButton
  - typings.stripeDashV3.stripeDashV3Strings.iban
  - typings.stripeDashV3.stripeDashV3Strings.idealBank
*/
trait elementsType extends js.Object

object elementsType {
  @scala.inline
  def card: typings.stripeDashV3.stripeDashV3Strings.card = this.cast("card")
  @scala.inline
  def cardCvc: typings.stripeDashV3.stripeDashV3Strings.cardCvc = this.cast("cardCvc")
  @scala.inline
  def cardExpiry: typings.stripeDashV3.stripeDashV3Strings.cardExpiry = this.cast("cardExpiry")
  @scala.inline
  def cardNumber: typings.stripeDashV3.stripeDashV3Strings.cardNumber = this.cast("cardNumber")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def iban: typings.stripeDashV3.stripeDashV3Strings.iban = this.cast("iban")
  @scala.inline
  def idealBank: typings.stripeDashV3.stripeDashV3Strings.idealBank = this.cast("idealBank")
  @scala.inline
  def paymentRequestButton: typings.stripeDashV3.stripeDashV3Strings.paymentRequestButton = this.cast("paymentRequestButton")
  @scala.inline
  def postalCode: typings.stripeDashV3.stripeDashV3Strings.postalCode = this.cast("postalCode")
}


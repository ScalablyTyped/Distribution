package typings.reactStripeElements.mod.ReactStripeElements

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// From https://stripe.com/docs/stripe-js/reference#element-types
/* Rewritten from type alias, can be one of: 
  - typings.reactStripeElements.reactStripeElementsStrings.card
  - typings.reactStripeElements.reactStripeElementsStrings.cardNumber
  - typings.reactStripeElements.reactStripeElementsStrings.cardExpiry
  - typings.reactStripeElements.reactStripeElementsStrings.cardCvc
  - typings.reactStripeElements.reactStripeElementsStrings.paymentRequestButton
  - typings.reactStripeElements.reactStripeElementsStrings.iban
  - typings.reactStripeElements.reactStripeElementsStrings.idealBank
*/
trait TokenType extends js.Object

object TokenType {
  @scala.inline
  def card: typings.reactStripeElements.reactStripeElementsStrings.card = this.cast("card")
  @scala.inline
  def cardCvc: typings.reactStripeElements.reactStripeElementsStrings.cardCvc = this.cast("cardCvc")
  @scala.inline
  def cardExpiry: typings.reactStripeElements.reactStripeElementsStrings.cardExpiry = this.cast("cardExpiry")
  @scala.inline
  def cardNumber: typings.reactStripeElements.reactStripeElementsStrings.cardNumber = this.cast("cardNumber")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def iban: typings.reactStripeElements.reactStripeElementsStrings.iban = this.cast("iban")
  @scala.inline
  def idealBank: typings.reactStripeElements.reactStripeElementsStrings.idealBank = this.cast("idealBank")
  @scala.inline
  def paymentRequestButton: typings.reactStripeElements.reactStripeElementsStrings.paymentRequestButton = this.cast("paymentRequestButton")
}


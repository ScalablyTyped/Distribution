package typings.reactDashStripeDashElements.reactDashStripeDashElementsMod.ReactStripeElements

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// From https://stripe.com/docs/stripe-js/reference#element-types
/* Rewritten from type alias, can be one of: 
  - typings.reactDashStripeDashElements.reactDashStripeDashElementsStrings.card
  - typings.reactDashStripeDashElements.reactDashStripeDashElementsStrings.cardNumber
  - typings.reactDashStripeDashElements.reactDashStripeDashElementsStrings.cardExpiry
  - typings.reactDashStripeDashElements.reactDashStripeDashElementsStrings.cardCvc
  - typings.reactDashStripeDashElements.reactDashStripeDashElementsStrings.paymentRequestButton
  - typings.reactDashStripeDashElements.reactDashStripeDashElementsStrings.iban
  - typings.reactDashStripeDashElements.reactDashStripeDashElementsStrings.idealBank
*/
trait TokenType extends js.Object

object TokenType {
  @scala.inline
  def card: typings.reactDashStripeDashElements.reactDashStripeDashElementsStrings.card = this.cast("card")
  @scala.inline
  def cardCvc: typings.reactDashStripeDashElements.reactDashStripeDashElementsStrings.cardCvc = this.cast("cardCvc")
  @scala.inline
  def cardExpiry: typings.reactDashStripeDashElements.reactDashStripeDashElementsStrings.cardExpiry = this.cast("cardExpiry")
  @scala.inline
  def cardNumber: typings.reactDashStripeDashElements.reactDashStripeDashElementsStrings.cardNumber = this.cast("cardNumber")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def iban: typings.reactDashStripeDashElements.reactDashStripeDashElementsStrings.iban = this.cast("iban")
  @scala.inline
  def idealBank: typings.reactDashStripeDashElements.reactDashStripeDashElementsStrings.idealBank = this.cast("idealBank")
  @scala.inline
  def paymentRequestButton: typings.reactDashStripeDashElements.reactDashStripeDashElementsStrings.paymentRequestButton = this.cast("paymentRequestButton")
}


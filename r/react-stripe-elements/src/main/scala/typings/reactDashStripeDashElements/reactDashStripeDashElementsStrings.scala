package typings.reactDashStripeDashElements

import typings.reactDashStripeDashElements.reactDashStripeDashElementsMod.ReactStripeElementsNs.TokenType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashStripeDashElementsStrings {
  @js.native
  sealed trait card extends TokenType
  
  @js.native
  sealed trait cardCvc extends TokenType
  
  @js.native
  sealed trait cardExpiry extends TokenType
  
  @js.native
  sealed trait cardNumber extends TokenType
  
  @js.native
  sealed trait iban extends TokenType
  
  @js.native
  sealed trait idealBank extends TokenType
  
  @js.native
  sealed trait paymentRequestButton extends TokenType
  
  @scala.inline
  def card: card = "card".asInstanceOf[card]
  @scala.inline
  def cardCvc: cardCvc = "cardCvc".asInstanceOf[cardCvc]
  @scala.inline
  def cardExpiry: cardExpiry = "cardExpiry".asInstanceOf[cardExpiry]
  @scala.inline
  def cardNumber: cardNumber = "cardNumber".asInstanceOf[cardNumber]
  @scala.inline
  def iban: iban = "iban".asInstanceOf[iban]
  @scala.inline
  def idealBank: idealBank = "idealBank".asInstanceOf[idealBank]
  @scala.inline
  def paymentRequestButton: paymentRequestButton = "paymentRequestButton".asInstanceOf[paymentRequestButton]
}


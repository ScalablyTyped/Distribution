package typings.reactStripeElements

import typings.reactStripeElements.mod.ReactStripeElements.TokenType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactStripeElementsStrings {
  
  @js.native
  sealed trait card
    extends StObject
       with TokenType
  inline def card: card = "card".asInstanceOf[card]
  
  @js.native
  sealed trait cardCvc
    extends StObject
       with TokenType
  inline def cardCvc: cardCvc = "cardCvc".asInstanceOf[cardCvc]
  
  @js.native
  sealed trait cardExpiry
    extends StObject
       with TokenType
  inline def cardExpiry: cardExpiry = "cardExpiry".asInstanceOf[cardExpiry]
  
  @js.native
  sealed trait cardNumber
    extends StObject
       with TokenType
  inline def cardNumber: cardNumber = "cardNumber".asInstanceOf[cardNumber]
  
  @js.native
  sealed trait iban
    extends StObject
       with TokenType
  inline def iban: iban = "iban".asInstanceOf[iban]
  
  @js.native
  sealed trait idealBank
    extends StObject
       with TokenType
  inline def idealBank: idealBank = "idealBank".asInstanceOf[idealBank]
  
  @js.native
  sealed trait paymentRequestButton
    extends StObject
       with TokenType
  inline def paymentRequestButton: paymentRequestButton = "paymentRequestButton".asInstanceOf[paymentRequestButton]
}

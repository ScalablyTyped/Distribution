package typings.reactNativeSquareInAppPayments.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardDetails extends StObject {
  
  /** Non-confidential details about the entered card, such as the brand and last four digits of the card number. */
  var card: Card
  
  /** A one-time-use payment token that can be used with the Square Connect APIs to charge the card or save the card information. */
  var nonce: String
}
object CardDetails {
  
  @scala.inline
  def apply(card: Card, nonce: String): CardDetails = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardDetails]
  }
  
  @scala.inline
  implicit class CardDetailsMutableBuilder[Self <: CardDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCard(value: Card): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
  }
}

package typings.reactNativeSquareInAppPayments.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardDetails extends js.Object {
  
  /** Non-confidential details about the entered card, such as the brand and last four digits of the card number. */
  var card: Card = js.native
  
  /** A one-time-use payment token that can be used with the Square Connect APIs to charge the card or save the card information. */
  var nonce: String = js.native
}
object CardDetails {
  
  @scala.inline
  def apply(card: Card, nonce: String): CardDetails = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardDetails]
  }
  
  @scala.inline
  implicit class CardDetailsOps[Self <: CardDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCard(value: Card): Self = this.set("card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
  }
}

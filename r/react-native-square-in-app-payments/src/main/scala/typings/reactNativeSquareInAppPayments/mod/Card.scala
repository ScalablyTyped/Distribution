package typings.reactNativeSquareInAppPayments.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Card extends js.Object {
  
  /** The brand (for example, VISA) of the card. */
  var brand: Brand = js.native
  
  /** The expiration month of the card. Ranges between 1 and 12, with 1 corresponding to January and 12 to December. */
  var expirationMonth: Double = js.native
  
  /** The four-digit expiration year of the card. */
  var expirationYear: Double = js.native
  
  /** The last 4 digits of this card's number. */
  var lastFourDigits: String = js.native
  
  /** The billing postal code associated with the card. */
  var postalCode: String | Null = js.native
  
  /** The prepaid type of the credit card (for example, a Prepaid Gift Card). Note: This property is experimental and will always return UNKNOWN */
  var prepaidType: CardPrepaidType = js.native
  
  /** The type of card (for example, Credit or Debit). Note: This property is experimental and will always return UNKNOWN */
  var `type`: CardType = js.native
}
object Card {
  
  @scala.inline
  def apply(
    brand: Brand,
    expirationMonth: Double,
    expirationYear: Double,
    lastFourDigits: String,
    prepaidType: CardPrepaidType,
    `type`: CardType
  ): Card = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], expirationMonth = expirationMonth.asInstanceOf[js.Any], expirationYear = expirationYear.asInstanceOf[js.Any], lastFourDigits = lastFourDigits.asInstanceOf[js.Any], prepaidType = prepaidType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Card]
  }
  
  @scala.inline
  implicit class CardOps[Self <: Card] (val x: Self) extends AnyVal {
    
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
    def setBrand(value: Brand): Self = this.set("brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationMonth(value: Double): Self = this.set("expirationMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationYear(value: Double): Self = this.set("expirationYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastFourDigits(value: String): Self = this.set("lastFourDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrepaidType(value: CardPrepaidType): Self = this.set("prepaidType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CardType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeNull: Self = this.set("postalCode", null)
  }
}

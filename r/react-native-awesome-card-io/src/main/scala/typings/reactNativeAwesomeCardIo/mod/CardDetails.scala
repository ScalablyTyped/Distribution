package typings.reactNativeAwesomeCardIo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardDetails extends js.Object {
  /**  Card number. */
  var cardNumber: String = js.native
  /**  Localized card type. */
  var cardType: String = js.native
  /**  Card holder name. */
  var cardholderName: String = js.native
  /**  Security code. */
  var cvv: String = js.native
  /**  Expiry month with january as 1 (may be 0 if expiry information was not requested). */
  var expiryMonth: Double = js.native
  /**  Expiry year (may be 0 if expiry information was not requested). */
  var expiryYear: Double = js.native
  /**  Postal code. Format is country dependent. */
  var postalCode: String = js.native
  /**  Card number with all but the last four digits obfuscated. */
  var redactedCardNumber: String = js.native
  /**  - Was the card number scanned (as opposed to entered manually)? */
  var scanned: js.UndefOr[Boolean] = js.native
}

object CardDetails {
  @scala.inline
  def apply(
    cardNumber: String,
    cardType: String,
    cardholderName: String,
    cvv: String,
    expiryMonth: Double,
    expiryYear: Double,
    postalCode: String,
    redactedCardNumber: String
  ): CardDetails = {
    val __obj = js.Dynamic.literal(cardNumber = cardNumber.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], cardholderName = cardholderName.asInstanceOf[js.Any], cvv = cvv.asInstanceOf[js.Any], expiryMonth = expiryMonth.asInstanceOf[js.Any], expiryYear = expiryYear.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], redactedCardNumber = redactedCardNumber.asInstanceOf[js.Any])
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
    def setCardNumber(value: String): Self = this.set("cardNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setCardType(value: String): Self = this.set("cardType", value.asInstanceOf[js.Any])
    @scala.inline
    def setCardholderName(value: String): Self = this.set("cardholderName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCvv(value: String): Self = this.set("cvv", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpiryMonth(value: Double): Self = this.set("expiryMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpiryYear(value: Double): Self = this.set("expiryYear", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedactedCardNumber(value: String): Self = this.set("redactedCardNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setScanned(value: Boolean): Self = this.set("scanned", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScanned: Self = this.set("scanned", js.undefined)
  }
  
}


package typings.reactNativeAwesomeCardIo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardDetails extends js.Object {
  /**  Card number. */
  var cardNumber: String
  /**  Localized card type. */
  var cardType: String
  /**  Card holder name. */
  var cardholderName: String
  /**  Security code. */
  var cvv: String
  /**  Expiry month with january as 1 (may be 0 if expiry information was not requested). */
  var expiryMonth: Double
  /**  Expiry year (may be 0 if expiry information was not requested). */
  var expiryYear: Double
  /**  Postal code. Format is country dependent. */
  var postalCode: String
  /**  Card number with all but the last four digits obfuscated. */
  var redactedCardNumber: String
  /**  - Was the card number scanned (as opposed to entered manually)? */
  var scanned: js.UndefOr[Boolean] = js.undefined
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
    redactedCardNumber: String,
    scanned: js.UndefOr[Boolean] = js.undefined
  ): CardDetails = {
    val __obj = js.Dynamic.literal(cardNumber = cardNumber.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], cardholderName = cardholderName.asInstanceOf[js.Any], cvv = cvv.asInstanceOf[js.Any], expiryMonth = expiryMonth.asInstanceOf[js.Any], expiryYear = expiryYear.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], redactedCardNumber = redactedCardNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(scanned)) __obj.updateDynamic("scanned")(scanned.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardDetails]
  }
}


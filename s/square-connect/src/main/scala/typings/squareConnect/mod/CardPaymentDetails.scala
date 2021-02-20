package typings.squareConnect.mod

import typings.squareConnect.squareConnectStrings.FAILURE
import typings.squareConnect.squareConnectStrings.SUCCESS
import typings.squareConnect.squareConnectStrings.UNKNOWN
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CardPaymentDetails")
@js.native
class CardPaymentDetails () extends StObject {
  
  /**
    * For EMV payments, the cryptogram generated for the payment.
    */
  var application_cryptogram: js.UndefOr[String] = js.native
  
  /**
    * For EMV payments, identifies the EMV application used for the payment.
    */
  var application_identifier: js.UndefOr[String] = js.native
  
  /**
    * For EMV payments, the human-readable name of the EMV application used for the payment.
    */
  var application_name: js.UndefOr[String] = js.native
  
  /**
    * Status code returned by the card issuer that describes the payment's authorization status.
    */
  var auth_result_code: js.UndefOr[String] = js.native
  
  /**
    * Status code returned from the Address Verification System (AVS) check. Can be `AVS_ACCEPTED`, `AVS_REJECTED`, `AVS_NOT_CHECKED`.
    */
  var avs_status: js.UndefOr[String] = js.native
  
  /**
    * The credit card's non-confidential details.
    */
  var card: js.UndefOr[Card] = js.native
  
  /**
    * Status code returned from the Card Verification Value (CVV) check. Can be `CVV_ACCEPTED`, `CVV_REJECTED`, `CVV_NOT_CHECKED`.
    */
  var cvv_status: js.UndefOr[String] = js.native
  
  /**
    * Details about the device that took the payment.
    */
  var device_details: js.UndefOr[DeviceDetails] = js.native
  
  /**
    * The method used to enter the card's details for the payment. Can be `KEYED`, `SWIPED`, `EMV`, `ON_FILE`, or `CONTACTLESS`.
    */
  var entry_method: js.UndefOr[String] = js.native
  
  /**
    * Information on errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  
  /**
    * Whether or not the card is required to be physically present in order for the payment to be refunded.
    * If true, the card is required to be present.
    */
  var refund_requires_card_presence: Boolean = js.native
  
  /**
    * The statement description sent to the card networks.
    * @note The actual statement description will vary and is likely to be truncated and appended with additional
    * information on a per issuer basis.
    */
  var statement_description: js.UndefOr[String] = js.native
  
  /**
    * The card payment's current state. It can be one of: `AUTHORIZED`, `CAPTURED`, `VOIDED`, `FAILED`.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * For EMV payments, method used to verify the cardholder's identity.
    * Can be one of `PIN`, `SIGNATURE`, `PIN_AND_SIGNATURE`, `ON_DEVICE`, or `NONE`.
    */
  var verification_method: js.UndefOr[String] = js.native
  
  /**
    * For EMV payments, the results of the cardholder verification.
    */
  var verification_results: js.UndefOr[SUCCESS | FAILURE | UNKNOWN] = js.native
}

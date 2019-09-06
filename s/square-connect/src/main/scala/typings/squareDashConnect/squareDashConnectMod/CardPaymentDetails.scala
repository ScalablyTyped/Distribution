package typings.squareDashConnect.squareDashConnectMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CardPaymentDetails")
@js.native
class CardPaymentDetails () extends js.Object {
  /**
    * For EMV payments, the cryptogram generated for the payment.
    */
  var application_cryptogram: js.UndefOr[String] = js.native
  /**
    * For EMV payments, identifies the EMV application used for the payment
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
    * Status code returned from the Address Verification System (AVS) check.
    */
  var avs_status: js.UndefOr[String] = js.native
  /**
    * The credit card's non-confidential details.
    */
  var card: js.UndefOr[Card] = js.native
  /**
    * Status code returned from the Card Verification Value (CVV) check.
    */
  var cvv_status: js.UndefOr[String] = js.native
  /**
    * The method used to enter the card's details for the payment. Can be `KEYED`, `SWIPED`, `EMV`, `ON_FILE`, or `CONTACTLESS`.
    */
  var entry_method: js.UndefOr[String] = js.native
  /**
    * Information on errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  /**
    * The card payment's current state. It can be one of: `AUTHORIZED`, `CAPTURED`, `VOIDED`, `FAILED`.
    */
  var status: js.UndefOr[String] = js.native
}


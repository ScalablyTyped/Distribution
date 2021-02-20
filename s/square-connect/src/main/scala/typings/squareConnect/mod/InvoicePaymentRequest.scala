package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "InvoicePaymentRequest")
@js.native
class InvoicePaymentRequest () extends StObject {
  
  /**
    * If the request method is `CHARGE_CARD_ON_FILE`, this field provides the card to charge.
    */
  var card_id: js.UndefOr[String] = js.native
  
  /**
    * The payment request amount, computed using the order amount and information from the various payment
    * request fields (`invoice_request_type`,  `fixed_amount_requested_money`, and `percentage_requested`).
    */
  var computed_amount_money: js.UndefOr[Money] = js.native
  
  /**
    * The due date (in the invoice location's time zone) for the payment request. After this date, the invoice becomes overdue.
    */
  var due_date: js.UndefOr[String] = js.native
  
  /**
    * If the payment request specifies `DEPOSIT` or `INSTALLMENT` as the  `request_type`, this indicates the request amount.
    * You cannot specify this when `request_type` is `BALANCE` or when the  payment request includes the `percentage_requested` field.
    */
  var fixed_amount_requested_money: js.UndefOr[Money] = js.native
  
  /**
    * Specifies the amount for the payment request in percentage:
    *  - When the payment `request_type` is `DEPOSIT`, it is the percentage of the order total amount.
    *  - When the payment `request_type` is `INSTALLMENT`, it is the percentage of the order total less  the deposit,
    *      if requested. The sum of the `percentage_requested` in all installment  payment requests must be equal to 100.
    *      You cannot specify this when the payment `request_type` is `BALANCE` or when the  payment request specifies the
    *      `fixed_amount_requested_money` field.
    */
  var percentage_requested: js.UndefOr[String] = js.native
  
  /**
    * A list of one or more reminders to send for the payment request.
    */
  var reminders: js.UndefOr[js.Array[InvoicePaymentReminder]] = js.native
  
  /**
    * Indicates how Square processes the payment request. See [InvoiceRequestMethod](#type-invoicerequestmethod) for possible values.
    */
  var request_method: js.UndefOr[String] = js.native
  
  /**
    * Identifies the payment request type. This type defines how the payment request amount is determined.
    * See [InvoiceRequestType](#type-invoicerequesttype) for possible values.
    */
  var request_type: js.UndefOr[String] = js.native
  
  /**
    * If the most recent payment was a cash payment in a currency that rounds cash payments (such as, `CAD` or `AUD`)
    * and the payment  is rounded from `computed_amount_money` in the payment request, then this field specifies the
    * rounding adjustment applied. This amount  might be negative.
    */
  var rounding_adjustment_included_money: js.UndefOr[Money] = js.native
  
  /**
    * If set to true, the Square-hosted invoice page (the `public_url` field of the invoice) provides a place for the customer to pay a tip.
    * This field is allowed only on the final payment request and the payment `request_type` must be `BALANCE` or `INSTALLMENT`.
    */
  var tipping_enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The amount of money already paid for the specific payment request.
    * This amount might include a rounding adjustment if the most recent invoice payment was in cash in a currency
    * that rounds cash payments (such as, `CAD` or `AUD`).
    */
  var total_completed_amount_money: js.UndefOr[Money] = js.native
  
  /**
    * The Square-generated ID of the payment request in an `invoice`.
    */
  var uid: js.UndefOr[String] = js.native
}

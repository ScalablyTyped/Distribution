package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "Invoice")
@js.native
class Invoice () extends StObject {
  
  /**
    * The timestamp when the invoice was created, in RFC 3339 format.
    */
  var created_at: js.UndefOr[String] = js.native
  
  /**
    * The description of the invoice. This is visible the customer receiving the invoice.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The Square-assigned ID of the invoice.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * A user-friendly invoice number. The value is unique within a location.
    * If not provided when creating an invoice, Square assigns a value.
    * It increments from 1 and padded with zeros making it 7 characters long for example, 0000001, 0000002.
    */
  var invoice_number: js.UndefOr[String] = js.native
  
  /**
    * The ID of the location that this invoice is associated with. This field is required when creating an invoice.
    */
  var location_id: js.UndefOr[String] = js.native
  
  /**
    * The current amount due for the invoice.
    * In addition to the amount due on the next payment request, this also includes any overdue payment amounts.
    */
  var next_payment_amount_money: js.UndefOr[Money] = js.native
  
  /**
    * The ID of the `order` for which the invoice is created.
    * This order must be in the `OPEN` state and must belong to the `location_id` specified for this invoice.
    * This field is required when creating an invoice.
    */
  var order_id: js.UndefOr[String] = js.native
  
  /**
    * An array of `InvoicePaymentRequest` objects. Each object defines a payment request in an invoice payment schedule.
    * It provides information such as when and how Square processes payments. You must specify at least one payment request.
    * For invoices  with multiple payment requests, you can specify a maximum of 12 `INSTALLMENT` request types.
    * All of the payment requests must specify the same `request_method`. This field is required when creating an invoice.
    */
  var payment_requests: js.UndefOr[js.Array[InvoicePaymentRequest]] = js.native
  
  /**
    * The customer who gets the invoice. Square uses the contact information to deliver the invoice.
    * This field is required to publish an invoice.
    */
  var primary_recipient: js.UndefOr[InvoiceRecipient] = js.native
  
  /**
    * The URL of the Square-hosted invoice page. After you publish the invoice using the `PublishInvoice` endpoint,
    * Square hosts the invoice page and returns the page URL in the response.
    */
  var public_url: js.UndefOr[String] = js.native
  
  /**
    * The timestamp when the invoice is scheduled for processing, in RFC 3339 format. At the specified time, depending
    * on the `request_method`, Square sends the invoice to the customer's email address or charge the customer's card on file.
    * If the field is not set, Square processes the invoice immediately after publication.
    */
  var scheduled_at: js.UndefOr[String] = js.native
  
  /**
    * The status of the invoice. See [InvoiceStatus](#type-invoicestatus) for possible values
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The time zone of the date values (for example, `due_date`) specified in the invoice.
    */
  var timezone: js.UndefOr[String] = js.native
  
  /**
    * The title of the invoice.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The timestamp when the invoice was last updated, in RFC 3339 format.
    */
  var updated_at: js.UndefOr[String] = js.native
  
  /**
    * The Square-assigned version number, which is incremented each time an update is committed to the invoice.
    */
  var version: js.UndefOr[Double] = js.native
}

package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "InvoicePaymentReminder")
@js.native
class InvoicePaymentReminder () extends js.Object {
  
  /**
    * The reminder message.
    */
  var message: js.UndefOr[String] = js.native
  
  /**
    * The number of days before (a negative number) or after (a positive number) the payment request `due_date` when the reminder is sent.
    * For example, -3 indicates that the reminder should be sent 3 days before the payment request `due_date`.
    */
  var relative_scheduled_days: js.UndefOr[Double] = js.native
  
  /**
    * If sent, the timestamp when the reminder was sent, in RFC 3339 format.
    */
  var sent_at: js.UndefOr[String] = js.native
  
  /**
    * The status of the reminder. See [InvoicePaymentReminderStatus](#type-invoicepaymentreminderstatus) for possible values.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * A Square-assigned ID that uniquely identifies the reminder within the `InvoicePaymentRequest`.
    */
  var uid: js.UndefOr[String] = js.native
}

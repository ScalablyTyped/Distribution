package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "UpdateInvoiceRequest")
@js.native
class UpdateInvoiceRequest () extends StObject {
  
  /**
    * List of fields to clear.
    * For examples, see [Update an invoice](https://developer.squareup.com/docs/docs/invoices-api/overview#update-an-invoice).
    */
  var fields_to_clear: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A unique string that identifies the `UpdateInvoice` request. If you do not provide `idempotency_key`
    * (or provide an empty string as the value), the endpoint treats each request as independent.
    * For more information, see [Idempotency](https://developer.squareup.com/docs/docs/working-with-apis/idempotency).
    */
  var idempotency_key: js.UndefOr[String] = js.native
  
  /**
    * The invoice fields to update. You need to only specify the fields you want to change.
    * The current invoice version must be specified in the `version` field.
    * For more information, see [Update an invoice](https://developer.squareup.com/docs/docs/invoices-api/overview#update-an-invoice).
    */
  var invoice: Invoice = js.native
}

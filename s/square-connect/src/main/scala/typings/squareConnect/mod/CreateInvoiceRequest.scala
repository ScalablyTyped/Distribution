package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CreateInvoiceRequest")
@js.native
open class CreateInvoiceRequest () extends StObject {
  
  /**
    * A unique string that identifies the `CreateInvoice` request.
    * If you do not provide `idempotency_key` (or provide an empty string as the value), the endpoint treats each request as independent.
    * For more information, see [Idempotency](https://developer.squareup.com/docs/docs/working-with-apis/idempotency).
    */
  var idempotency_key: js.UndefOr[String] = js.native
  
  /**
    * The invoice to create.
    */
  var invoice: Invoice = js.native
}

package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "PublishInvoiceRequest")
@js.native
open class PublishInvoiceRequest () extends StObject {
  
  /**
    * A unique string that identifies the `PublishInvoice` request.
    * If you do not provide `idempotency_key` (or provide an empty string as the value), the endpoint  treats each request as independent.
    * For more information, see [Idempotency](https://developer.squareup.com/docs/docs/working-with-apis/idempotency).
    */
  var idempotency_key: js.UndefOr[String] = js.native
  
  /**
    * The version of the `Invoice` to publish. This must match the current version of the invoice, otherwise the request is rejected.
    */
  var version: Double = js.native
}

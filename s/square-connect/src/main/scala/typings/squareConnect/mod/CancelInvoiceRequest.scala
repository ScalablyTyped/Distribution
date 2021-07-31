package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CancelInvoiceRequest")
@js.native
class CancelInvoiceRequest () extends StObject {
  
  /**
    * The version of the `invoice` to cancel.
    * If you do not know the version, you can call `GetInvoice](#endpoint-Invoices-GetInvoice) or [ListInvoices`.
    */
  var version: Double = js.native
}

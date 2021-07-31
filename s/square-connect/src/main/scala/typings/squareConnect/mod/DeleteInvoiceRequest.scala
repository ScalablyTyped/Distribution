package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "DeleteInvoiceRequest")
@js.native
class DeleteInvoiceRequest () extends StObject {
  
  /**
    * The version of the `invoice` to delete. If you do not know the version, you can call `GetInvoice` or `ListInvoices`.
    */
  var version: js.UndefOr[Double] = js.native
}

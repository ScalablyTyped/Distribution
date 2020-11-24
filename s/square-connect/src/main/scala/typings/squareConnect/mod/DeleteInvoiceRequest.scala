package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "DeleteInvoiceRequest")
@js.native
class DeleteInvoiceRequest () extends js.Object {
  
  /**
    * The version of the `invoice` to delete. If you do not know the version, you can call `GetInvoice` or `ListInvoices`.
    */
  var version: js.UndefOr[Double] = js.native
}

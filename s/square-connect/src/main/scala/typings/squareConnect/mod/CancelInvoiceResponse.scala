package typings.squareConnect.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CancelInvoiceResponse")
@js.native
class CancelInvoiceResponse () extends js.Object {
  
  /**
    * Information about errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  
  /**
    * The canceled invoice.
    */
  var invoice: js.UndefOr[Invoice] = js.native
}

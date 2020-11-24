package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "InvoiceQuery")
@js.native
class InvoiceQuery () extends js.Object {
  
  /**
    * Query filters to apply in searching invoices.
    * For more information, see [Retrieve invoices](https://developer.squareup.com/docs/docs/invoices-api/overview#retrieve-invoices).
    */
  var filter: InvoiceFilter = js.native
  
  /**
    * Describes the sort order for the search result.
    */
  var sort: js.UndefOr[InvoiceSort] = js.native
}

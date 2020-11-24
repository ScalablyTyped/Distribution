package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SearchInvoicesRequest")
@js.native
class SearchInvoicesRequest () extends js.Object {
  
  /**
    * A pagination cursor returned by a previous call to this endpoint.
    * Provide this cursor to retrieve the next set of results for your original query.
    * For more information, see [Pagination](https://developer.squareup.com/docs/docs/working-with-apis/pagination).
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of invoices to return (200 is the maximum `limit`).
    * If not provided, the server uses a default limit of 100 invoices.
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * Describes the query criteria for searching invoices.
    */
  var query: InvoiceQuery = js.native
}

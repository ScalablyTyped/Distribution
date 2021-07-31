package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListInvoicesRequest")
@js.native
class ListInvoicesRequest () extends StObject {
  
  /**
    * A pagination cursor returned by a previous call to this endpoint.
    * Provide this cursor to retrieve the next set of results for your original query.
    * For more information, see [Pagination](https://developer.squareup.com/docs/docs/working-with-apis/pagination).
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of invoices to return (200 is the maximum `limit`).
    * If not provided, the server  uses a default limit of 100 invoices.
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * The ID of the location for which to list invoices.
    */
  var location_id: String = js.native
}

package typings.squareConnect.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SearchCustomersResponse")
@js.native
class SearchCustomersResponse () extends StObject {
  
  /**
    * A pagination cursor that can be used during subsequent calls to SearchCustomers to retrieve the next set of results
    * associated with the original query. Pagination cursors are only present when a request succeeds and additional
    * results are available.
    * See the [Pagination guide](https://developer.squareup.com/docs/working-with-apis/pagination) for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * An array of `Customer` objects that match a query.
    */
  var customers: js.UndefOr[js.Array[Customer]] = js.native
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
}

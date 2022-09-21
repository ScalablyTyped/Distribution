package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SearchCustomersRequest")
@js.native
open class SearchCustomersRequest () extends StObject {
  
  /**
    * Include the pagination cursor in subsequent calls to this endpoint to retrieve the next set of results associated with the original query.
    * See the [Pagination guide](https://developer.squareup.com/docs/working-with-apis/pagination) for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * A limit on the number of results to be returned in a single page.
    * The limit is advisory - the implementation may return more or fewer results. If the supplied limit is negative,
    * zero, or is higher than the maximum limit of 100, it will be ignored.
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * Query customers based on the given conditions and sort order. Calling SearchCustomers without an explicit query
    * parameter will return all customers ordered alphabetically based on `given_name` and `family_name`.
    */
  var query: js.UndefOr[CustomerQuery] = js.native
}

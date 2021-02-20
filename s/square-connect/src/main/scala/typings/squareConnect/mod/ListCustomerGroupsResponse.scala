package typings.squareConnect.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListCustomerGroupsResponse")
@js.native
class ListCustomerGroupsResponse () extends StObject {
  
  /**
    * A pagination cursor to retrieve the next set of results for your original query to the endpoint.
    * This value is present only if the request succeeded and additional results are available.
    * See the [Pagination guide](https://developer.squareup.com/docs/working-with-apis/pagination) for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  
  /**
    * A list of customer groups belonging to the current merchant.
    */
  var groups: js.UndefOr[js.Array[CustomerGroup]] = js.native
}

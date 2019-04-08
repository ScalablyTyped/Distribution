package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ListCustomersResponse")
@js.native
class ListCustomersResponse () extends js.Object {
  /**
    * A pagination cursor to retrieve the next set of results for your original query to the endpoint. This value is
    * present only if the request succeeded and additional results are available.  See
    * [Pagination](/basics/api101/pagination) for more information.
    */
  var cursor: js.UndefOr[java.lang.String] = js.native
  /**
    * An array of `Customer` objects that match your query.
    */
  var customers: js.UndefOr[js.Array[Customer]] = js.native
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[stdLib.Error]] = js.native
}


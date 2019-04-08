package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1ListOrdersRequest")
@js.native
class V1ListOrdersRequest () extends js.Object {
  /**
    * A pagination cursor to retrieve the next set of results for your original query to the endpoint.
    */
  var batch_token: js.UndefOr[java.lang.String] = js.native
  /**
    * The maximum number of payments to return in a single response. This value cannot exceed 200.
    */
  var limit: js.UndefOr[scala.Double] = js.native
  /**
    * TThe order in which payments are listed in the response. See [SortOrder](#type-sortorder) for possible values
    */
  var order: js.UndefOr[squareDashConnectLib.squareDashConnectMod.V1ListOrdersRequestNs.OrderEnum] = js.native
}


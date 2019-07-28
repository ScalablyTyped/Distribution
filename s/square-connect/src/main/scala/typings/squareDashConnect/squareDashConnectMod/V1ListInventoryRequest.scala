package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1ListInventoryRequest")
@js.native
class V1ListInventoryRequest () extends js.Object {
  /**
    * A pagination cursor to retrieve the next set of results for your original query to the endpoint.
    */
  var batch_token: js.UndefOr[String] = js.native
  /**
    * The maximum number of inventory entries to return in a single response. This value cannot exceed 1000.
    */
  var limit: js.UndefOr[Double] = js.native
}


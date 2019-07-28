package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.V1ListSettlementsRequestNs.OrderEnum
import typings.squareDashConnect.squareDashConnectMod.V1ListSettlementsRequestNs.StatusEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1ListSettlementsRequest")
@js.native
class V1ListSettlementsRequest () extends js.Object {
  /**
    * A pagination cursor to retrieve the next set of results for your original query to the endpoint.
    */
  var batch_token: js.UndefOr[String] = js.native
  /**
    * The beginning of the requested reporting period, in ISO 8601 format. If this value is before January 1, 2013
    * (2013-01-01T00:00:00Z), this endpoint returns an error. Default value: The current time minus one year.
    */
  var begin_time: js.UndefOr[String] = js.native
  /**
    * The end of the requested reporting period, in ISO 8601 format. If this value is more than one year greater than
    * begin_time, this endpoint returns an error. Default value: The current time.
    */
  var end_time: js.UndefOr[String] = js.native
  /**
    * The maximum number of payments to return in a single response. This value cannot exceed 200.
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * TThe order in which payments are listed in the response. See [SortOrder](#type-sortorder) for possible values
    */
  var order: js.UndefOr[OrderEnum] = js.native
  /**
    * Provide this parameter to retrieve only settlements with a particular status (SENT or FAILED).
    * See [V1ListSettlementsRequestStatus](#type-v1listsettlementsrequeststatus) for possible values
    */
  var status: js.UndefOr[StatusEnum] = js.native
}


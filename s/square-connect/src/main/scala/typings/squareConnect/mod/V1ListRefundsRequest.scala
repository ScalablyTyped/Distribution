package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1ListRefundsRequest")
@js.native
class V1ListRefundsRequest () extends js.Object {
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
    * The approximate number of refunds to return in a single response. Default: 100. Max: 200. Response may contain
    * more results than the prescribed limit when refunds are made simultaneously to multiple tenders in a payment or
    * when refunds are generated in an exchange to account for the value of returned goods.
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * TThe order in which payments are listed in the response. See [SortOrder](#type-sortorder) for possible values
    */
  var order: js.UndefOr[String] = js.native
}


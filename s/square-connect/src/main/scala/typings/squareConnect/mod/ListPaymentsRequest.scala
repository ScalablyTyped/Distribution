package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ListPaymentsRequest")
@js.native
class ListPaymentsRequest () extends js.Object {
  /**
    * Timestamp for the beginning of the reporting period, in RFC 3339 format. Inclusive.
    * Default: The current time minus one year.
    */
  var begin_time: js.UndefOr[String] = js.native
  /**
    * The brand of `Payment` card. For example, `VISA`.
    */
  var card_brand: js.UndefOr[CardBrandType] = js.native
  /**
    * A pagination cursor returned by a previous call to this endpoint. Provide this to retrieve the next set of results for the original query.
    * See [Pagination](https://developer.squareup.com/docs/basics/api101/pagination) for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * Timestamp for the end of the requested reporting period, in RFC 3339 format. Default: The current time.
    */
  var end_time: js.UndefOr[String] = js.native
  /**
    * The last 4 digits of `Payment` card.
    */
  var last_4: js.UndefOr[String] = js.native
  /**
    * Limit results to the location supplied. By default, results are returned for all locations associated with the merchant.
    */
  var location_id: js.UndefOr[String] = js.native
  /**
    * The order in which results are listed. - `ASC` - oldest to newest - `DESC` - newest to oldest (default).
    */
  var sort_order: js.UndefOr[String] = js.native
  /**
    * The exact amount in the total_money for a `Payment`.
    */
  var total: js.UndefOr[Double] = js.native
}


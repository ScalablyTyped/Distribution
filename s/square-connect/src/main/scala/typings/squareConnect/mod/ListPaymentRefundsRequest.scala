package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListPaymentRefundsRequest")
@js.native
class ListPaymentRefundsRequest () extends js.Object {
  
  /**
    * Timestamp for the beginning of the requested reporting period, in RFC 3339 format.
    * Default: The current time minus one year.
    */
  var begin_time: js.UndefOr[String] = js.native
  
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
    * Maximum number of results to be returned in a single page.
    * It is possible to receive fewer results than the specified limit on a given page.
    * If the supplied value is greater than 100, at most 100 results will be returned. Default: `100`
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * Limit results to the location supplied. By default, results are returned for all locations associated with the merchant.
    */
  var location_id: js.UndefOr[String] = js.native
  
  /**
    * The order in which results are listed. - `ASC` - oldest to newest - `DESC` - newest to oldest (default).
    */
  var sort_order: js.UndefOr[SortOrderType] = js.native
  
  /**
    * If provided, only refunds with the given source type are returned.
    * - `CARD` - List refunds only for payments where card was specified as payment source.
    * Default: If omitted refunds are returned regardless of source type.
    */
  var source_type: js.UndefOr[String] = js.native
  
  /**
    * If provided, only refunds with the given status are returned. For a list of refund status values, see `PaymentRefund`.
    * Default: If omitted refunds are returned regardless of status.
    */
  var status: js.UndefOr[String] = js.native
}

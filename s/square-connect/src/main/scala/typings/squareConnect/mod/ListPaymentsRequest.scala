package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListPaymentsRequest")
@js.native
open class ListPaymentsRequest () extends StObject {
  
  /**
    * The timestamp for the beginning of the reporting period, in RFC 3339 format. Inclusive. Default: The current time minus one year.
    */
  var begin_time: js.UndefOr[String] = js.native
  
  /**
    * The brand of the payment card (for example, VISA).
    */
  var card_brand: js.UndefOr[CardBrandType] = js.native
  
  /**
    * A pagination cursor returned by a previous call to this endpoint.
    * Provide this cursor to retrieve the next set of results for the original query.
    * For more information, see [Pagination](https://developer.squareup.com/docs/basics/api101/pagination).
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * The timestamp for the end of the reporting period, in RFC 3339 format. Default: The current time.
    */
  var end_time: js.UndefOr[String] = js.native
  
  /**
    * The last four digits of a payment card.
    */
  var last_4: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of results to be returned in a single page.
    * It is possible to receive fewer results than the specified limit on a given page.
    * The default value of 100 is also the maximum allowed value. If the provided value is greater than 100, it is
    * ignored and the default value is used instead. Default: `100`
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * Limit results to the location supplied.
    * By default, results are returned for the default (main) location associated with the seller.
    */
  var location_id: js.UndefOr[String] = js.native
  
  /**
    * The order in which results are listed: - `ASC` - Oldest to newest. - `DESC` - Newest to oldest (default).
    */
  var sort_order: js.UndefOr[String] = js.native
  
  /**
    * The exact amount in the `total_money` for a payment.
    */
  var total: js.UndefOr[Double] = js.native
}

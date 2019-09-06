package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "SearchOrdersFilter")
@js.native
class SearchOrdersFilter () extends js.Object {
  /**
    * Filter by customers associated with the order.
    */
  var customer_filter: js.UndefOr[SearchOrdersCustomerFilter] = js.native
  /**
    * Filter for results within a time range.
    * @note If you filter for orders by time range, you must set SearchOrdersSort to sort by the same field.
    * [Learn more about filtering orders by time range](/orders-api/manage-orders#important-note-on-filtering-orders-by-time-range).
    */
  var date_time_filter: js.UndefOr[SearchOrdersDateTimeFilter] = js.native
  /**
    * Filter by fulfillment type or state.
    */
  var fulfillment_filter: js.UndefOr[SearchOrdersFulfillmentFilter] = js.native
  /**
    * Filter by source of order.
    */
  var source_filter: js.UndefOr[SearchOrdersSourceFilter] = js.native
  /**
    * Filter by [`OrderState`](#type-orderstate).
    */
  var state_filter: js.UndefOr[SearchOrdersStateFilter] = js.native
}

